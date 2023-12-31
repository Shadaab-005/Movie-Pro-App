package com.example.movieproapp.service;

import com.example.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    // Base Url
    // https://api.themoviedb.org/3/
    //
    // End Point Url
    // movie/popular?api_key=cb0adb7a0665f667fb28a335e2d9de7d

    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);


}
