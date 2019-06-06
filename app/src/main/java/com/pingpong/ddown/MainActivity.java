package com.pingpong.ddown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.pingpong.ddown.NaverShoppingClass.NaverShoppingResult;
import com.pingpong.ddown.Retrofit.RetrofitConnection;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.pingpong.ddown.ConstanceKey.ApiRequestUrl.*;
public class MainActivity extends AppCompatActivity {
    public static final String mClientId = "HdXVex7WUynhnX0LilrC";
    public static final String mClientSecret = "XERPciQWNP";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("result1", "Zzzz");

        RetrofitConnection retrofitConnection = new RetrofitConnection();
        String query="";
        try {
            query = URLEncoder.encode( "t50 air","UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Call<NaverShoppingResult> call = retrofitConnection.server.result(query, mClientId, mClientSecret);
        Log.d("result1", "Z12zzz");
        call.enqueue(new Callback<NaverShoppingResult>() {
            @Override
            public void onResponse(Call<NaverShoppingResult> call, Response<NaverShoppingResult> response) {
                Log.d("result1", "Zz32zz");

                Log.d("result1", response.body().getItems().size()+"");
            }

            @Override
            public void onFailure(Call<NaverShoppingResult> call, Throwable t) {
                Log.d("result2", t.toString());
            }
        });
    }
}
