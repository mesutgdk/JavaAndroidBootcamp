package com.example.contactapp.ui.viewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.contactapp.data.repo.KisilerDaoRepository;
import com.example.contactapp.ui.adapter.KisilerAdapter;

public class KisiKayitViewModel extends ViewModel {
    private KisilerDaoRepository kRepo = new KisilerDaoRepository();

    public void kaydet(String kisi_ad,String kisi_tel){
       kRepo.kaydet(kisi_ad,kisi_tel);

    }
}
