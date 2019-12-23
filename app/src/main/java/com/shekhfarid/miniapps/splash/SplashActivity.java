package com.shekhfarid.miniapps.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;

import com.shekhfarid.miniapps.MainActivity;
import com.shekhfarid.miniapps.R;
import com.shekhfarid.miniapps.action_bar.Action_barActivity;



public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        CountDownTimer timer=new CountDownTimer(3000,3000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.d("checktick","Ticked!");

            }

            @Override
            public void onFinish() {
                Intent intent=new Intent(SplashActivity.this, Action_barActivity.class);
                startActivity(intent);
                finish();
            }
        };
        timer.start();


    }
}



