package com.example.lezzetsofrasi.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.lezzetsofrasi.data.entity.Yemekler;
import com.example.lezzetsofrasi.data.entity.YemeklerCevap;
import com.example.lezzetsofrasi.retrofit.YemeklerDao;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class YemeklerDaoRepository {

    public MutableLiveData<List<Yemekler>> yemekListesi = new MutableLiveData<>();

    private YemeklerDao ydao;

    public YemeklerDaoRepository(YemeklerDao ydao){
        this.ydao = ydao;
    }

    public void yemekleriYukle(){
        ydao.yemekleriYukle().enqueue(new Callback<YemeklerCevap>() {
            @Override
            public void onResponse(Call<YemeklerCevap> call, Response<YemeklerCevap> response) {
                List<Yemekler> liste = response.body().getYemekler();
                yemekListesi.setValue(liste);
            }

            @Override
            public void onFailure(Call<YemeklerCevap> call, Throwable t) {

            }

        });
    }
    }
}
