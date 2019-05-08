package com.example.myapplication;

import android.app.Activity;
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
import android.widget.ImageView;
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


    ArrayList<String> AnyangBustime = new ArrayList<>();
    ArrayList<String> BeomgyeBustime = new ArrayList<>();
    ArrayList<String> Daelimabustime = new ArrayList<>();
    ArrayList<String> DaelimbBustime = new ArrayList<>();











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
        //안양역→대림대
        AnyangBustime.add("08:04:00");
        AnyangBustime.add("08:08:00");
        AnyangBustime.add("08:12:00");
        AnyangBustime.add("08:16:00");
        AnyangBustime.add("08:20:00");
        AnyangBustime.add("08:24:00");
        AnyangBustime.add("08:28:00");
        AnyangBustime.add("08:32:00");
        AnyangBustime.add("08:36:00");
        AnyangBustime.add("08:40:00");
        AnyangBustime.add("08:44:00");
        AnyangBustime.add("08:48:00");
        AnyangBustime.add("08:52:00");
        AnyangBustime.add("08:56:00");
        AnyangBustime.add("09:00:00");
        AnyangBustime.add("09:04:00");
        AnyangBustime.add("09:08:00");
        AnyangBustime.add("09:12:00");
        AnyangBustime.add("09:16:00");
        AnyangBustime.add("09:20:00");
        AnyangBustime.add("09:24:00");
        AnyangBustime.add("09:28:00");
        AnyangBustime.add("09:32:00");
        AnyangBustime.add("09:36:00");
        AnyangBustime.add("09:40:00");
        AnyangBustime.add("09:44:00");
        AnyangBustime.add("09:48:00");
        AnyangBustime.add("09:52:00");
        AnyangBustime.add("09:56:00");
        AnyangBustime.add("10:00:00");
        AnyangBustime.add("10:05:00");
        AnyangBustime.add("10:10:00");
        AnyangBustime.add("10:15:00");
        AnyangBustime.add("10:20:00");
        AnyangBustime.add("10:25:00");
        AnyangBustime.add("10:30:00");
        AnyangBustime.add("10:35:00");
        AnyangBustime.add("10:40:00");
        AnyangBustime.add("10:45:00");
        AnyangBustime.add("10:50:00");
        AnyangBustime.add("10:55:00");
        AnyangBustime.add("11:00:00");
        AnyangBustime.add("11:05:00");
        AnyangBustime.add("11:10:00");
        AnyangBustime.add("11:20:00");
        AnyangBustime.add("11:30:00");
        AnyangBustime.add("11:40:00");
        AnyangBustime.add("12:10:00");
        AnyangBustime.add("12:30:00");
        AnyangBustime.add("12:50:00");
        AnyangBustime.add("13:10:00");
        AnyangBustime.add("13:30:00");
        AnyangBustime.add("13:50:00");
        AnyangBustime.add("14:10:00");
        AnyangBustime.add("14:30:00");
        AnyangBustime.add("14:50:00");
        AnyangBustime.add("15:10:00");
        AnyangBustime.add("15:20:00");
        AnyangBustime.add("15:30:00");
        AnyangBustime.add("15:40:00");
        AnyangBustime.add("15:50:00");
        AnyangBustime.add("15:55:00");
        AnyangBustime.add("16:00:00");
        AnyangBustime.add("16:05:00");
        AnyangBustime.add("16:10:00");
        AnyangBustime.add("16:15:00");
        AnyangBustime.add("16:20:00");
        AnyangBustime.add("16:25:00");
        AnyangBustime.add("16:30:00");
        AnyangBustime.add("16:35:00");
        AnyangBustime.add("16:40:00");
        AnyangBustime.add("16:45:00");
        AnyangBustime.add("16:50:00");
        AnyangBustime.add("16:55:00");
        AnyangBustime.add("17:00:00");
        AnyangBustime.add("17:05:00");
        AnyangBustime.add("17:10:00");
        AnyangBustime.add("17:15:00");
        AnyangBustime.add("17:20:00");
        AnyangBustime.add("17:25:00");
        AnyangBustime.add("17:30:00");
        AnyangBustime.add("17:35:00");
        AnyangBustime.add("17:40:00");
        AnyangBustime.add("17:45:00");
        AnyangBustime.add("17:50:00");
        AnyangBustime.add("17:55:00");
        AnyangBustime.add("18:00:00");
        AnyangBustime.add("18:05:00");
        AnyangBustime.add("18:10:00");
        AnyangBustime.add("18:15:00");
        AnyangBustime.add("18:20:00");
        AnyangBustime.add("18:25:00");
        AnyangBustime.add("18:30:00");
        AnyangBustime.add("18:35:00");
        AnyangBustime.add("18:40:00");
        AnyangBustime.add("18:45:00");
        AnyangBustime.add("18:55:00");


        AnyangBustime.add("19:00:00");
        AnyangBustime.add("19:05:00");
        AnyangBustime.add("19:35:00");
        AnyangBustime.add("20:25:00");
        AnyangBustime.add("20:45:00");
        AnyangBustime.add("21:15:00");
        AnyangBustime.add("21:45:00");
        AnyangBustime.add("22:05:00");
        AnyangBustime.add("22:20:00");
        AnyangBustime.add("22:50:00");


        //범계역→대림대
        BeomgyeBustime.add("08:05:00");
        BeomgyeBustime.add("08:10:00");
        BeomgyeBustime.add("08:35:00");
        BeomgyeBustime.add("08:40:00");
        BeomgyeBustime.add("09:10:00");
        BeomgyeBustime.add("09:40:00");
        BeomgyeBustime.add("10:10:00");
        BeomgyeBustime.add("10:40:00");
        BeomgyeBustime.add("16:00:00");
        BeomgyeBustime.add("16:30:00");
        BeomgyeBustime.add("17:00:00");
        BeomgyeBustime.add("17:30:00");
        BeomgyeBustime.add("18:00:00");
        BeomgyeBustime.add("18:30:00");

        //대림대→안양역
        Daelimabustime.add("08:08:00");
        Daelimabustime.add("08:12:00");
        Daelimabustime.add("08:16:00");
        Daelimabustime.add("08:20:00");
        Daelimabustime.add("08:24:00");
        Daelimabustime.add("08:28:00");
        Daelimabustime.add("08:32:00");
        Daelimabustime.add("08:36:00");
        Daelimabustime.add("08:40:00");
        Daelimabustime.add("08:44:00");
        Daelimabustime.add("08:48:00");
        Daelimabustime.add("08:52:00");
        Daelimabustime.add("08:56:00");
        Daelimabustime.add("09:00:00");
        Daelimabustime.add("09:04:00");
        Daelimabustime.add("09:08:00");
        Daelimabustime.add("09:12:00");
        Daelimabustime.add("09:16:00");
        Daelimabustime.add("09:20:00");
        Daelimabustime.add("09:24:00");
        Daelimabustime.add("09:28:00");
        Daelimabustime.add("09:32:00");
        Daelimabustime.add("09:36:00");
        Daelimabustime.add("09:40:00");
        Daelimabustime.add("09:44:00");
        Daelimabustime.add("09:48:00");
        Daelimabustime.add("09:52:00");
        Daelimabustime.add("09:55:00");
        Daelimabustime.add("10:00:00");
        Daelimabustime.add("10:05:00");
        Daelimabustime.add("10:10:00");
        Daelimabustime.add("10:15:00");
        Daelimabustime.add("10:20:00");
        Daelimabustime.add("10:25:00");
        Daelimabustime.add("10:30:00");
        Daelimabustime.add("10:35:00");
        Daelimabustime.add("10:40:00");
        Daelimabustime.add("10:45:00");
        Daelimabustime.add("10:50:00");
        Daelimabustime.add("10:55:00");
        Daelimabustime.add("11:00:00");
        Daelimabustime.add("11:10:00");
        Daelimabustime.add("11:20:00");
        Daelimabustime.add("11:30:00");
        Daelimabustime.add("12:00:00");
        Daelimabustime.add("12:20:00");
        Daelimabustime.add("12:40:00");
        Daelimabustime.add("13:00:00");
        Daelimabustime.add("13:20:00");
        Daelimabustime.add("13:40:00");
        Daelimabustime.add("14:00:00");
        Daelimabustime.add("14:20:00");
        Daelimabustime.add("14:40:00");
        Daelimabustime.add("15:00:00");
        Daelimabustime.add("15:10:00");
        Daelimabustime.add("15:20:00");
        Daelimabustime.add("15:30:00");
        Daelimabustime.add("15:40:00");
        Daelimabustime.add("15:40:00");
        Daelimabustime.add("15:45:00");
        Daelimabustime.add("15:50:00");
        Daelimabustime.add("15:55:00");
        Daelimabustime.add("16:00:00");
        Daelimabustime.add("16:05:00");
        Daelimabustime.add("16:10:00");
        Daelimabustime.add("16:15:00");
        Daelimabustime.add("16:20:00");
        Daelimabustime.add("16:25:00");
        Daelimabustime.add("16:30:00");
        Daelimabustime.add("16:35:00");
        Daelimabustime.add("16:40:00");
        Daelimabustime.add("16:45:00");
        Daelimabustime.add("16:50:00");
        Daelimabustime.add("16:55:00");
        Daelimabustime.add("17:00:00");
        Daelimabustime.add("17:05:00");
        Daelimabustime.add("17:10:00");
        Daelimabustime.add("17:15:00");
        Daelimabustime.add("17:20:00");
        Daelimabustime.add("17:25:00");
        Daelimabustime.add("17:30:00");
        Daelimabustime.add("17:35:00");
        Daelimabustime.add("17:40:00");
        Daelimabustime.add("17:45:00");
        Daelimabustime.add("17:50:00");
        Daelimabustime.add("17:55:00");
        Daelimabustime.add("18:00:00");
        Daelimabustime.add("18:05:00");
        Daelimabustime.add("18:10:00");
        Daelimabustime.add("18:15:00");
        Daelimabustime.add("18:20:00");
        Daelimabustime.add("18:25:00");
        Daelimabustime.add("18:30:00");
        Daelimabustime.add("18:35:00");
        Daelimabustime.add("18:40:00");
        Daelimabustime.add("18:45:00");
        Daelimabustime.add("18:50:00");
        Daelimabustime.add("19:15:00");
        Daelimabustime.add("20:15:00");
        Daelimabustime.add("20:35:00");
        Daelimabustime.add("21:05:00");
        Daelimabustime.add("21:35:00");
        Daelimabustime.add("21:55:00");
        Daelimabustime.add("22:15:00");

        //대림대→범계역
        DaelimbBustime.add("08:20:00");
        DaelimbBustime.add("08:25:00");
        DaelimbBustime.add("08:55:00");
        DaelimbBustime.add("09:25:00");
        DaelimbBustime.add("09:55:00");
        DaelimbBustime.add("10:25:00");
        DaelimbBustime.add("15:45:00");
        DaelimbBustime.add("16:15:00");
        DaelimbBustime.add("16:45:00");
        DaelimbBustime.add("17:15:00");
        DaelimbBustime.add("17:45:00");
        DaelimbBustime.add("18:15:00");


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
