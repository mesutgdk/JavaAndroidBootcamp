package com.example.contactapp.ui.viewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.contactapp.data.entity.Kisiler;
import com.example.contactapp.data.repo.KisilerDaoRepository;

import java.util.List;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class AnasayfaViewModel extends ViewModel {

    public KisilerDaoRepository kRepo = new KisilerDaoRepository();
    public MutableLiveData<List<Kisiler>> kisilerListesi;

    // Constractor, initten gelme
    public AnasayfaViewModel(){
        kisileriYukle();
        kisilerListesi =kRepo.kisilerListesi;
    }
    public void ara(String aramaKelimesi){

        kRepo.ara(aramaKelimesi);
    }

    public void sil(int kisi_id){
        kRepo.sil(kisi_id);
    }

    public void kisileriYukle(){
        kRepo.kisilerYukle();
    }
}
