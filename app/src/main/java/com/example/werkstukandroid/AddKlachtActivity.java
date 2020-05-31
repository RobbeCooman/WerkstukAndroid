package com.example.werkstukandroid;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class AddKlachtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_klacht);

        Klacht klacht = new Klacht();
        klacht.setNaam("Wim");
        klacht.setOnderwerp("Test");
        klacht.setDatum("Today");
        klacht.setOmschrijving("dit is een testomschrijving");

        KlachtenDatabank db = KlachtenDatabank.getInstance(this);
        KlachtDao klachtDao = db.klachtDao();

       klachtDao.insert(klacht);


    }



}
