package com.semicode.moatmer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.databinding.ActivityAzkarBinding;
import com.semicode.moatmer.databinding.ActivitySebhaBinding;

public class AzkarActivity extends AppCompatActivity {
    ActivityAzkarBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAzkarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();


    }

    private void init() {

        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());

    }

}