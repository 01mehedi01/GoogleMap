package com.example.user.directionpractice;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by User on 5/3/2018.
 */

public interface DirectionService {
    @GET
    Call<DirectionResponse> getDirection(@Url String urlString);
}
