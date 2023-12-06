package com.example.lezzetsofrasiuygulamasi.retrofit;

import com.example.lezzetsofrasiuygulamasi.data.entity.YemeklerCevap;

import retrofit2.Call;
import retrofit2.http.GET;

public interface YemeklerDao {
    @GET("yemekler/tumYemekleriGetir.php")
    Call<YemeklerCevap> yemekleriYukle();

}
