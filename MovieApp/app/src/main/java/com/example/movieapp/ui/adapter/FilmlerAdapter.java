package com.example.movieapp.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieapp.data.entity.Filmler;
import com.example.movieapp.databinding.CardTasarimBinding;
import com.example.movieapp.ui.fragment.AnasayfaFragmentDirections;
import com.google.android.material.snackbar.Snackbar;

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
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {// view binding kısmı
        CardTasarimBinding binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false);

        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {// şekiller burda yapılır

        Filmler film = filmlerListesi.get(position);
        CardTasarimBinding t = holder.tasarim;
        t.imageViewFilm.setImageResource(mContext.getResources()
                .getIdentifier(film.getResim(),"drawable",mContext.getPackageName()));// dinamik bir yapı

        t.textViewFiyat.setText(film.getFiyat()+" $");

        t.buttonSepet.setOnClickListener(v -> {
            Snackbar.make(v, film.getAd()+" sepete eklendi",Snackbar.LENGTH_SHORT).show();
        });

        //
        t.cardViewFilm.setOnClickListener(v -> {
            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(film);
            Navigation.findNavController(v).navigate(gecis);
        });
    }

    @Override
    public int getItemCount() {
        return filmlerListesi.size();
    }
}
