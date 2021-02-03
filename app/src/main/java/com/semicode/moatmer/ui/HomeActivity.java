package com.semicode.moatmer.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.data.model.prayerTimes.PrayerTimesModel;
import com.semicode.moatmer.data.model.prayerTimes.Timings;
import com.semicode.moatmer.databinding.ActivityHomeBinding;
import com.semicode.moatmer.mvp.homeActivity.ActivityHomePresenter;
import com.semicode.moatmer.mvp.homeActivity.ActivityHomeView;
import com.semicode.moatmer.share.HelperMethod;

public class HomeActivity extends AppCompatActivity implements ActivityHomeView {
    ActivityHomeBinding binding;
    ActivityHomePresenter presenter;
    Timings timings = new Timings();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();


    }

    private void init() {
        binding.homeLayPrayerTime.setOnClickListener(v -> openPrayerActivity());
        binding.homeLaySebha.setOnClickListener(v -> openSebhaActivity());
        presenter = new ActivityHomePresenter(this, this);

    }

    private void openPrayerActivity() {
        Intent intent = new Intent(this, PrayerTimesActivity.class);
        intent.putExtra("PRAYER_TIMES", timings);
        startActivity(intent);
    }

    private void openSebhaActivity() {
        Intent intent = new Intent(this, SebhaActivity.class);
        startActivity(intent);
    }

    @Override
    public void onGetPrayerTimes(PrayerTimesModel body) {
        timings = body.getData().getTimings();
        HelperMethod.makeTextToast(this, timings.getDhuhr());

    }

    @Override
    public void onFailed(String message) {
        HelperMethod.makeTextToast(this, message);
    }

    @Override
    public void onFailure(String message) {
        HelperMethod.makeTextToast(this, message);

    }
}