package com.semicode.moatmer.mvp.homeActivity;

import android.content.Context;

import com.semicode.moatmer.data.api.ApiClient;
import com.semicode.moatmer.data.model.prayerTimes.PrayerTimesModel;
import com.semicode.moatmer.tags.Tags;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityHomePresenter {


    private Context context;
    private ActivityHomeView view;


    public ActivityHomePresenter(Context context, ActivityHomeView view) {
        this.context = context;
        this.view = view;
        getPrayerTimes("cairo","egypt",5);

    }

    public void getPrayerTimes(String city, String country, int method) {
        ApiClient.getApiService(Tags.islam_url).getPrayerTimes(city, country, method).enqueue(new Callback<PrayerTimesModel>() {
            @Override
            public void onResponse(Call<PrayerTimesModel> call, Response<PrayerTimesModel> response) {
                if (response.isSuccessful() && response.body() != null) {
                    view.onGetPrayerTimes(response.body());
                } else {
                    try {
                        view.onFailed(response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<PrayerTimesModel> call, Throwable t) {
                view.onFailure(t.getMessage());
            }
        });

    }


}
