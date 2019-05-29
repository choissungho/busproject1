package com.example.myapplication;

import android.arch.persistence.room.Room;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MyReceiver extends BroadcastReceiver {


    public static final String MY_ACTION = "com.example.busreceiver.action.ACTION_MY_BROADCAST";



    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = intent.getExtras();
        String id = bundle.getString("id");



        Date curDate = new Date();
        SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss", Locale.getDefault());
        String currentTime = now.format(curDate);


        if (MY_ACTION.equals(intent.getAction())) {

            AppDatabase db = Room.databaseBuilder(context,
                    AppDatabase.class, "database-name")
                    .allowMainThreadQueries()
                    .build();


            List<BusTime> busTimes = db.busTimeDao().getAll("안양역→대림대");
            boolean isNoAnswer = true;
            for (int i = 0; i < busTimes.size(); i++) {
                String el = busTimes.get(i).toString();
                int compare = el.compareTo(currentTime);
                if (compare > 0) {
                    isNoAnswer = false;
                    Toast.makeText(context, busTimes.get(i).toString(), Toast.LENGTH_SHORT).show();
                    break;
                }
            }

            if (isNoAnswer) {
                Toast.makeText(context, "막차 끊겼음", Toast.LENGTH_SHORT).show();
            }


        }

    }
}
