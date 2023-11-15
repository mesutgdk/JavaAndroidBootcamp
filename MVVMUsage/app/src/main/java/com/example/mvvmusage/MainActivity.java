package com.example.mvvmusage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.mvvmusage.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // viewModel çalıştırma tanımlama
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        // LiveData tetikleme fonksiyonu
        viewModel.sonuc.observe(this,s -> { // Dinleme, Okuma
            binding.textViewSonuc.setText(s);
        });


        binding.buttonTopla.setOnClickListener(v -> {
            String alinanSayi1 = binding.editTextSayi1.getText().toString();
            String alinanSayi2 = binding.editTextSayi2.getText().toString();

            viewModel.topla(alinanSayi1,alinanSayi2);

        });

        binding.buttonCarp.setOnClickListener(v -> {
            String alinanSayi1 = binding.editTextSayi1.getText().toString();
            String alinanSayi2 = binding.editTextSayi2.getText().toString();

            viewModel.carp(alinanSayi1,alinanSayi2);

        });
    }
}