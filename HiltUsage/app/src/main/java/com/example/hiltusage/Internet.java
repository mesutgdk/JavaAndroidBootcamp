package com.example.hiltusage;

import android.util.Log;

public class Internet {
    Adress adress = new Adress("Kadiköy/İstanbul");

    public void basvuruYap(){
        Log.e("Sonuç",adress.getBilgi()+" adresine internet başvurusu yapıldı.");
    }

}
