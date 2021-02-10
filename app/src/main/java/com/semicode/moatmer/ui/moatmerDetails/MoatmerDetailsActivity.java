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

import com.semicode.moatmer.R;
import com.semicode.moatmer.adapter.ViewPagerWithFragmentAdapter;
import com.semicode.moatmer.data.model.moatmer.MoatmerModelData;
import com.semicode.moatmer.databinding.ActivityKeblaBinding;
import com.semicode.moatmer.databinding.ActivityMoatmerDetailsBinding;
import com.semicode.moatmer.mvp.keblaActivit.ActivityKeblaPresenter;
import com.semicode.moatmer.mvp.keblaActivit.ActivityKeblaView;
import com.semicode.moatmer.mvp.userDetails.ActivityUserDetailsPresenter;
import com.semicode.moatmer.mvp.userDetails.ActivityUserDetailsView;
import com.semicode.moatmer.share.HelperMethod;

import java.util.Objects;

public class MoatmerDetailsActivity extends AppCompatActivity implements ActivityUserDetailsView {
    ActivityMoatmerDetailsBinding binding;
    ActivityUserDetailsPresenter presenter;
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
        presenter = new ActivityUserDetailsPresenter(this, this, userId);
        adapter = new ViewPagerWithFragmentAdapter(getSupportFragmentManager());
        binding.viewPager.setAdapter(adapter);
        binding.tabLayout.setupWithViewPager(binding.viewPager);

        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());
        setupTabIcons();
    }
    private void setupTabIcons() {
        Objects.requireNonNull(binding.tabLayout.getTabAt(0)).setIcon(R.drawable.ic_hram_gray);
        binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_hram_gray);
    }

    private void getDataFromIntent() {
        userId = getIntent().getIntExtra("USER_ID", 0);
        HelperMethod.makeTextToast(this, userId + " user id ");
    }


    @Override
    public void onLoad() {

    }

    @Override
    public void onLoadMoatmer(MoatmerModelData moatmerModelData) {
        binding.setMoatmerModel(moatmerModelData);

    }

    @Override
    public void onFailed(String message) {
        HelperMethod.makeTextToast(this, message);
    }

    @Override
    public void onFinish() {

    }

    @Override
    public void onFailure(String message) {
        HelperMethod.makeTextToast(this, "on Failure " + message);

    }
}