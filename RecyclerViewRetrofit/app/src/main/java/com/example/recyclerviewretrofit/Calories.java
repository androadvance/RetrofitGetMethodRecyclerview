package com.example.recyclerviewretrofit;

import com.google.gson.annotations.SerializedName;

public class Calories {

    @SerializedName("name")
    private String Name;

    @SerializedName("image_path")
    private String image_path;

    @SerializedName("calories")
    private int Calories;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }
}
