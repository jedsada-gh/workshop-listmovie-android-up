package com.jedsada.listmovieworkshopup.complete.retrofit;

import com.jedsada.listmovieworkshopup.complete.model.MovieModel;

import retrofit2.Call;
import retrofit2.http.GET;

interface MovieApi {

    @GET("movie")
    Call<MovieModel> getListMovie();
}
