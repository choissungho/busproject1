package com.example.myapplication;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {


    TextView TimeTv;
    Timer mTimer;

    TextView Nowtime;
    Button AnyangBtn, DaelimaBtn, DaelimbBtn, BeomgyeBtn;


    ArrayList<BusTime> AnyangBustime = new ArrayList<>();
    ArrayList<BusTime> BeomgyeBustime = new ArrayList<>();
    ArrayList<BusTime> Daelimabustime = new ArrayList<>();
    ArrayList<BusTime> DaelimbBustime = new ArrayList<>();











    View.OnClickListener bust1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date curDate = new Date();
            SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
            String currentTime = now.format(curDate);


            for (int i = 0; i < AnyangBustime.size(); i++) {
                String element0 = AnyangBustime.get(i).toString();
                int compare = element0.compareTo(currentTime);
                if (compare == 0) {


                    Nowtime.setText(element0);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                } else if (compare > 0) {


                    Nowtime.setText(element0);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                    break;
                } else if (compare < 0) {
                    Nowtime.setText("없음");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                }

            }

        }

    };
    View.OnClickListener bust2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date curDate = new Date();
            SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
            String currentTime = now.format(curDate);


            for (int i = 0; i < BeomgyeBustime.size(); i++) {
                String element1 = BeomgyeBustime.get(i).toString();
                int compare = element1.compareTo(currentTime);
                if (compare == 0) {


                    Nowtime.setText(element1);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                } else if (compare > 0) {


                    Nowtime.setText(element1);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                    break;
                } else if (compare < 0) {
                    Nowtime.setText("없음");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                }

            }
        }
    };
    View.OnClickListener bust3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date curDate = new Date();
            SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
            String currentTime = now.format(curDate);


            for (int i = 0; i < Daelimabustime.size(); i++) {
                String element2 = Daelimabustime.get(i).toString();
                int compare = element2.compareTo(currentTime);
                if (compare == 0) {


                    Nowtime.setText(element2);
                    // text animation s
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                } else if (compare > 0) {


                    Nowtime.setText(element2);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);

                    break;
                } else if (compare < 0) {
                    Nowtime.setText("없음");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                }

            }
        }
    };
    View.OnClickListener bust4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date curDate = new Date();
            SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
            String currentTime = now.format(curDate);


            for (int i = 0; i < DaelimbBustime.size(); i++) {
                String element3 = DaelimbBustime.get(i).toString();
                int compare = element3.compareTo(currentTime);
                if (compare == 0) {


                    Nowtime.setText(element3);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                } else if (compare > 0) {


                    Nowtime.setText(element3);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                    break;
                } else if (compare < 0) {
                    Nowtime.setText("없음");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    Nowtime.startAnimation(anim);
                }

            }
        }
    };

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnyangBtn = (Button) findViewById(R.id.AnyangBtn);

        DaelimaBtn = (Button) findViewById(R.id.DaelimaBtn);

        DaelimbBtn = (Button) findViewById(R.id.DaelimbBtn);

        BeomgyeBtn = (Button) findViewById(R.id.BeomgyeBtn);


        Nowtime = (TextView) findViewById(R.id.Nowtime);
        TimeTv = (TextView) findViewById(R.id.TimeTv);




        Nowtime.setTextColor(Color.GREEN);
        AnyangBtn.setOnClickListener(bust1);
        BeomgyeBtn.setOnClickListener(bust2);
        DaelimaBtn.setOnClickListener(bust3);
        DaelimbBtn.setOnClickListener(bust4);



        MainTimerTask timerTask = new MainTimerTask();
        mTimer = new Timer();
        mTimer.schedule(timerTask, 500, 1000);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database-name")
                .allowMainThreadQueries()
                .build();
        db.busTimeDao().deleteAll();

        //안양역→대림대
        AnyangBustime.add(new BusTime("08:04:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:08:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:12:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:16:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:24:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:28:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:32:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:36:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:40:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:44:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:48:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:52:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("08:56:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:00:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:04:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:08:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:12:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:16:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:24:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:28:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:32:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:36:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:40:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:44:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:48:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:52:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("09:56:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:00:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:05:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:15:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:25:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:35:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:40:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:45:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:50:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("10:55:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("11:00:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("11:05:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("11:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("11:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("11:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("11:40:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("12:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("12:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("12:50:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("13:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("13:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("13:50:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("14:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("14:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("14:50:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("15:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("15:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("15:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("15:40:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("15:50:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("15:55:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:00:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:05:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:15:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:25:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:35:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:40:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:45:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:50:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("16:55:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:00:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:05:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:15:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:25:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:35:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:40:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:45:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:50:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("17:55:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:00:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:05:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:10:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:15:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:25:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:30:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:35:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:40:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:45:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("18:55:00","안양역→대림대"));


        AnyangBustime.add(new BusTime("19:00:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("19:05:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("19:35:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("20:25:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("20:45:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("21:15:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("21:45:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("22:05:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("22:20:00","안양역→대림대"));
        AnyangBustime.add(new BusTime("22:50:00", "안양역→대림대"));

        db.busTimeDao().addAll(AnyangBustime);


        //범계역→대림대
        BeomgyeBustime.add(new BusTime("08:05:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("08:10:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("08:35:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("08:40:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("09:10:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("09:40:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("10:10:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("10:40:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("16:00:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("16:30:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("17:00:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("17:30:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("18:00:00","범계역→대림대"));
        BeomgyeBustime.add(new BusTime("18:30:00","범계역→대림대"));
        db.busTimeDao().addAll(BeomgyeBustime);
        //대림대→안양역
        Daelimabustime.add(new BusTime("08:08:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:12:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:16:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:24:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:28:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:32:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:36:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:44:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:48:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:52:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("08:56:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:04:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:08:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:12:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:16:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:24:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:28:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:32:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:36:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:44:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:48:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:52:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("09:55:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:05:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:10:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:15:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:25:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:30:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:35:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:45:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:50:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("10:55:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("11:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("11:10:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("11:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("11:30:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("12:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("12:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("12:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("13:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("13:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("13:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("14:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("14:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("14:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:10:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:30:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:45:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:50:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("15:55:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:05:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:10:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:15:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:25:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:30:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:35:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:45:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:50:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("16:55:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:05:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:10:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:15:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:25:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:30:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:35:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:45:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:50:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("17:55:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:00:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:05:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:10:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:15:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:20:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:25:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:30:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:35:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:40:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:45:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("18:50:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("19:15:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("20:15:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("20:35:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("21:05:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("21:35:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("21:55:00","대림대→안양역"));
        Daelimabustime.add(new BusTime("22:15:00","대림대→안양역"));
        db.busTimeDao().addAll( Daelimabustime);
        //대림대→범계역
        DaelimbBustime.add(new BusTime("08:20:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("08:25:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("08:55:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("09:25:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("09:55:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("10:25:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("15:45:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("16:15:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("16:45:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("17:15:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("17:45:00","대림대→범계역"));
        DaelimbBustime.add(new BusTime("18:15:00","대림대→범계역"));

        db.busTimeDao().addAll(DaelimbBustime);
    }

    Handler mHandler = new Handler();

    Runnable mUpdateTimeTask = new Runnable() {
        public void run() {

            Date rightNow = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat(
                    " HH:mm:ss ");
            String dateString = formatter.format(rightNow);
            TimeTv.setText(dateString);
//시간구하기
        }
    };

    class MainTimerTask extends TimerTask {
        public void run() {
            mHandler.post(mUpdateTimeTask);
        }
    }

    @Override
    protected void onDestroy() {
        mTimer.cancel();
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu,menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.map:
           Intent maps = new Intent(MainActivity.this,AnyangInfoActivity.class);
           startActivity(maps);
                return true;
            case R.id.table:
                Intent table = new Intent(MainActivity.this,AnyangpopupActivity.class);
                startActivity(table);
                return true;
            case R.id.clock:
                Intent clocks = new Intent(MainActivity.this,AlarmActivity.class);
                startActivity(clocks);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
