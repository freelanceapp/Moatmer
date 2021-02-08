package com.semicode.moatmer.ui;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.adapter.AzkarAdapter;
import com.semicode.moatmer.data.model.azkar.AzkarData;
import com.semicode.moatmer.databinding.ActivityAzkarBinding;
import com.semicode.moatmer.databinding.ActivitySebhaBinding;
import com.semicode.moatmer.mvp.azkarActivit.ActivityAzkarPresenter;
import com.semicode.moatmer.mvp.azkarActivit.ActivityAzkarView;
import com.semicode.moatmer.share.HelperMethod;

import java.util.ArrayList;
import java.util.List;

public class AzkarActivity extends AppCompatActivity implements ActivityAzkarView {
    ActivityAzkarBinding binding;
    ActivityAzkarPresenter presenter;
    AzkarAdapter azkarAdapter;
    List<AzkarData> azkarDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAzkarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();


    }

    private void init() {
        presenter = new ActivityAzkarPresenter(this, this);
        azkarAdapter = new AzkarAdapter(this, azkarDataList);
        binding.azkarRvAzkar.setAdapter(azkarAdapter);
        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());

    }

    @Override
    public void onload() {
//        HelperMethod.makeTextToast(this, "onload");
        binding.azkarRvAzkar.setVisibility(View.GONE);
        binding.loadingProgrss.setVisibility(View.VISIBLE);
    }

    @Override
    public void onloadAzkar(List<AzkarData> data) {
//        HelperMethod.makeTextToast(this, "onload azkar");
        azkarDataList.addAll(data);
        azkarAdapter.notifyDataSetChanged();

    }

    @Override
    public void onFailed(String message) {
        HelperMethod.makeTextToast(this, "on failed ");


    }

    @Override
    public void onFailure(String message) {
        HelperMethod.makeTextToast(this, "on failure");

    }

    @Override
    public void onFinish() {
//        HelperMethod.makeTextToast(this, "on finish");
        binding.azkarRvAzkar.setVisibility(View.VISIBLE);
        binding.loadingProgrss.setVisibility(View.GONE);
    }
}