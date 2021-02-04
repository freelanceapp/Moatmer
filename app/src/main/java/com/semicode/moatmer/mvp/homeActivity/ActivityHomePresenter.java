package com.semicode.moatmer.mvp.homeActivity;

import android.content.Context;

import com.semicode.moatmer.data.api.ApiClient;
import com.semicode.moatmer.data.model.NextPray;
import com.semicode.moatmer.data.model.prayerTimes.PrayerTimesModel;
import com.semicode.moatmer.data.model.prayerTimes.Timings;
import com.semicode.moatmer.tags.Tags;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityHomePresenter {


    private Context context;
    private ActivityHomeView view;


    public ActivityHomePresenter(Context context, ActivityHomeView view,String city ,String country) {
        this.context = context;
        this.view = view;
        getPrayerTimes(city,country,5);

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

//   public NextPray getNextPray(Timings timings){
//       Date currentTime = Calendar.getInstance().getTime();
//
//   }
}
