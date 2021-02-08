package com.semicode.moatmer.ui;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.data.model.NextPray;
import com.semicode.moatmer.data.model.prayerTimes.PrayerTimesModel;
import com.semicode.moatmer.data.model.prayerTimes.Timings;
import com.semicode.moatmer.databinding.ActivityHomeBinding;
import com.semicode.moatmer.mvp.homeActivity.ActivityHomePresenter;
import com.semicode.moatmer.mvp.homeActivity.ActivityHomeView;
import com.semicode.moatmer.share.HelperMethod;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HomeActivity extends AppCompatActivity implements ActivityHomeView {
    ActivityHomeBinding binding;
    ActivityHomePresenter presenter;
    Timings timings = new Timings();
    String currentTime;
    private Date time;
    String city = "Riyadh", country = "Saudi Arabia";

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
        binding.homeLayAzkar.setOnClickListener(v -> openAzkarActivity());
        binding.homeLayKebla.setOnClickListener(v -> openKeblaActivity());
        binding.homeLayUmrah.setOnClickListener(v -> openUmrahRequestActivity());
        binding.setCity(city);
        time = Calendar.getInstance().getTime();
        currentTime = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(time);


//        String pattern = "HH:mm";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//        try {
//            date = simpleDateFormat.parse(currentTime);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        presenter = new ActivityHomePresenter(this, this, city, country);

    }

    private void openUmrahRequestActivity() {
        Intent intent = new Intent(this, UmrahReguestActivity.class);
        startActivity(intent);
    }

    private void openKeblaActivity() {
        Intent intent = new Intent(this, KeblaActivity.class);
        startActivity(intent);
    }

    private void openAzkarActivity() {
        Intent intent = new Intent(this, AzkarActivity.class);
        startActivity(intent);
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
        NextPray nextPray = NextPray.getNextPray(this, "16:00", body.getData().getTimings());

        binding.setNextPray(nextPray);
//        HelperMethod.makeTextToast(this, timings.getDhuhr());
        HelperMethod.makeTextToast(this, body.getData().getMeta().getOffset().getFajr() + "");

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