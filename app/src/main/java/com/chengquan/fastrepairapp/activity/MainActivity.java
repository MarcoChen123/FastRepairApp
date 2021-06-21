package com.chengquan.fastrepairapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.chengquan.fastrepairapp.R;
import com.chengquan.fastrepairapp.activity.repairmall.EngineerSearchActivity;
import com.chengquan.fastrepairapp.activity.vip.VipRegisterActivity;
import com.chengquan.framework.baseactivity.BaseActivity;


public class MainActivity extends BaseActivity {
	private Button btn1, btn2;

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
	}

}
