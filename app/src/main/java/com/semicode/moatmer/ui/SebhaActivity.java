package com.semicode.moatmer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.databinding.ActivitySebhaBinding;

public class SebhaActivity extends AppCompatActivity {
    ActivitySebhaBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySebhaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();


    }

    private void init() {

        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());

    }

}