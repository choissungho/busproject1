package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    private TextView timeTv;

    private Timer mTimer;

 TextView nowtime;
   Button bt2, bt6,bt1;
    Button bt4, bt8;

    ArrayList<String> bustime = new ArrayList<>();



    View.OnClickListener bus = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this,webView.class);
            startActivity(i);
        }
    };
    View.OnClickListener bus2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent e = new Intent(MainActivity.this,WebView2Activity.class);
            startActivity(e);
        }
    };
    View.OnClickListener bus3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent r = new Intent(MainActivity.this,WebView3Activity.class);
            startActivity(r);
        }
    };
    View.OnClickListener bus4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent t = new Intent(MainActivity.this,WebView4Activity.class);
            startActivity(t);
        }
    };
    View.OnClickListener bust1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date curDate = new Date();
            SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
            String currentTime = now.format(curDate);




            for (int i = 0; i < bustime.size(); i++) {
                String element0 = bustime.get(i).toString();
                int compare=element0.compareTo(currentTime);
               if(compare == 0){


                   nowtime.setText(element0);
               }
                    else if (compare > 0){


                   nowtime.setText(element0);

                   break;
               }
               else if (compare < 0){
                   nowtime.setText("없음");

               }

               }

            }

    };
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt2=(Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(bus);
        bt4=(Button)findViewById(R.id.bt4);
        bt4.setOnClickListener(bus2);
        bt6=(Button)findViewById(R.id.bt6);
        bt6.setOnClickListener(bus3);
        bt8=(Button)findViewById(R.id.bt8);
        bt8.setOnClickListener(bus4);
        timeTv = (TextView) findViewById(R.id.timeTv);
        nowtime=(TextView)findViewById(R.id.nowtime);
nowtime.setTextColor(Color.GREEN);
        bt1=(Button)findViewById(R.id.bt1);
        bt1.setOnClickListener(bust1);

        MainTimerTask timerTask = new MainTimerTask();
        mTimer = new Timer();
        mTimer.schedule(timerTask, 500, 1000);
        //시간
        bustime.add("05:21:00");
        bustime.add("08:21:00");
        bustime.add("08:30:00");
        bustime.add("08:36:00");
        bustime.add("08:46:00");
        bustime.add("08:55:00");
        bustime.add("09:03:00");
        bustime.add("09:19:00");
        bustime.add("09:25:00");
        bustime.add("09:42:00");
        bustime.add("09:52:00");
        bustime.add("10:00:00");
        bustime.add("10:09:00");
        bustime.add("10:19:00");
        bustime.add("10:30:00");
        bustime.add("10:39:00");
        bustime.add("10:49:00");
        bustime.add("11:00:00");
        bustime.add("11:08:00");
        bustime.add("11:28:00");
        bustime.add("13:10:00");
        bustime.add("13:25:00");
        bustime.add("13:40:00");
        bustime.add("13:55:00");
        bustime.add("14:10:00");
        bustime.add("14:25:00");
        bustime.add("14:40:00");
        bustime.add("14:55:00");
        bustime.add("15:10:00");
        bustime.add("15:30:00");
        bustime.add("15:40:00");
        bustime.add("15:50:00");
        bustime.add("16:50:00");
        bustime.add("17:10:00");
        bustime.add("17:20:00");




    }

    private Handler mHandler = new Handler();

    private Runnable mUpdateTimeTask = new Runnable() {
        public void run() {

            Date rightNow = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat(
                    " HH:mm:ss ");
            String dateString = formatter.format(rightNow);
            timeTv.setText(dateString);
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
    protected void onPause() {
        mTimer.cancel();
        super.onPause();
    }

    @Override
    protected void onResume() {
        MainTimerTask timerTask = new MainTimerTask();
        mTimer.schedule(timerTask, 500, 3000);
        super.onResume();
    }

}
