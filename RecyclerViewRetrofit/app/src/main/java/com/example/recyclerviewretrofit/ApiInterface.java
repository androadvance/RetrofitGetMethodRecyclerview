package com.example.recyclerviewretrofit;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("getcalories.php")
    Call<List<Calories>> getCaloriesinfo(@Query("item_type") String itemtype);
}
