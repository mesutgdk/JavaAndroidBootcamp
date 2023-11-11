package com.example.widgetusage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.icu.text.SimpleDateFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import com.example.widgetusage.databinding.ActivityMainBinding;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.util.ArrayList;
import java.util.Locale;

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

        // segmented controlers
        binding.toggleButton.addOnButtonCheckedListener(((group,checkID,isChecked)->{
            checkIt = isChecked;
            if(isChecked){
                Button selectedButton = findViewById(binding.toggleButton.getCheckedButtonId());

                String buttonYazi = selectedButton.getText().toString();
                Log.e("Sonuç",buttonYazi);
            }

        }));

        // düşen menü
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Turkey");
        countries.add("China");
        countries.add("USA");
        countries.add("Japan");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,countries); // listeleri sıralama
        binding.autoCompleteTextView.setAdapter(arrayAdapter);

        binding.textViewSlider.setText("Slider : "+binding.slider.getProgress());

        binding.slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                binding.textViewSlider.setText("Slider : "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {} //sürüklerken

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {} //sürükleme durunca
        });

        // saati saatçiden alma
        binding.buttonWatch.setOnClickListener(v -> {
            MaterialTimePicker tp = new MaterialTimePicker.Builder()
                    .setTitleText("Saat Seç")
                    .setTimeFormat(TimeFormat.CLOCK_24H)
                    .build()
                    ;
            tp.show(getSupportFragmentManager(),"");

            tp.addOnPositiveButtonClickListener(v1 -> {
                binding.editTextClock.setText(tp.getHour()+" : "+tp.getMinute());
            });
        });

        // tarihi ele alma

        binding.buttonDate.setOnClickListener(v -> {
            MaterialDatePicker dp = MaterialDatePicker.Builder.datePicker()
                    .setTitleText("Tarih Seç")
                    .build()
                    ;
            dp.show(getSupportFragmentManager(),"");

            dp.addOnPositiveButtonClickListener(v1 -> {
                SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/yyyy", Locale.getDefault()); // dijital oceans tan bakabiliriz
                String date = df.format(v1);
                binding.editTextDate.setText(date);
            });
        });

        binding.buttonShow.setOnClickListener(v -> {
            Log.e("Sonuç", "Swich Durumu : "+binding.switch1.isChecked());
            if(checkIt){
                Button selectedButton = findViewById(binding.toggleButton.getCheckedButtonId());
                String buttonYazi = selectedButton.getText().toString();
                Log.e("Sonuç",buttonYazi);
            }
            String country = binding.autoCompleteTextView.getText().toString();
            Log.e("Sonuç", "Ülke: "+country);
            Log.e("Sonuç","Slider: "+binding.slider.getProgress());
        });
        // görsel olarak üste çıkıyor, çok önerilmiyor
        binding.buttonToast.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this,"Merhaba",Toast.LENGTH_SHORT).show();
        });

        // Atıştırma Anlamında, iosta yok, button ekleme
        binding.buttonSnackBar.setOnClickListener(v1 -> {
            Snackbar.make(v1, "Merhaba",Snackbar.LENGTH_SHORT)
                    .setAction("Evet",v2 -> {
                        //arka plan rengi, text rengi
                        Snackbar.make(v1,"Silindi",Snackbar.LENGTH_SHORT)
                                .setBackgroundTint(Color.RED)
                                .setTextColor(Color.WHITE)
                                .show();
                    })
                    //arka plan rengi, text rengi aksiyon tuş rengi
                    .setBackgroundTint(Color.WHITE)
                    .setTextColor(Color.BLUE)
                    .setActionTextColor(Color.RED)
                    .show();
        });

        // Allert button
        binding.buttonAlert.setOnClickListener(v -> {
            new MaterialAlertDialogBuilder(this)
                    .setTitle("Başlık")
                    .setMessage("Mesaj")
                    .setPositiveButton("Tamam",(d,i) -> {
                        Toast.makeText(MainActivity.this,"Tamam Seçildi",Toast.LENGTH_SHORT).show();
                    })
                    .setNegativeButton("İptal",(d,i) -> {
                        Toast.makeText(MainActivity.this,"İptal Seçildi",Toast.LENGTH_SHORT).show();
                    })
                    .show();
        });

    }
}