package com.example.contactapp.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;

import com.example.contactapp.R;
import com.example.contactapp.data.entity.Kisiler;
import com.example.contactapp.databinding.FragmentAnasayfaBinding;
import com.example.contactapp.ui.adapter.KisilerAdapter;
import com.example.contactapp.ui.viewModel.AnasayfaViewModel;

import java.util.ArrayList;

public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;
    private AnasayfaViewModel viewModel; // viewmodel tanımlama
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAnasayfaBinding.inflate(inflater,container,false);

        binding.kisilerRv.setLayoutManager(new LinearLayoutManager(requireContext()));
        //binding.kisilerRv.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        //binding.kisilerRv.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.HORIZONTAL));

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
                viewModel.ara(query);
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                viewModel.ara(newText);
                return true;
            }

        });

        return binding.getRoot();
    }


    //ViewModel tanımlama fonksiyonu
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this).get(AnasayfaViewModel.class);
    }
}