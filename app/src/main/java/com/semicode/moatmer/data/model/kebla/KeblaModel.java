
package com.semicode.moatmer.data.model.kebla;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class KeblaModel implements Serializable
{

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private KeblaData data;
    private final static long serialVersionUID = 782862433907044664L;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public KeblaData getData() {
        return data;
    }

    public void setData(KeblaData data) {
        this.data = data;
    }

}
