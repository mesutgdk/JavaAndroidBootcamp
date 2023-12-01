package com.example.lezzetsofrasi.ui.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.lezzetsofrasi.data.entity.Yemekler;
import com.example.lezzetsofrasi.data.repo.YemeklerDaoRepository;

import java.io.Closeable;
import java.util.List;

import dagger.Lazy;
import dagger.hilt.android.lifecycle.HiltViewModel;

@HiltViewModel
public class MainScreenViewModel extends ViewModel {

    public YemeklerDaoRepository yrepo;
    public MutableLiveData<List<Yemekler>> yemeklerListesi;

    public MainScreenViewModel(YemeklerDaoRepository yrepo, MutableLiveData<List<Yemekler>> yemeklerListesi) {
        this.yrepo = yrepo;
        this.yemeklerListesi = yemeklerListesi;
        yemeklerYukle();
    }

    public void yemeklerYukle(){
        yrepo.yemekleriYukle();
    }
}
