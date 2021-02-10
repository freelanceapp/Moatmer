package com.semicode.moatmer.data.api;

import com.semicode.moatmer.data.model.azkar.AzkarModel;
import com.semicode.moatmer.data.model.kebla.KeblaModel;
import com.semicode.moatmer.data.model.moatmer.MoatmerModel;
import com.semicode.moatmer.data.model.moatmer.MoatmerenModel;
import com.semicode.moatmer.data.model.prayerTimes.PrayerTimesModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    @GET("timingsByCity")
    Call<PrayerTimesModel> getPrayerTimes(@Query(value = "city") String city
            , @Query(value = "country") String country
            , @Query(value = "method") int method
    );

    @GET("qibla")
    Call<KeblaModel> getKeblaDirection(@Query(value = "latitude") float latitude
            , @Query(value = "longitude") float longitude
    );

//    -----------------------------------------------------------------------------------------------

    @GET("remembrances")
    Call<AzkarModel> getAzkar();

    @POST("searchMoatmers")
    Call<MoatmerenModel> getMoatmer(@Query(value = "search_keyword") String searchKeyword);

    @POST("userDetails")
    Call<MoatmerModel> userDetails(@Query(value = "user_id") int user_id);

}
