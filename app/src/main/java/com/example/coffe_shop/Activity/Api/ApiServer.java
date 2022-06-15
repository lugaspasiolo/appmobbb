package com.example.coffe_shop.Activity.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiServer {
    private static final  String Base_url = "http://192.168.1.21/Three Coffee/";

    private static Retrofit retrofit;

    public static Retrofit getClient(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
