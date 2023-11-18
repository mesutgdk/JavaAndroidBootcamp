package com.example.hiltusage;

import android.util.Log;

public class Kargo {

    Adress adress = new Adress("Kadiköy/İstanbul");

    public void gonder(){
        Log.e("Sonuç",adress.getBilgi()+" adresine kargo gönderildi.");
    }
}
