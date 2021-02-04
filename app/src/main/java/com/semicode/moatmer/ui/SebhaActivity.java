package com.semicode.moatmer.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.data.local.SharedPreferencesManger;
import com.semicode.moatmer.databinding.ActivitySebhaBinding;
import com.semicode.moatmer.share.HelperMethod;

public class SebhaActivity extends AppCompatActivity {
    ActivitySebhaBinding binding;
    int number ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySebhaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();


    }

    private void init() {
        number = (int)SharedPreferencesManger.LoadIntData(this, SharedPreferencesManger.SEBHA);
        binding.setNumber(number);

        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());
        binding.sebhaIvIncrese.setOnClickListener(v -> increase());
        binding.sebhaIvReset.setOnClickListener(v -> reset());

    }

    private void reset() {
        number = 0;
        SharedPreferencesManger.SaveData(this, SharedPreferencesManger.SEBHA, 0);
        binding.setNumber(number);

    }

    private void increase() {
        number++;
        SharedPreferencesManger.SaveData(this,SharedPreferencesManger.SEBHA,number);
        binding.setNumber(number);

    }

}