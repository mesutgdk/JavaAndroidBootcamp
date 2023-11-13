package com.example.movieapp.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieapp.data.entity.Filmler;
import com.example.movieapp.databinding.CardTasarimBinding;

import java.util.List;

public class FilmlerAdapter extends RecyclerView.Adapter<FilmlerAdapter.CardTasarimTutucu> {
    private List<Filmler> filmlerListesi;
    private Context mContext;

    public FilmlerAdapter(List<Filmler> filmlerListesi, Context mContext) {
        this.filmlerListesi = filmlerListesi;
        this.mContext = mContext;
    }


    public class CardTasarimTutucu extends RecyclerView.ViewHolder{ // listeleme yapmak için
        private CardTasarimBinding tasarim;

        public CardTasarimTutucu(CardTasarimBinding tasarim) { // generate constractor yaptık, içini düzelttik
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }
    
    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
