package com.example.hiltusage;

import android.util.Log;

import javax.inject.Inject;

public class Internet {
    private Adress adress;

    @Inject
    public Internet(Adress adress) {
        this.adress = adress;
    }

    public void basvuruYap(){
        Log.e("Sonuç",adress.getBilgi()+" adresine internet başvurusu yapıldı.");
    }

}
