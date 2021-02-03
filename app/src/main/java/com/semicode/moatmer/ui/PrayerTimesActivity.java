package com.semicode.moatmer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.data.model.prayerTimes.Timings;
import com.semicode.moatmer.databinding.ActivityHomeBinding;
import com.semicode.moatmer.databinding.ActivityPrayerTimesBinding;

public class PrayerTimesActivity extends AppCompatActivity {
    ActivityPrayerTimesBinding binding;
    Timings timingsModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrayerTimesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();


    }

    private void init() {
        getDataFromIntent();
        binding.setPrayerTimes(timingsModel);
        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());

    }

    private void getDataFromIntent() {
        timingsModel = (Timings) getIntent().getSerializableExtra("PRAYER_TIMES");

    }
}