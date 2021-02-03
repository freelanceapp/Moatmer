
package com.semicode.moatmer.data.model.prayerTimes;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weekday implements Serializable
{

    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("ar")
    @Expose
    private String ar;
    private final static long serialVersionUID = -3997763210026748796L;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

}
