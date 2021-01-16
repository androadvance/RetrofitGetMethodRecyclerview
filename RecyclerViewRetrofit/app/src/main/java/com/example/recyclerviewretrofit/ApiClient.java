package com.example.recyclerviewretrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    public static final String Base_URL = "http://10.7/caloriesapp/";
    public static Retrofit retrofit;

    public static Retrofit getRetrofit(){

        if (retrofit==null){

            retrofit = new Retrofit.Builder().baseUrl(Base_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
