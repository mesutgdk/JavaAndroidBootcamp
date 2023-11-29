package com.example.lezzetsofrasi.data.repo;

import androidx.lifecycle.MutableLiveData;

import com.example.lezzetsofrasi.data.entity.Yemekler;

import java.util.List;

public class YemeklerDaoRepository {

    public MutableLiveData<List<Yemekler>> yemekListesi = new MutableLiveData<>();


}
