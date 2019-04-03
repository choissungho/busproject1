package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {

    private TextView timeTv;

    private Timer mTimer;


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
            SimpleDateFormat now = new SimpleDateFormat("HHmm");
            String currentTime = now.format(curDate);

            Log.d("MainActivity", currentTime);

            for (int i = 0; i < bustime.size(); i++) {

            }
        }
    };
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
        bt1=(Button)findViewById(R.id.bt1);

        MainTimerTask timerTask = new MainTimerTask();
        mTimer = new Timer();
        mTimer.schedule(timerTask, 500, 1000);
        bustime.add("0821");
        bustime.add("0830");
        bustime.add("0836");
        bustime.add("0846");
        bustime.add("0855");
        bustime.add("0903");
        bustime.add("0919");
        bustime.add("0925");
        bustime.add("0942");
        bustime.add("0952");
        bustime.add("1000");
        bustime.add("1009");
        bustime.add("1019");
        bustime.add("1030");
        bustime.add("1039");
        bustime.add("1049");
        bustime.add("1100");
        bustime.add("1108");
        bustime.add("1128");
        bustime.add("1310");
        bustime.add("1325");
        bustime.add("1340");
        bustime.add("1355");
        bustime.add("1410");
        bustime.add("1425");
        bustime.add("1440");
        bustime.add("1455");
        bustime.add("1510");



    }

    private Handler mHandler = new Handler();

    private Runnable mUpdateTimeTask = new Runnable() {
        public void run() {

            Date rightNow = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat(
                    " HH:mm:ss ");
            String dateString = formatter.format(rightNow);
            timeTv.setText(dateString);

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
