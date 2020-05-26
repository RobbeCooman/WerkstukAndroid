package com.example.werkstukandroid;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
public interface KlachtDao {
    @Insert
    void insert(Klacht... klachten);

    @Update
    void update(Klacht... klachten);

    @Delete
    void delete(Klacht... klachten);
}



//    @Query("SELECT * FROM students WHERE voornaam = :studentNaam")
//    List<Student> getStudentByName(String studentNaam);
//
//    @Query("SELECT * FROM students")
//    List<Student> getAll();
//
//    @Query("SELECT * FROM students ORDER BY achternaam")
//    List<Student> getAllOrderByName();
//
//}