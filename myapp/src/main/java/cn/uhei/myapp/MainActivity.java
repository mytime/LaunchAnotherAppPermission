package cn.uhei.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 请求启动另外一个app
 * 1 启动权限
 * 2 指定Uri
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //按钮监听
        findViewById(R.id.btnLaunchAnotherApp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //启动另外一个App
                startActivity(new Intent("cn.uhei.launchanotherapp.intent.action" +
                        ".MainActivity"));
            }
        });
    }
}
