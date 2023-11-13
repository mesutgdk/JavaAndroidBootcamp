package com.example.contactapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.contactapp.R;
import com.example.contactapp.data.entity.Kisiler;
import com.example.contactapp.databinding.FragmentAnasayfaBinding;
import com.example.contactapp.ui.adapter.KisilerAdapter;

import java.util.ArrayList;

public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false);

        binding.kisilerRv.setLayoutManager(new LinearLayoutManager(requireContext()));

        ArrayList<Kisiler> kisilerListesi = new ArrayList<>();
        Kisiler k1 = new Kisiler(1,"Ahmet","12344");
        Kisiler k2 = new Kisiler(2,"Atahan","23456");
        Kisiler k3 = new Kisiler(3,"Çiğdem","34567");

        kisilerListesi.add(k1);
        kisilerListesi.add(k2);
        kisilerListesi.add(k3);

        KisilerAdapter adapter = new KisilerAdapter(kisilerListesi,requireContext()); // adapter'a gönderdik

        binding.kisilerRv.setAdapter(adapter);

        binding.fab.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.kisiKayitGecis);
        });

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit(String query) {
                ara(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                ara(newText);
                return true;
            }

        });

        return binding.getRoot();
    }

    public void ara(String aramaKelimesi){
        Log.e("Kişi Ara",aramaKelimesi);
    }
}