package com.example.myapplication;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class BusTime {
    @PrimaryKey(autoGenerate = true)
    public int id;

    public BusTime(String bustime, String bustype) {
        this.bustime = bustime;
        this.bustype = bustype;
    }

    @ColumnInfo
    public String bustime;

    @ColumnInfo
    public String bustype;

    @Override
    public String toString() {
        return bustime;
    }
}