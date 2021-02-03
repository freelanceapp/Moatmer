package com.semicode.moatmer.data.api;

import com.semicode.moatmer.data.model.prayerTimes.PrayerTimesModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {
    @GET("timingsByCity")
    Call<PrayerTimesModel> getPrayerTimes(@Query(value = "city") String city
            , @Query(value = "country") String country
            , @Query(value = "method") int method
    );

}
