package com.example.werkstukandroid;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Klacht.class}, version = 1)
public abstract class KlachtenDatabank extends RoomDatabase {

    private static volatile KlachtenDatabank INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool((NUMBER_OF_THREADS));

    public abstract KlachtDao klachtDao();

    static KlachtenDatabank getInstance(final Context context)
    {
        return Room.databaseBuilder(context.getApplicationContext(),
                KlachtenDatabank.class,
                "klachtendb")
                .build();
    }
}
