package com.example.contactapp.ui.viewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.contactapp.data.repo.KisilerDaoRepository;
import com.example.contactapp.ui.adapter.KisilerAdapter;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class KisiKayitViewModel extends ViewModel {
    public KisilerDaoRepository kRepo = new KisilerDaoRepository();

    public void kaydet(String kisi_ad,String kisi_tel){
       kRepo.kaydet(kisi_ad,kisi_tel);

    }
}
