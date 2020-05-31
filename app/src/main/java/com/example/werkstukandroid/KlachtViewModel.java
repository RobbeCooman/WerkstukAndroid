package com.example.werkstukandroid;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class KlachtViewModel extends AndroidViewModel {

    private KlachtenRepository mRepository;

    private LiveData<List<Klacht>> mAllKlachten;


    public KlachtViewModel(@NonNull Application application) {
        super(application);
        mRepository = new KlachtenRepository(application);
        mAllKlachten = mRepository.getAllKlachten();
    }

    public LiveData<List<Klacht>> getAllArtists() { return mAllKlachten; }

    public void insert(Klacht klacht) { mRepository.insertKlacht(klacht);}



}
