package com.example.werkstukandroid;


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
    Klacht getKlachtenById(long klachtenId);

    @Query("SELECT * FROM klachten")
    List<Klacht> getAll();
}


//@Query("SELECT * FROM students WHERE id = :studentId")
//    Student getStudentById(long studentId);
//
//    @Query("SELECT * FROM students WHERE voornaam = :studentNaam")
//    List<Student> getStudentByName(String studentNaam);
//
//    @Query("SELECT * FROM students")
//    List<Student> getAll();
//
//    @Query("SELECT * FROM students ORDER BY achternaam")
//    List<Student> getAllOrderByName();

