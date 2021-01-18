package com.example.listdrama.retrofit;

import com.example.listdrama.model.ListData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("ListData.json")
    Call<List<ListData>> getAllData();


}
