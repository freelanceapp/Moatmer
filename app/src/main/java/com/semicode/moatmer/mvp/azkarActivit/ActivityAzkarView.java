package com.semicode.moatmer.mvp.azkarActivit;


import com.semicode.moatmer.data.model.azkar.AzkarData;

import java.util.List;

public interface ActivityAzkarView {


    void onload();

    void onloadAzkar(List<AzkarData> data);

    void onFailed(String message);

    void onFailure(String message);

    void onFinish();
}
