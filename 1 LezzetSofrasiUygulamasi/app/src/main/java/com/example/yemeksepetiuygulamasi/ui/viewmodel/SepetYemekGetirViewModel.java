package com.example.yemeksepetiuygulamasi.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.yemeksepetiuygulamasi.data.entity.SepetYemekler;
import com.example.yemeksepetiuygulamasi.data.repo.SepetYemeklerDaoRepository;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class SepetYemekGetirViewModel extends ViewModel {
    public SepetYemeklerDaoRepository yrepo;

    public MutableLiveData<List<SepetYemekler>> sepetYemekler;
    @Inject
    public SepetYemekGetirViewModel(SepetYemeklerDaoRepository yrepo) {
        this.yrepo = yrepo;
        kisileriYukle();
        sepetYemekler = yrepo.sepetYemeklerListe;

    }





    public void kisileriYukle(){
        yrepo.sepetGetir("gGeCo");
    }
    public void sil(String kisi_id,String ka){
        yrepo.sil(kisi_id,ka);
    }
    public String sepetTutari(){return yrepo.sepetTutari();}
}
