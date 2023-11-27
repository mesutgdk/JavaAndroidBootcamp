package com.example.mapusage;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.example.mapusage.databinding.ActivityMainBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment =
                (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        binding.buttonKonumaGit.setOnClickListener(v -> {
            //37.555572,34.9388673
            LatLng kamisli = new LatLng(37.555572,34.9388673);
            mMap.addMarker(new MarkerOptions().position(kamisli).title("Kamışlı"));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(kamisli,17f));
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng sdyney = new LatLng(-34,151);
        mMap.addMarker(new MarkerOptions().position(sdyney).title("Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sdyney));
    }


}