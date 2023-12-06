package com.example.lezzetsofrasiuygulamasi.di;

import android.content.Context;

import androidx.room.Room;

import com.example.lezzetsofrasiuygulamasi.data.repo.SepetYemeklerDaoRepository;
import com.example.lezzetsofrasiuygulamasi.data.repo.VeriDaoRepository;
import com.example.lezzetsofrasiuygulamasi.data.repo.YemeklerDaoRepository;
import com.example.lezzetsofrasiuygulamasi.retrofit.ApiUtils;
import com.example.lezzetsofrasiuygulamasi.retrofit.SepetYemekDao;
import com.example.lezzetsofrasiuygulamasi.retrofit.YemeklerDao;
import com.example.lezzetsofrasiuygulamasi.room.VeriDao;
import com.example.lezzetsofrasiuygulamasi.room.Veritabani;

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
    public YemeklerDao provideYemeklerDao(){
        return ApiUtils.getYemeklerDao();
    }
    @Provides
    @Singleton
    public YemeklerDaoRepository provideYemeklerDaoRepository(YemeklerDao ydao){
        return new YemeklerDaoRepository(ydao);
    }

    @Provides
    @Singleton
    public SepetYemekDao provideSepetYemekDao(){
        return ApiUtils.getSepetYemekDao();
    }
    @Provides
    @Singleton
    public SepetYemeklerDaoRepository provideSepetYemeklerDaoRepository(SepetYemekDao ySdao){
        return new SepetYemeklerDaoRepository(ySdao);
    }
    @Provides
    @Singleton
    public VeriDaoRepository provideVeriDaoRepository(VeriDao vdao){
        return new VeriDaoRepository(vdao);
    }

    @Provides
    @Singleton
    public VeriDao provideKisilerDao(@ApplicationContext Context context){
        Veritabani vt = Room.databaseBuilder(context, Veritabani.class, "data.sqlite")
                .createFromAsset("data.sqlite").build();
        return vt.getVeriDao();
    }

}
