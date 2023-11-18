package com.example.hiltusage;

import android.util.Log;

import javax.inject.Inject;

public class Kargo {

    private Adress adress;

    @Inject
    public Kargo() {
        this.adress = adress;
    }

    public void gonder(){
        Log.e("Sonuç",adress.getBilgi()+" adresine kargo gönderildi.");
    }
}
