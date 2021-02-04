package com.semicode.moatmer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.data.model.NextPray;
import com.semicode.moatmer.data.model.prayerTimes.Timings;
import com.semicode.moatmer.databinding.ActivityHomeBinding;
import com.semicode.moatmer.databinding.ActivityPrayerTimesBinding;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PrayerTimesActivity extends AppCompatActivity {
    ActivityPrayerTimesBinding binding;
    Timings timingsModel;
    String currentTime;
    private Date time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrayerTimesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();


    }

    private void init() {
        time = Calendar.getInstance().getTime();
        currentTime = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(time);
        getDataFromIntent();
        binding.setPrayerTimes(timingsModel);
        binding.setCity("Riyadh");


        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());

    }

    private void getDataFromIntent() {
        timingsModel = (Timings) getIntent().getSerializableExtra("PRAYER_TIMES");
        NextPray nextPray = NextPray.getNextPray(this, currentTime, timingsModel);

        binding.setNextPray(nextPray);

    }
}