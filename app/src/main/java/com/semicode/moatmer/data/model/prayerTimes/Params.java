
package com.semicode.moatmer.data.model.prayerTimes;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Params implements Serializable
{

    @SerializedName("Fajr")
    @Expose
    private Double fajr;
    @SerializedName("Isha")
    @Expose
    private String isha;
    private final static long serialVersionUID = -9194962043707681289L;

    public Double getFajr() {
        return fajr;
    }

    public void setFajr(Double fajr) {
        this.fajr = fajr;
    }

    public String getIsha() {
        return isha;
    }

    public void setIsha(String isha) {
        this.isha = isha;
    }

}
