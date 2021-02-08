
package com.semicode.moatmer.data.model.azkar;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AzkarModel implements Serializable
{

    @SerializedName("data")
    @Expose
    private List<AzkarData> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;
    private final static long serialVersionUID = -4073107803513245322L;

    public List<AzkarData> getData() {
        return data;
    }

    public void setData(List<AzkarData> data) {
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
