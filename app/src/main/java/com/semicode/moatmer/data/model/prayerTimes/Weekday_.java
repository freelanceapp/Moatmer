
package com.semicode.moatmer.data.model.prayerTimes;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weekday_ implements Serializable
{

    @SerializedName("en")
    @Expose
    private String en;
    private final static long serialVersionUID = -3001695800809100643L;

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}
