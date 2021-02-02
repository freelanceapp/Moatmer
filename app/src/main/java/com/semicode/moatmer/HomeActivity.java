package com.semicode.moatmer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.semicode.moatmer.databinding.ActivityHomeBinding;
import com.semicode.moatmer.databinding.ActivitySplashBinding;

public class HomeActivity extends AppCompatActivity {
   ActivityHomeBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}