package com.pingpong.ddown.Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.pingpong.ddown.ConstanceKey.ApiRequestUrl.*;

public class RetrofitConnection {

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(NaverShoppingSearchApiUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public RetrofitInterface server = retrofit.create(RetrofitInterface.class);
}
