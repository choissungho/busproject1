package com.example.myapplication;

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
            Toast.makeText(context,"aaa",Toast.LENGTH_SHORT).show();
        }

    }
}
