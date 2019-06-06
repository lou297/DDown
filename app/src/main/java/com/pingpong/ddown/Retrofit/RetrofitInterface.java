package com.pingpong.ddown.Retrofit;

import com.pingpong.ddown.NaverShoppingClass.NaverShoppingResult;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static com.pingpong.ddown.ConstanceKey.ApiRequestUrl.*;

public interface RetrofitInterface {
    @GET("shop.json")
    Call<NaverShoppingResult> result(@Query("query") String query, @Header("X-Naver-Client-Id") String clientId, @Header("X-Naver-Client-Secret") String clientSectry);
}
