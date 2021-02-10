package com.semicode.moatmer.mvp.userDetails;


import com.semicode.moatmer.data.model.moatmer.MoatmerData;
import com.semicode.moatmer.data.model.moatmer.MoatmerModelData;

import java.util.List;

public interface ActivityUserDetailsView {


    void onLoad();


    void onFailed(String message);

    void onFinish();

    void onFailure(String message);

    void onLoadMoatmer(MoatmerData data);
}
