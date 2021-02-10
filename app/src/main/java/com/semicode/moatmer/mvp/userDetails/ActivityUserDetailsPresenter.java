package com.semicode.moatmer.mvp.userDetails;

import android.content.Context;

import com.semicode.moatmer.data.api.ApiClient;
import com.semicode.moatmer.data.model.moatmer.MoatmerModel;
import com.semicode.moatmer.tags.Tags;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityUserDetailsPresenter {


    private Context context;
    private ActivityUserDetailsView view;


    public ActivityUserDetailsPresenter(Context context, ActivityUserDetailsView view, int userId) {
        this.context = context;
        this.view = view;
        getUserDetails(userId);
    }

    public void getUserDetails(int userId) {
        view.onLoad();
        ApiClient.getApiService(Tags.base_url).userDetails(userId).enqueue(new Callback<MoatmerModel>() {
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


