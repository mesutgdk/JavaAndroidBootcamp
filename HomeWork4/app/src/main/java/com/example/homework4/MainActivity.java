package com.example.homework4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.os.Bundle;

import com.example.homework4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.button2GoA.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.AFragment);
        });

        binding.button2GoX.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.XFragment);
        });

        setContentView(binding.getRoot());
    }
}