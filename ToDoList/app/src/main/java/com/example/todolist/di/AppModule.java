package com.example.todolist.di;

import android.content.Context;

import androidx.room.Room;

import com.example.todolist.data.repo.ToDoDaoRepository;
import com.example.todolist.room.DosDao;
import com.example.todolist.room.Veritabani;

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
    public ToDoDaoRepository provideToDoDaoRepository(DosDao tdao){
        return new ToDoDaoRepository(tdao);
    }
    @Provides
    @Singleton
    public DosDao provideToDoDao(@ApplicationContext Context context){
        Veritabani vt = Room.databaseBuilder(context,Veritabani.class,"list.sqlite")
                .createFromAsset("list.sqlite")
                .build();
        return vt.getToDoDao();
    }
}
