package com.example.widgetusage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import com.example.widgetusage.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private boolean checkIt = false;

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

        binding.buttonStart.setOnClickListener(v -> {   // görseli görünür yap kaybet
            binding.progressBar.setVisibility(View.VISIBLE);
        });

        binding.buttonStop.setOnClickListener(v -> {
            binding.progressBar.setVisibility(View.INVISIBLE);
        });

        // switch button çalışması
        binding.switch1.setOnCheckedChangeListener((mSwitch,isChecked) -> {
            if (isChecked) {
                Log.e("Sonuç","Switch : ON");
            }else{
                Log.e("Sonuç","Switch : OFF");
            }
        });


        binding.toggleButton.addOnButtonCheckedListener(((group,checkID,isChecked)->{
            checkIt = isChecked;
            if(isChecked){
                Button selectedButton = findViewById(binding.toggleButton.getCheckedButtonId());

                String buttonYazi = selectedButton.getText().toString();
                Log.e("Sonuç",buttonYazi);
            }

        }));

        ArrayList<String> countries = new ArrayList<>();
        countries.add("Turkey");
        countries.add("China");
        countries.add("USA");
        countries.add("Japan");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,countries); // listeleri sıralama
        binding.autoCompleteTextView.setAdapter(arrayAdapter);


        binding.buttonShow.setOnClickListener(v -> {
            Log.e("Sonuç", "Swich Durumu : "+binding.switch1.isChecked());
            if(checkIt){
                Button selectedButton = findViewById(binding.toggleButton.getCheckedButtonId());
                String buttonYazi = selectedButton.getText().toString();
                Log.e("Sonuç",buttonYazi);
            }
            String country = binding.autoCompleteTextView.getText().toString();
            Log.e("Sonuç", "Ülke: "+country);
        });


    }
}