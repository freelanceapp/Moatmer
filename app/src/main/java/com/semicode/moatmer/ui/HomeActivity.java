package com.semicode.moatmer.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.databinding.ActivityHomeBinding;
import com.semicode.moatmer.databinding.ActivitySplashBinding;

public class HomeActivity extends AppCompatActivity {
    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.homeLayPrayerTime.setOnClickListener(v -> openPrayerActivity());


    }

    private void openPrayerActivity() {
        Intent intent = new Intent(this, PrayerTimesActivity.class);
        startActivity(intent);
    }
}