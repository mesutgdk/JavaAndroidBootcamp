package com.example.widgetusage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.widgetusage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // edittexten veri alma
        binding.buttonOku.setOnClickListener(view -> {
            String alinanVeri = binding.editTextGirdi.getText().toString();
            binding.textViewSonuc.setText(alinanVeri); // text'e yazdırma
        });
        binding.button2Happy.setOnClickListener(view -> {
            binding.imageView.setImageResource(R.drawable.happy);  // tuş ile resim değiştirme, dosyadan gösterme
        });
        binding.button2Sad.setOnClickListener(view -> {
            binding.imageView.setImageResource(getResources().getIdentifier("sad","drawable",getPackageName()));
        });


    }
}