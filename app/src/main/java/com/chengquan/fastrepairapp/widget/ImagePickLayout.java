package com.chengquan.fastrepairapp.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.chengquan.fastrepairapp.activity.MainActivity;
import com.chengquan.fastrepairapp.impl.OnPickListener;
import com.chengquan.framework.util.ImagePickerUtil;
import com.chengquan.framework.util.SystemUtil;
import com.lzy.imagepicker.ImagePicker;
import com.lzy.imagepicker.bean.ImageItem;
import com.qmuiteam.qmui.skin.QMUISkinManager;
import com.qmuiteam.qmui.widget.dialog.QMUIBottomSheet;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ImagePickLayout extends FrameLayout implements OnPickListener {
    private static final int IMAGE_PICKER = 1;
    private static final int REQUEST_CODE_SELECT = 2;

    private ImagePickRecyclerView imagePickRecyclerView;

    public ImagePickLayout(@NonNull Context context) {
        super(context);
        init();
    }

    public ImagePickLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ImagePickLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        imagePickRecyclerView = new ImagePickRecyclerView(getContext());
        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        addView(imagePickRecyclerView, params);

        List<ImageItem> list = new ArrayList<>();
        list.add(null);
        imagePickRecyclerView.setAdapter(list);
        imagePickRecyclerView.setOnPickListener(this);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == ImagePicker.RESULT_CODE_ITEMS) {
            if (data != null && (requestCode == IMAGE_PICKER || requestCode == REQUEST_CODE_SELECT)) {
                ArrayList<ImageItem> images = (ArrayList<ImageItem>) data.getSerializableExtra(ImagePicker.EXTRA_RESULT_ITEMS);
                images.add(null);
                imagePickRecyclerView.setAdapter(images);
            } else {
                Toast.makeText(getContext(), "没有数据", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onPick() {
//        showSimpleBottomSheetList(
//                false, false, false, null,
//                3, false, false);
        new QMUIBottomSheet.BottomListSheetBuilder(getContext())
                .addItem("拍照")
                .addItem("相册")
                .setGravityCenter(true)
                .setOnSheetItemClickListener(new QMUIBottomSheet.BottomListSheetBuilder.OnSheetItemClickListener() {
                    @Override
                    public void onClick(QMUIBottomSheet dialog, View itemView, int position, String tag) {
                        if(position == 0){
                            ImagePickerUtil.goCamera((Activity) getContext(), REQUEST_CODE_SELECT);
                        } else {
                            ImagePickerUtil.goAlbum((Activity) getContext(), IMAGE_PICKER);
                        }
                        dialog.dismiss();
                    }
                }).build().show();
    }

    private void showSimpleBottomSheetList(boolean gravityCenter,
                                           boolean addCancelBtn,
                                           boolean withIcon,
                                           CharSequence title,
                                           int itemCount,
                                           boolean allowDragDismiss,
                                           boolean withMark) {
        QMUIBottomSheet.BottomListSheetBuilder builder = new QMUIBottomSheet.BottomListSheetBuilder(getContext());
        builder.setGravityCenter(gravityCenter)
                .setSkinManager(QMUISkinManager.defaultInstance(getContext()))
                .setTitle(title)
                .setAddCancelBtn(addCancelBtn)
                .setAllowDrag(allowDragDismiss)
                .setNeedRightMark(withMark)
                .setOnSheetItemClickListener(new QMUIBottomSheet.BottomListSheetBuilder.OnSheetItemClickListener() {
                    @Override
                    public void onClick(QMUIBottomSheet dialog, View itemView, int position, String tag) {
                        dialog.dismiss();
                        Toast.makeText(getContext(), "Item " + (position + 1), Toast.LENGTH_SHORT).show();
                    }
                });
        if(withMark){
            builder.setCheckedIndex(40);
        }
        for (int i = 1; i <= itemCount; i++) {

                builder.addItem("Item " + i);

        }
        builder.build().show();
    }
}
