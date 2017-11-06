package com.example.yonny.app1;

import android.telecom.Call;

import java.util.List;

import retrofit2.http.GET;


/**
 * Created by Yonny on 26/10/2017.
 */

public interface ApiService {
    String API_BASE_URL = "https://productos--api-yonnyrivera.c9users.io";

    @GET("api/v1/productos")
    retrofit2.Call<List<Producto>> getProductos();


}
