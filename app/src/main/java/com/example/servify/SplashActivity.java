package com.example.servify;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView iv = findViewById(R.id.iv_splash);
        Animation splash = AnimationUtils.loadAnimation(this, R.anim.splash_animation);

        iv.startAnimation(splash);
        int SPLASH_TIME_OUT = 500;
        new android.os.Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            finish();
        }, SPLASH_TIME_OUT);
    }
}
