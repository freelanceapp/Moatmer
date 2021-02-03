package com.semicode.moatmer.mvp.homeActivity;


import com.semicode.moatmer.data.model.prayerTimes.PrayerTimesModel;

public interface ActivityHomeView {

    void onGetPrayerTimes(PrayerTimesModel body);

    void onFailed(String message);

    void onFailure(String message);
}
