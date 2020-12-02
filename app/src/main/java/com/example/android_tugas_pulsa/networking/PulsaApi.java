package com.example.android_tugas_pulsa.networking;

import com.example.android_tugas_pulsa.model.Pulsa;
import com.example.android_tugas_pulsa.model.PulsaResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PulsaApi {

    @GET("product")
    Call<PulsaResponse> getPulsa();

    @POST("pulsa")
    Call<PulsaResponse> buyPulsa(@Body Pulsa pulsa);

}
