package com.semicode.moatmer.data.model;

import android.content.Context;
import android.content.res.Resources;

import com.semicode.moatmer.R;
import com.semicode.moatmer.data.model.prayerTimes.Timings;

public class NextPray {

    static String name, time, downTime, am_or_pm;
    static int fajrHour = 0, fajrMin = 0, duhrHour = 0, duhrMin = 0, asrHour = 0, asrMin = 0, maghribHour = 0, maghribMin = 0, ishaHour = 0, ishaMin = 0;

    public NextPray() {
    }

    public NextPray(String name, String time, String downTime, String am_or_pm) {
        this.name = name;
        this.time = time;
        this.downTime = downTime;
        this.am_or_pm = am_or_pm;
    }


    public static NextPray getNextPray(Context context, String now, Timings timings) {
        int nowHour = castToInt(now.charAt(0) + "" + now.charAt(1));
        int nowMin = castToInt(now.charAt(3) + "" + now.charAt(4));

        if (replaceCastToInt(timings.getFajr()) > replaceCastToInt(now)) {
            fajrHour = castToInt(timings.getFajr().charAt(0) + "" + timings.getFajr().charAt(1));
            fajrMin = castToInt(timings.getFajr().charAt(3) + "" + timings.getFajr().charAt(4));
            downTime = (fajrHour - nowHour) + ":" + (fajrMin - nowMin);
            if (fajrHour >= 12) {
                fajrHour = -12;
                am_or_pm = context.getString(R.string.pm);

            } else {
                am_or_pm = context.getString(R.string.am);
            }
            return new NextPray(context.getString(R.string.fajr), timings.getFajr(), downTime, am_or_pm);
        }
        if (replaceCastToInt(timings.getDhuhr()) > replaceCastToInt(now)) {
            duhrHour = castToInt(timings.getDhuhr().charAt(0) + "" + timings.getDhuhr().charAt(1));
            duhrMin = castToInt(timings.getDhuhr().charAt(3) + "" + timings.getDhuhr().charAt(4));
            downTime = (duhrHour - nowHour) + ":" + (duhrMin - nowMin);
            if (duhrHour >= 12) {
                duhrHour = -12;
                am_or_pm = context.getString(R.string.pm);

            } else {
                am_or_pm = context.getString(R.string.am);
            }
            return new NextPray(context.getString(R.string.duhr), timings.getFajr(), downTime, am_or_pm);
        }
        if (replaceCastToInt(timings.getAsr()) > replaceCastToInt(now)){
            asrHour = castToInt(timings.getAsr().charAt(0) + "" + timings.getAsr().charAt(1));
            asrMin = castToInt(timings.getAsr().charAt(3) + "" + timings.getAsr().charAt(4));
            downTime = (asrHour - nowHour) + ":" + (asrMin - nowMin);
            if (asrHour >= 12) {
                asrHour = -12;
                am_or_pm = context.getString(R.string.pm);

            } else {
                am_or_pm = context.getString(R.string.am);
            }
            return new NextPray(context.getString(R.string.asr), timings.getAsr(), downTime, am_or_pm);
        }
        if (replaceCastToInt(timings.getMaghrib()) > replaceCastToInt(now)){
            maghribHour = castToInt(timings.getMaghrib().charAt(0) + "" + timings.getMaghrib().charAt(1));
            maghribMin = castToInt(timings.getMaghrib().charAt(3) + "" + timings.getMaghrib().charAt(4));
            downTime = (maghribHour - nowHour) + ":" + (maghribMin - nowMin);
            if (maghribHour >= 12) {
                maghribHour = -12;
                am_or_pm = context.getString(R.string.pm);

            } else {
                am_or_pm = context.getString(R.string.am);
            }
            return new NextPray(context.getString(R.string.maghrib), timings.getMaghrib(), downTime, am_or_pm);
        }
        if (replaceCastToInt(timings.getIsha()) > replaceCastToInt(now)){
            ishaHour = castToInt(timings.getIsha().charAt(0) + "" + timings.getIsha().charAt(1));
            ishaMin = castToInt(timings.getIsha().charAt(3) + "" + timings.getIsha().charAt(4));
            downTime = (ishaHour - nowHour) + ":" + (ishaMin - nowMin);
            if (ishaHour >= 12) {
                ishaHour = -12;
                am_or_pm = context.getString(R.string.pm);

            } else {
                am_or_pm = context.getString(R.string.am);
            }
            return new NextPray(context.getString(R.string.isha), timings.getIsha(), downTime, am_or_pm);
        }


        return new NextPray("fajr", timings.getFajr(), "", am_or_pm);

    }

    static int castToInt(String pray) {
        return Integer.parseInt(pray);
    }

    static int replaceCastToInt(String pray) {
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

    public String getAm_or_pm() {
        return am_or_pm;
    }

    public void setAm_or_pm(String am_or_pm) {
        NextPray.am_or_pm = am_or_pm;
    }
}
