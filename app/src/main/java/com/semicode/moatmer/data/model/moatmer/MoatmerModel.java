
package com.semicode.moatmer.data.model.moatmer;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MoatmerModel implements Serializable
{

    @SerializedName("data")
    @Expose
    private MoatmerData data;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;
    private final static long serialVersionUID = 8558260788429215075L;

    public MoatmerData getData() {
        return data;
    }

    public void setData(MoatmerData data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
