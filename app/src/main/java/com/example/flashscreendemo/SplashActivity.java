package com.example.flashscreendemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.RenderNode;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        int delayMillis;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
startActivity(new Intent(SplashActivity.this, MainActivity.class));
finish();
            }
        },delayMillis = 4000);
    }
}