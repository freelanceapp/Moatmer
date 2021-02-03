package com.semicode.moatmer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.databinding.ActivityKeblaBinding;
import com.semicode.moatmer.databinding.ActivitySebhaBinding;

public class KeblaActivity extends AppCompatActivity {
    ActivityKeblaBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKeblaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();


    }

    private void init() {

        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());

    }

}