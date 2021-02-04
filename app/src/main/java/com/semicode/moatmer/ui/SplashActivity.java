package com.semicode.moatmer.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.semicode.moatmer.data.local.SharedPreferencesManger;
import com.semicode.moatmer.databinding.ActivitySplashBinding;

public class SplashActivity extends AppCompatActivity {
    ActivitySplashBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        SharedPreferencesManger.setSharedPreferences(this);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

//                TextUtils.isEmpty(userToken)

                if (false) {

//                    Intent mainIntent = new Intent(SplashActivity.this, HomeActivity.class);
//                    startActivity(mainIntent);
//                    finish();


                } else {
                    Intent intent = new Intent(SplashActivity.this, HomeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        }, 1000);

    }
}