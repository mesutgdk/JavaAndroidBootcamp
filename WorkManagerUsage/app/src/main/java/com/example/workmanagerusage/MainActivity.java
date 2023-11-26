package com.example.workmanagerusage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.app.Activity;
import android.os.Bundle;

import com.example.workmanagerusage.databinding.ActivityMainBinding;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        binding.buttonYap.setOnClickListener(v -> {
            WorkRequest istek = new OneTimeWorkRequest //bi tıklama bir kere çalış
                    .Builder(MyWorker.class)
                    .setInitialDelay(10, TimeUnit.SECONDS) // geçikme ayarlanır
                    .build();

            WorkManager.getInstance(this).enqueue(istek);
        });
    }
}