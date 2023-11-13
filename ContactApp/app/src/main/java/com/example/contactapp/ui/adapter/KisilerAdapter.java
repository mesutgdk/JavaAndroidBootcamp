package com.example.contactapp.ui.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactapp.data.entity.Kisiler;
import com.example.contactapp.databinding.CardTasarimBinding;
import com.example.contactapp.ui.fragment.AnasayfaFragmentDirections;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class KisilerAdapter extends RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu> {
    private List<Kisiler> kisilerListesi;
    private Context mContext;

    public KisilerAdapter(List<Kisiler> kisilerListesi, Context mContext) {
        this.kisilerListesi = kisilerListesi;
        this.mContext = mContext;
    }

    public class CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim){
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }
    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding =
                CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {
        Kisiler kisi = kisilerListesi.get(position);
        CardTasarimBinding t = holder.tasarim;
        t.textViewKisiAd.setText(kisi.getKisi_ad());
        t.textViewKisiTel.setText(kisi.getKisi_tel());

        t.cardViewSatir.setOnClickListener(v -> { // veri geçisi
            AnasayfaFragmentDirections.KisiDetayGecis gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi);
            Navigation.findNavController(v).navigate(gecis);
        });

        t.imageViewSil.setOnClickListener(v -> {
            Snackbar.make(v,kisi.getKisi_ad()+" silinsin mi?",Snackbar.LENGTH_SHORT)
                    .setAction("Evet",v1 -> {
                        sil(kisi.getKisi_id());
                    })
                    .show();
        });

    }

    @Override
    public int getItemCount() {
        return kisilerListesi.size();
    }

    public void sil(int kisi_id){
        Log.e("Kişi Sil","Kişi idsi: "+String.valueOf(kisi_id));
    }
}
