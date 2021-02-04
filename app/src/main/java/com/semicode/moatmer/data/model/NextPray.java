package com.semicode.moatmer.data.model;

import android.content.Context;
import android.content.res.Resources;

import com.semicode.moatmer.R;
import com.semicode.moatmer.data.model.prayerTimes.Timings;

public class NextPray {

    String name, time, downTime;

    public NextPray(String name, String time, String downTime) {
        this.name = name;
        this.time = time;
        this.downTime = downTime;
    }


    public static NextPray getNextPray(Context context,String now, Timings timings) {
        if (castToInt(timings.getFajr()) > castToInt(now))
            return new NextPray(context.getString(R.string.fajr), timings.getFajr(), "");
        if (castToInt(timings.getDhuhr()) > castToInt(now))
            return new NextPray(context.getString(R.string.duhr), timings.getDhuhr(), "");
        if (castToInt(timings.getAsr()) > castToInt(now))
            return new NextPray(context.getString(R.string.asr), timings.getAsr(), "");
        if (castToInt(timings.getMaghrib()) > castToInt(now))
            return new NextPray(context.getString(R.string.maghrib), timings.getMaghrib(), "");
        if (castToInt(timings.getIsha()) > castToInt(now))
            return new NextPray(context.getString(R.string.isha), timings.getIsha(), "");


        return new NextPray("fajr", timings.getFajr(), "");

    }

    static int castToInt(String pray) {
        String newPray = pray.replace(":", "");
        int time = Integer.parseInt(newPray);
        return time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDownTime() {
        return downTime;
    }

    public void setDownTime(String downTime) {
        this.downTime = downTime;
    }
}
