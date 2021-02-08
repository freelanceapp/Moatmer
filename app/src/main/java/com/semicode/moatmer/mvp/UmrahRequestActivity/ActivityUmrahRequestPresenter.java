package com.semicode.moatmer.mvp.UmrahRequestActivity;

import android.content.Context;

import com.semicode.moatmer.data.api.ApiClient;
import com.semicode.moatmer.data.model.azkar.AzkarModel;
import com.semicode.moatmer.data.model.moatmer.MoatmerModel;
import com.semicode.moatmer.tags.Tags;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityUmrahRequestPresenter {


    private Context context;
    private ActivityUmrahRequestView view;


    public ActivityUmrahRequestPresenter(Context context, ActivityUmrahRequestView view) {
        this.context = context;
        this.view = view;
        getMoatmers("");
    }

    public void getMoatmers(String searchKeyword) {
        view.onload();
        ApiClient.getApiService(Tags.base_url).getMoatmer(searchKeyword).enqueue(new Callback<MoatmerModel>() {
            @Override
            public void onResponse(Call<MoatmerModel> call, Response<MoatmerModel> response) {
                if (response.isSuccessful() && response.body().getData() != null) {
                    view.onLoadMoatmer(response.body().getData());
                } else {
                    try {
                        view.onFailed(response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                view.onFinish();
            }

            @Override
            public void onFailure(Call<MoatmerModel> call, Throwable t) {
                view.onFailure(t.getMessage());
                view.onFinish();
            }
        });
    }
}


