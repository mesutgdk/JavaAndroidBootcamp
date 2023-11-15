package com.example.contactapp.data.repo;

import android.util.Log;

public class KisilerDaoRepository {

    public void kaydet(String kisi_ad,String kisi_tel){
        Log.e("Kişi Kaydet", kisi_ad + " - " + kisi_tel);
    }

    public  void guncelle(int kisi_id,String kisi_ad,String kisi_tel){
        Log.e("Kişi Güncelle", kisi_id + " - " + kisi_ad + " - " + kisi_tel);
    }

    public void ara(String aramaKelimesi){
        Log.e("Kişi Ara",aramaKelimesi);
    }
}
