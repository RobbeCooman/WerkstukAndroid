package com.example.werkstukandroid;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Klachten")
public class Klacht {
    @PrimaryKey(autoGenerate = true)
    private long id;
    private String naam;
    private String onderwerp;
    private String datum;
    private String omschrijving;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getOnderwerp() {
        return onderwerp;
    }

    public void setOnderwerp(String onderwerp) {
        this.onderwerp = onderwerp;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

}

