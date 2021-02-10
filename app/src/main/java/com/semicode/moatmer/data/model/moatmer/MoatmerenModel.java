
package com.semicode.moatmer.data.model.moatmer;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MoatmerenModel implements Serializable
{

    @SerializedName("data")
    @Expose
    private List<MoatmerModelData> data = null;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private Integer status;
    private final static long serialVersionUID = -6077899627818033144L;

    public List<MoatmerModelData> getData() {
        return data;
    }

    public void setData(List<MoatmerModelData> data) {
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
