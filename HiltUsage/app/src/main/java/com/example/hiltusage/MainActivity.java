package com.example.hiltusage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Kargo kardo;
    Internet internet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kardo = new Kargo();
        kardo.gonder();

        internet = new Internet();
        internet.basvuruYap();
    }
}