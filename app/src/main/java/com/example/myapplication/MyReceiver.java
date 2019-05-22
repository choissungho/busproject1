package com.example.myapplication;

import android.arch.persistence.room.Room;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import java.util.ArrayList;

public class MyReceiver extends BroadcastReceiver {



    public  static  final  String MY_ACTION = "com.example.busreceiver.action.ACTION_MY_BROADCAST";


    @Override
    public void onReceive(Context context, Intent intent) {


        if(MY_ACTION.equals(intent.getAction())){
            AppDatabase db = Room.databaseBuilder(context,
                    AppDatabase.class, "database-name")
                    .allowMainThreadQueries()
                    .build();


                    Toast.makeText(context,db.busTimeDao().getAll("안양역→대림대").get(0).toString(),Toast.LENGTH_SHORT).show();
        }

    }
}
