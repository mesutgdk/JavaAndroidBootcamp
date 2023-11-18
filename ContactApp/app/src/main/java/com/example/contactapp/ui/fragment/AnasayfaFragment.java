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

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
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

        // LiveDAta listener
        viewModel.kisilerListesi.observe(getViewLifecycleOwner(),kisilerListesi -> {
            KisilerAdapter adapter = new KisilerAdapter(kisilerListesi,requireContext(),viewModel);
            binding.kisilerRv.setAdapter(adapter);
        });

        binding.fab.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.kisiKayitGecis);
        });

        binding.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit(String query) {
                viewModel.ara(query);
                return true;
            }
        // her tıklamada veri verir
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

    // geri döndüğümüzde geri yükle
    @Override
    public void onResume() {
        super.onResume();
        viewModel.kisileriYukle();
    }
}