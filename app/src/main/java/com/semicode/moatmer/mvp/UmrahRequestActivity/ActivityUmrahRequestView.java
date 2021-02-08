package com.semicode.moatmer.mvp.UmrahRequestActivity;


import com.semicode.moatmer.data.model.azkar.AzkarData;
import com.semicode.moatmer.data.model.moatmer.MoatmerModelData;

import java.util.List;

public interface ActivityUmrahRequestView {


    void onload();

    void onLoadMoatmer(List<MoatmerModelData> data);

    void onFailed(String message);

    void onFailure(String message);

    void onFinish();
}
