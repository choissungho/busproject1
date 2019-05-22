package com.example.myapplication;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Transaction;

import java.util.List;

@Dao
public abstract class BusTimeDao {
    @Query("SELECT * FROM BusTime WHERE bustype =:bustype")
    abstract List<BusTime> getAll(String bustype);

    @Transaction
    void addAll(List<BusTime> busTimeList) {
        for (BusTime busTime : busTimeList) {
            insert(busTime);
        }
    }

    @Query("DELETE FROM BusTime")
    abstract void deleteAll();

    @Insert
    abstract void insert(BusTime busTimes);


}