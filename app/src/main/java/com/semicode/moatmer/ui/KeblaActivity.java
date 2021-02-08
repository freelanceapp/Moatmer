package com.semicode.moatmer.ui;

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

import com.semicode.moatmer.databinding.ActivityKeblaBinding;
import com.semicode.moatmer.mvp.keblaActivit.ActivityKeblaPresenter;
import com.semicode.moatmer.mvp.keblaActivit.ActivityKeblaView;
import com.semicode.moatmer.share.HelperMethod;

public class KeblaActivity extends AppCompatActivity implements LocationListener, ActivityKeblaView {
    ActivityKeblaBinding binding;
    ActivityKeblaPresenter presenter;

    LocationManager locationManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityKeblaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        init();
        checkLocationPermission();

//        MyLocation();
    }

    private void checkLocationPermission() {
        if (ContextCompat.checkSelfPermission(KeblaActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(KeblaActivity.this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION
            }, 100);
        } else {
            MyLocation();
        }

    }

    @SuppressLint("MissingPermission")
    private void MyLocation() {
        locationManager = (LocationManager) getApplicationContext().getSystemService(LOCATION_SERVICE);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 5000, 5, this);
    }

    private void init() {
        binding.prayerTimesIvBack.setOnClickListener(v -> onBackPressed());
        presenter = new ActivityKeblaPresenter(this, this);

    }


    @Override
    public void onLocationChanged(@NonNull Location location) {
        Log.d("checkMyLocation", "onLocationChanged: " + location.getLatitude() + "\nlongtute" + location.getLongitude());
        HelperMethod.makeTextToast(this, "Latitude" + location.getLatitude() + "\nLongitude" + location.getLongitude());
        presenter.getKeblaDirection(location.getLatitude(), location.getLongitude());

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {
        HelperMethod.makeTextToast(this, "provider enabled" + provider);

    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {
        HelperMethod.makeTextToast(this, "provider disabled" + provider);

    }

    @Override
    public void onGetKeblaDirection(Double direction) {
        HelperMethod.makeTextToast(this, "direction" + direction);
    }

    @Override
    public void onFailed(String message) {
        HelperMethod.makeTextToast(this, "onFailed message" + message);

    }

    @Override
    public void onFailure(String message) {
        HelperMethod.makeTextToast(this, "onFailure message" + message);

    }
}