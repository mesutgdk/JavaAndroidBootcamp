package com.example.contactapp.di;

import android.content.Context;

import androidx.room.Room;

import com.example.contactapp.data.repo.KisilerDaoRepository;
import com.example.contactapp.room.KisilerDao;
import com.example.contactapp.room.VeriTabani;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Provides
    @Singleton
    public KisilerDaoRepository provideKisilerRepository(KisilerDao kdao){
        return new KisilerDaoRepository(kdao);
    }
    // dependency injection noktası
    @Provides
    @Singleton
    public KisilerDao provideKisilerDao(@ApplicationContext Context context){
        VeriTabani vt = Room.databaseBuilder(context,VeriTabani.class,"rehber.sqlite")
                .createFromAsset("rehber.sqlite").build(); // telefondan kopyalayan func bu

        return vt.getKisilerDao();
    }
}
