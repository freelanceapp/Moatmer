
package com.semicode.moatmer.data.model.prayerTimes;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Designation implements Serializable
{

    @SerializedName("abbreviated")
    @Expose
    private String abbreviated;
    @SerializedName("expanded")
    @Expose
    private String expanded;
    private final static long serialVersionUID = 1904763151878620653L;

    public String getAbbreviated() {
        return abbreviated;
    }

    public void setAbbreviated(String abbreviated) {
        this.abbreviated = abbreviated;
    }

    public String getExpanded() {
        return expanded;
    }

    public void setExpanded(String expanded) {
        this.expanded = expanded;
    }

}
