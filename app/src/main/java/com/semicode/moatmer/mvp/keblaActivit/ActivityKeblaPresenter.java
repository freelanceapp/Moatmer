package com.semicode.moatmer.mvp.keblaActivit;

import android.content.Context;

import com.semicode.moatmer.data.api.ApiClient;
import com.semicode.moatmer.data.model.kebla.KeblaModel;
import com.semicode.moatmer.tags.Tags;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ActivityKeblaPresenter {


    private Context context;
    private ActivityKeblaView view;


    public ActivityKeblaPresenter(Context context, ActivityKeblaView view) {
        this.context = context;
        this.view = view;

    }

    public void getKeblaDirection(double lat, double lon) {

        ApiClient.getApiService(Tags.islam_url).getKeblaDirection( (float) lat,  (float) lon).enqueue(new Callback<KeblaModel>() {
            @Override
            public void onResponse(Call<KeblaModel> call, Response<KeblaModel> response) {
                if (response.isSuccessful() && response.body() != null) {
                    view.onGetKeblaDirection(response.body().getData().getDirection());

                } else {
                    try {
                        view.onFailed(response.errorBody().string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }

            @Override
            public void onFailure(Call<KeblaModel> call, Throwable t) {
                view.onFailure(t.getMessage());
            }
        });

    }

//   public NextPray getNextPray(Timings timings){
//       Date currentTime = Calendar.getInstance().getTime();
//
//   }
}
