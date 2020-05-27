package com.example.werkstukandroid;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Klacht.class}, version = 1)
public abstract class KlachtenDatabank extends RoomDatabase {

    public abstract KlachtDao klachtDao();

    static KlachtenDatabank getInstance(final Context context)
    {
        return Room.databaseBuilder(context.getApplicationContext(),
                KlachtenDatabank.class,
                "klachtendb")
                .allowMainThreadQueries() // not in final version!
                .fallbackToDestructiveMigration() // delete en hermaakt de db elke keer als er een wijziging is
                .build();
    }
}
