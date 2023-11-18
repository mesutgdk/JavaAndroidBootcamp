package com.example.hiltusage.di;

import com.example.hiltusage.Adress;

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

    public Adress provideAdress(){
        return new Adress("Kadıköy/İSTANBUL");
    }
}
