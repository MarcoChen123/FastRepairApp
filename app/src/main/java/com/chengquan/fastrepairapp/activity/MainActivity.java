package com.chengquan.fastrepairapp.activity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.login.LoginActivity;
import com.chengquan.fastrepairapp.activity.repairmall.EngineerSearchActivity;
import com.chengquan.fastrepairapp.activity.vip.VipRegisterActivity;
import com.chengquan.framework.baseactivity.BaseActivity;
import com.chengquan.framework.util.ImagePickerUtil;
import com.chengquan.framework.util.SystemUtil;
import com.lzy.imagepicker.ImagePicker;
import com.lzy.imagepicker.bean.ImageItem;
import com.tbruyelle.rxpermissions3.RxPermissions;

import java.util.ArrayList;


public class MainActivity extends BaseActivity {
    private static final int IMAGE_PICKER = 1;
    private static final int REQUEST_CODE_SELECT = 2;

    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState, R.layout.activity_main,"首页");

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EngineerSearchActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VipRegisterActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImagePickerUtil.goAlbum(MainActivity.this, IMAGE_PICKER);
            }
        });

        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImagePickerUtil.goCamera(MainActivity.this, REQUEST_CODE_SELECT);
            }
        });

        RxPermissions rxPermissions = new RxPermissions(this);
        rxPermissions
                .request(Manifest.permission.CAMERA).subscribe(granted -> {
            if (granted) { // Always true pre-M
                SystemUtil.printlnInfo("权限获取");
            } else {
                SystemUtil.printlnInfo("权限未获取");
            }
        });

	}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == ImagePicker.RESULT_CODE_ITEMS) {
            if (data != null && (requestCode == IMAGE_PICKER || requestCode == REQUEST_CODE_SELECT)) {
                ArrayList<ImageItem> images = (ArrayList<ImageItem>) data.getSerializableExtra(ImagePicker.EXTRA_RESULT_ITEMS);
                SystemUtil.printlnInfo(images.toString());
            } else {
                Toast.makeText(this, "没有数据", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
