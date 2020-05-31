package com.example.werkstukandroid;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;

import java.util.List;

public class KlachtenRepository {

    private KlachtDao mKlachtDao;

    private LiveData<List<Klacht>> mAllKlachten;


    public KlachtenRepository(Application application)
    {
        KlachtenDatabank db = KlachtenDatabank.getInstance(application);
        mKlachtDao = db.klachtDao();
        mAllKlachten = mKlachtDao.getAllOrderByOnderwerp();
    }

    public LiveData<List<Klacht>> getAllKlachten() {
        return mAllKlachten;
    }


    //public LiveData<String> getOnderwerp(long klachtId) {
    //    return mKlachtDao.getAllOrderByOnderwerp(klachtId);
   // }

    public void insertKlacht(@NonNull final Klacht klacht)
    {
        KlachtenDatabank.databaseWriteExecutor.execute(new Runnable() {
            @Override
            public void run() {
                mKlachtDao.insert(klacht);
            }
        });
    }

}
