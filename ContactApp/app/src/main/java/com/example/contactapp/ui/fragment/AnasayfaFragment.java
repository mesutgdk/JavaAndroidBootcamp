package com.example.contactapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.contactapp.R;
import com.example.contactapp.data.entity.Kisiler;
import com.example.contactapp.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false);

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