package com.semicode.moatmer.ui.moatmerDetails;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.semicode.moatmer.adapter.ViewPagerWithFragmentAdapter;
import com.semicode.moatmer.databinding.ActivityKeblaBinding;
import com.semicode.moatmer.databinding.ActivityMoatmerDetailsBinding;
import com.semicode.moatmer.mvp.keblaActivit.ActivityKeblaPresenter;
import com.semicode.moatmer.mvp.keblaActivit.ActivityKeblaView;
import com.semicode.moatmer.share.HelperMethod;

public class MoatmerDetailsActivity extends AppCompatActivity {
    ActivityMoatmerDetailsBinding binding;
    ViewPagerWithFragmentAdapter adapter;
    int userId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMoatmerDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();

    }


    private void init() {
        getDataFromIntent();
        adapter = new ViewPagerWithFragmentAdapter(getSupportFragmentManager());
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());

    }

    private void getDataFromIntent() {
        userId = getIntent().getIntExtra("USER_ID", 0);
        HelperMethod.makeTextToast(this, userId + " user id ");
    }


}