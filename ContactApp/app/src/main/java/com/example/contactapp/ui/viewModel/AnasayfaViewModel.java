package com.example.contactapp.ui.viewModel;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.contactapp.data.repo.KisilerDaoRepository;

public class AnasayfaViewModel extends ViewModel {

    private KisilerDaoRepository kRepo = new KisilerDaoRepository();
    public void ara(String aramaKelimesi){

        kRepo.ara(aramaKelimesi);
    }
}
