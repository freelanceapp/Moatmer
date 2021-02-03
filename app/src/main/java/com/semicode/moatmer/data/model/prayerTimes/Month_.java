
package com.semicode.moatmer.data.model.prayerTimes;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Month_ implements Serializable
{

    @SerializedName("number")
    @Expose
    private Integer number;
    @SerializedName("en")
    @Expose
    private String en;
    private final static long serialVersionUID = -2169253496912067589L;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

}
