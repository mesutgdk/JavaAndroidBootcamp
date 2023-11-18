package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sp = getSharedPreferences("Bilgiler",MODE_PRIVATE);

        // Veri Kaydı
        SharedPreferences.Editor editor = sp.edit();

        editor.putString("ad","Muzaffer");
        editor.putInt("volume",5);
        editor.putFloat("boy",1.77f);
        editor.putBoolean("bekar",true);

        Set<String>liste = new HashSet<>();
        liste.add("Ali");
        liste.add("Mahmut");
        liste.add("Atahan");

        editor.putStringSet("liste",liste);

        editor.apply();// her yaptığınız değişiklik için demek zorundasınız

        //Veri Silme
        //editor.remove("ad");
        //editor.apply();

        //Veri Okuma
        String gelenAd = sp.getString("ad","isim yok");// bilgi yoksa default olarak isim yok gelir

        Log.e("Gelen ad",gelenAd);


    }
}