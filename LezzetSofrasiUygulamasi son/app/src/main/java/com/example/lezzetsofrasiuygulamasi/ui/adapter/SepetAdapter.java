package com.example.lezzetsofrasiuygulamasi.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.lezzetsofrasiuygulamasi.data.entity.SepetYemekler;

import com.example.lezzetsofrasiuygulamasi.databinding.CardTasarimBinding;
import com.example.lezzetsofrasiuygulamasi.databinding.SepetTasarimBinding;
import com.example.lezzetsofrasiuygulamasi.ui.viewmodel.SepetYemekGetirViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class SepetAdapter extends RecyclerView.Adapter<SepetAdapter.SepetTasarimTutucu> {
    private Context mContext;
    private List<SepetYemekler> kisilerListesi;

    private SepetYemekGetirViewModel viewModel;

    public SepetAdapter(Context mContext, List<SepetYemekler> kisilerListesi, SepetYemekGetirViewModel viewModel) {
        this.mContext = mContext;
        this.kisilerListesi = kisilerListesi;
        this.viewModel = viewModel;
    }


    public class SepetTasarimTutucu extends RecyclerView.ViewHolder {
        private SepetTasarimBinding tasarim;

        public SepetTasarimTutucu(SepetTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public SepetTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SepetTasarimBinding binding =
                SepetTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new SepetTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull SepetTasarimTutucu holder, int position) {
        SepetYemekler yemek = kisilerListesi.get(position);
        SepetTasarimBinding t = holder.tasarim;
        String url = "http://kasimadalan.pe.hu/yemekler/resimler/"+yemek.getYemek_resim_adi();
        Glide.with(mContext).load(url).override(200,350
        ).into(t.imageView3);
        t.textViewYemekAd.setText(yemek.getYemek_adi());
        t.textViewYemekFiyat.setText("Fiyat "+String.valueOf(yemek.getYemek_fiyat())+" ₺");
        t.textViewAdet.setText("Adet "+String.valueOf(yemek.getYemek_siparis_adet()));
        t.textViewToplam.setText(String.valueOf(yemek.getYemek_siparis_adet()*yemek.getYemek_fiyat())+" ₺");

        t.imageViewSil.setOnClickListener(view -> {
            Snackbar.make(view, yemek.getYemek_adi() + " sepetten çıkarılsın mı?", Snackbar.LENGTH_LONG)
                    .setAction("EVET", view1 -> {
                        viewModel.sil( String.valueOf(yemek.getSepet_yemek_id()),  yemek.getKullanici_adi());
                    }).show();
        });
    }
    @Override
    public int getItemCount() {
        return kisilerListesi.size();
    }
}
