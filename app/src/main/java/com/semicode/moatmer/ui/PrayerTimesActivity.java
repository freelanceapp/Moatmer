package com.semicode.moatmer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.databinding.ActivityHomeBinding;
import com.semicode.moatmer.databinding.ActivityPrayerTimesBinding;

public class PrayerTimesActivity extends AppCompatActivity {
    ActivityPrayerTimesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrayerTimesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());


    }
}