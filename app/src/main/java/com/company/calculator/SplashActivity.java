package com.company.calculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import gr.net.maroulis.library.EasySplashScreen;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EasySplashScreen config = new EasySplashScreen(SplashActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(7000)
                .withBackgroundColor(Color.parseColor("#1a1b29"))
                .withBeforeLogoText("Kalkulator stężeń")
                .withAfterLogoText("Autorzy:\nMateusz Kubisiak\nArkadiusz Szafrański")
                .withLogo(R.mipmap.ic_launcher_round);

        config.getBeforeLogoTextView().setTextSize(20);
        config.getBeforeLogoTextView().setTextColor(Color.WHITE);
        config.getAfterLogoTextView().setTextColor(Color.WHITE);
        View easySplashScreen = config.create();
        setContentView(easySplashScreen);
    }
}
