package com.example.locationusage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.pm.PackageManager;
import android.health.connect.datatypes.ExerciseRoute;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import com.example.locationusage.databinding.ActivityMainBinding;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    // izin kontrolü
    private int permissionControl = 0;

    private FusedLocationProviderClient flpc;
    private Task<Location> locationTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());

        flpc = LocationServices.getFusedLocationProviderClient(this);

        binding.buttonLocation.setOnClickListener(v -> {
            permissionControl = ContextCompat.checkSelfPermission(this,Manifest.permission
                    .ACCESS_FINE_LOCATION);
            if (permissionControl == PackageManager.PERMISSION_GRANTED){
                locationTask = flpc.getLastLocation();
                getLocation();
            }else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},100);
            }
        });
    }

    public void getLocation(){
        locationTask.addOnSuccessListener(location -> {
            if (location != null){

                    binding.textViewLocation.setText(location.getLatitude()+ ""+ location.getLongitude());

                }else {
                binding.textViewLocation.setText("Hata Oluştu");
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100){
            permissionControl = ContextCompat.checkSelfPermission(this,Manifest.permission
                    .ACCESS_FINE_LOCATION);

            if (grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(getApplicationContext(),"izin onaylandı",Toast.LENGTH_SHORT).show();
                locationTask = flpc.getLastLocation();
                getLocation();
            }else{
                Toast.makeText(getApplicationContext(),"izin onaylanmadı",Toast.LENGTH_SHORT).show();
            }
        }
    }
}