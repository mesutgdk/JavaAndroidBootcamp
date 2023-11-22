package com.example.contactapp.di;

import com.example.contactapp.data.repo.KisilerDaoRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AppModule {

    @Provides
    @Singleton
    public KisilerDaoRepository provideKisilerRepository(){
        return new KisilerDaoRepository();
    }
}
