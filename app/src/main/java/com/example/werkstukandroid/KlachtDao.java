package com.example.werkstukandroid;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface KlachtDao {
    @Insert
    void insert(Klacht... klachten);

    @Update
    void update(Klacht... klachten);

    @Delete
    void delete(Klacht... klachten);


    @Query("SELECT * FROM klachten WHERE id = :klachtenId")
    LiveData<Klacht> getKlachtenById(long klachtenId);

    @Query("SELECT * FROM klachten ORDER BY onderwerp ASC")
    LiveData<List<Klacht>> getAllOrderByOnderwerp();
}

