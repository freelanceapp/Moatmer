package com.semicode.moatmer.mvp.azkarActivit;

import android.content.Context;

import com.semicode.moatmer.data.api.ApiClient;
import com.semicode.moatmer.data.model.azkar.AzkarModel;
import com.semicode.moatmer.data.model.kebla.KeblaModel;
import com.semicode.moatmer.tags.Tags;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityAzkarPresenter {


    private Context context;
    private ActivityAzkarView view;


    public ActivityAzkarPresenter(Context context, ActivityAzkarView view) {
        this.context = context;
        this.view = view;
        getAzkar();
    }

    public void getAzkar() {
        view.onload();
        ApiClient.getApiService(Tags.base_url).getAzkar().enqueue(new Callback<AzkarModel>() {
            @Override
            public void onResponse(Call<AzkarModel> call, Response<AzkarModel> response) {

                if (response.isSuccessful() && response.body().getData() != null) {
                    view.onloadAzkar(response.body().getData());
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
            public void onFailure(Call<AzkarModel> call, Throwable t) {
                view.onFailure(t.getMessage());
                view.onFinish();

            }
        });
    }
}


