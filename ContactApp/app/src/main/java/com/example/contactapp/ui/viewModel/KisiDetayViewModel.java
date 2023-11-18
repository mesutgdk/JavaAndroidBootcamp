package com.example.contactapp.ui.viewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.contactapp.data.repo.KisilerDaoRepository;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class KisiDetayViewModel extends ViewModel {

    public KisilerDaoRepository kRepo = new KisilerDaoRepository();

    public  void guncelle(int kisi_id,String kisi_ad,String kisi_tel){
        kRepo.guncelle(kisi_id,kisi_ad,kisi_tel);
    }
}
