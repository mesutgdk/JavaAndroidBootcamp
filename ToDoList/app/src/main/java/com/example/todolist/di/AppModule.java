package com.example.todolist.di;

import com.example.todolist.data.repo.ToDoDaoRepository;

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
    public ToDoDaoRepository provideToDoDaoRepository(){
        return new ToDoDaoRepository();
    }
}
