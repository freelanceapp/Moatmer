
package com.semicode.moatmer.data.model.moatmer;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MoatmerData implements Serializable
{

    @SerializedName("user")
    @Expose
    private MoatmerModelData user;
    @SerializedName("umrahs")
    @Expose
    private List<Object> umrahs = null;
    @SerializedName("ratings")
    @Expose
    private List<Object> ratings = null;
    private final static long serialVersionUID = 6759610812896253460L;

    public MoatmerModelData getUser() {
        return user;
    }

    public void setUser(MoatmerModelData user) {
        this.user = user;
    }

    public List<Object> getUmrahs() {
        return umrahs;
    }

    public void setUmrahs(List<Object> umrahs) {
        this.umrahs = umrahs;
    }

    public List<Object> getRatings() {
        return ratings;
    }

    public void setRatings(List<Object> ratings) {
        this.ratings = ratings;
    }

}
