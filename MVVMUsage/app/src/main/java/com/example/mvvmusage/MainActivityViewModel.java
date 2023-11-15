package com.example.mvvmusage;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
// view Model extend
public class MainActivityViewModel extends ViewModel {

    // livedata verisi için yenialtyapı
    public MutableLiveData<String> sonuc;
    public MatematikRepository mRepo = new MatematikRepository();

    // aracının sonucunu viewModel sonuca bağlama
    public MainActivityViewModel(){
        sonuc = mRepo.sonuc;
    }

    public void topla(String alinanSayi1, String alinanSayi2){

       mRepo.topla(alinanSayi1,alinanSayi2);
    }

    public void carp(String alinanSayi1, String alinanSayi2){

        mRepo.carp(alinanSayi1,alinanSayi2);
    }

}
