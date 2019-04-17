package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
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
    Button  bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;
    ImageView alarm;

    ArrayList<String> bustime = new ArrayList<>();
    ArrayList<String> bustime1 = new ArrayList<>();
    ArrayList<String> bustime2 = new ArrayList<>();
    ArrayList<String> bustime3 = new ArrayList<>();

    View.OnClickListener pop = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), popup1Activity.class);
            startActivity(i);
        }
    };

    View.OnClickListener pop1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), popup2Activity.class);
            startActivity(i);
        }
    };

    View.OnClickListener pop2= new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), popup3Activity.class);
            startActivity(i);
        }
    };

    View.OnClickListener pop3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), popup4Activity.class);
            startActivity(i);
        }
    };


    View.OnClickListener alarm1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(), Main2Activity.class);
            startActivity(i);
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
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                }
                else if (compare > 0){


                    nowtime.setText(element0);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                    break;
                }
                else if (compare < 0){
                    nowtime.setText("없음");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                }

            }

        }

    };
    View.OnClickListener bust2 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date curDate = new Date();
            SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
            String currentTime = now.format(curDate);




            for (int i = 0; i < bustime1.size(); i++) {
                String element1= bustime1.get(i).toString();
                int compare=element1.compareTo(currentTime);
                if(compare == 0){


                    nowtime.setText(element1);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                }
                else if (compare > 0){


                    nowtime.setText(element1);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                    break;
                }
                else if (compare < 0){
                    nowtime.setText("없음");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                }

            }
        }
    };
    View.OnClickListener bust3 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date curDate = new Date();
            SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
            String currentTime = now.format(curDate);




            for (int i = 0; i < bustime2.size(); i++) {
                String element2= bustime2.get(i).toString();
                int compare=element2.compareTo(currentTime);
                if(compare == 0){


                    nowtime.setText(element2);
                    // text animation s
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                }
                else if (compare > 0){


                    nowtime.setText(element2);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);

                    break;
                }
                else if (compare < 0){
                    nowtime.setText("없음");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                }

            }
        }
    };
    View.OnClickListener bust4 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Date curDate = new Date();
            SimpleDateFormat now = new SimpleDateFormat("HH:mm:ss");
            String currentTime = now.format(curDate);




            for (int i = 0; i < bustime3.size(); i++) {
                String element3= bustime3.get(i).toString();
                int compare=element3.compareTo(currentTime);
                if(compare == 0){


                    nowtime.setText(element3);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                }
                else if (compare > 0){


                    nowtime.setText(element3);
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                    break;
                }
                else if (compare < 0){
                    nowtime.setText("없음");
                    Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                    nowtime.startAnimation(anim);
                }

            }
        }
    };

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        bt4=(Button)findViewById(R.id.bt4);
        bt5=(Button)findViewById(R.id.bt5);
        bt6=(Button)findViewById(R.id.bt6);
        bt7=(Button)findViewById(R.id.bt7);
        bt8=(Button)findViewById(R.id.bt8);


        nowtime=(TextView)findViewById(R.id.nowtime);
        timeTv=(TextView) findViewById(R.id.timeTv);


        bt2.setOnClickListener(pop);
        bt4.setOnClickListener(pop1);
        bt6.setOnClickListener(pop2);
        bt8.setOnClickListener(pop3);




        nowtime.setTextColor(Color.GREEN);

        bt1.setOnClickListener(bust1);
        bt7.setOnClickListener(bust2);
        bt3.setOnClickListener(bust3);
        bt5.setOnClickListener(bust4);


        alarm=(ImageView)findViewById(R.id.alarm);
        alarm.setOnClickListener(alarm1);

        MainTimerTask timerTask = new MainTimerTask();
        mTimer = new Timer();
        mTimer.schedule(timerTask, 500, 1000);
        //안양역→대림대
        bustime.add("08:04:00");
        bustime.add("08:08:00");
        bustime.add("08:12:00");
        bustime.add("08:16:00");
        bustime.add("08:20:00");
        bustime.add("08:24:00");
        bustime.add("08:28:00");
        bustime.add("08:32:00");
        bustime.add("08:36:00");
        bustime.add("08:40:00");
        bustime.add("08:44:00");
        bustime.add("08:48:00");
        bustime.add("08:52:00");
        bustime.add("08:56:00");
        bustime.add("09:00:00");
        bustime.add("09:04:00");
        bustime.add("09:08:00");
        bustime.add("09:12:00");
        bustime.add("09:16:00");
        bustime.add("09:20:00");
        bustime.add("09:24:00");
        bustime.add("09:28:00");
        bustime.add("09:32:00");
        bustime.add("09:36:00");
        bustime.add("09:40:00");
        bustime.add("09:44:00");
        bustime.add("09:48:00");
        bustime.add("09:52:00");
        bustime.add("09:56:00");
        bustime.add("10:00:00");
        bustime.add("10:05:00");
        bustime.add("10:10:00");
        bustime.add("10:15:00");
        bustime.add("10:20:00");
        bustime.add("10:25:00");
        bustime.add("10:30:00");
        bustime.add("10:35:00");
        bustime.add("10:40:00");
        bustime.add("10:45:00");
        bustime.add("10:50:00");
        bustime.add("10:55:00");
        bustime.add("11:00:00");
        bustime.add("11:05:00");
        bustime.add("11:10:00");
        bustime.add("11:20:00");
        bustime.add("11:30:00");
        bustime.add("11:40:00");

        bustime.add("12:10:00");
        bustime.add("12:30:00");
        bustime.add("12:50:00");
        bustime.add("13:10:00");
        bustime.add("13:30:00");
        bustime.add("13:50:00");
        bustime.add("14:10:00");
        bustime.add("14:30:00");
        bustime.add("14:50:00");
        bustime.add("15:10:00");
        bustime.add("15:20:00");
        bustime.add("15:30:00");
        bustime.add("15:40:00");
        bustime.add("15:50:00");
        bustime.add("15:55:00");
        bustime.add("16:00:00");
        bustime.add("16:05:00");
        bustime.add("16:10:00");
        bustime.add("16:15:00");
        bustime.add("16:20:00");
        bustime.add("16:25:00");
        bustime.add("16:30:00");
        bustime.add("16:35:00");
        bustime.add("16:40:00");
        bustime.add("16:45:00");
        bustime.add("16:50:00");
        bustime.add("16:55:00");
        bustime.add("17:00:00");
        bustime.add("17:05:00");
        bustime.add("17:10:00");
        bustime.add("17:15:00");
        bustime.add("17:20:00");
        bustime.add("17:25:00");
        bustime.add("17:30:00");
        bustime.add("17:35:00");
        bustime.add("17:40:00");
        bustime.add("17:45:00");
        bustime.add("17:50:00");
        bustime.add("17:55:00");
        bustime.add("18:00:00");
        bustime.add("18:05:00");
        bustime.add("18:10:00");
        bustime.add("18:15:00");
        bustime.add("18:20:00");
        bustime.add("18:25:00");
        bustime.add("18:30:00");
        bustime.add("18:35:00");
        bustime.add("18:40:00");
        bustime.add("18:45:00");
        bustime.add("18:55:00");





        bustime.add("19:00:00");
        bustime.add("19:05:00");
        bustime.add("19:35:00");
        bustime.add("20:25:00");
        bustime.add("20:45:00");
        bustime.add("21:15:00");
        bustime.add("21:45:00");
        bustime.add("22:05:00");
        bustime.add("22:20:00");
        bustime.add("22:50:00");



        //범계역→대림대
        bustime1.add("08:05:00");
        bustime1.add("08:10:00");
        bustime1.add("08:35:00");
        bustime1.add("08:40:00");
        bustime1.add("09:10:00");
        bustime1.add("09:40:00");
        bustime1.add("10:10:00");
        bustime1.add("10:40:00");
        bustime1.add("16:00:00");
        bustime1.add("16:30:00");
        bustime1.add("17:00:00");
        bustime1.add("17:30:00");
        bustime1.add("18:00:00");
        bustime1.add("18:30:00");

        //대림대→안양역
        bustime2.add("08:08:00");
        bustime2.add("08:12:00");
        bustime2.add("08:16:00");
        bustime2.add("08:20:00");
        bustime2.add("08:24:00");
        bustime2.add("08:28:00");
        bustime2.add("08:32:00");
        bustime2.add("08:36:00");
        bustime2.add("08:40:00");
        bustime2.add("08:44:00");
        bustime2.add("08:48:00");
        bustime2.add("08:52:00");
        bustime2.add("08:56:00");
        bustime2.add("09:00:00");
        bustime2.add("09:04:00");
        bustime2.add("09:08:00");
        bustime2.add("09:12:00");
        bustime2.add("09:16:00");
        bustime2.add("09:20:00");
        bustime2.add("09:24:00");
        bustime2.add("09:28:00");
        bustime2.add("09:32:00");
        bustime2.add("09:36:00");
        bustime2.add("09:40:00");
        bustime2.add("09:44:00");
        bustime2.add("09:48:00");
        bustime2.add("09:52:00");
        bustime2.add("09:55:00");
        bustime2.add("10:00:00");
        bustime2.add("10:05:00");
        bustime2.add("10:10:00");
        bustime2.add("10:15:00");
        bustime2.add("10:20:00");
        bustime2.add("10:25:00");
        bustime2.add("10:30:00");
        bustime2.add("10:35:00");
        bustime2.add("10:40:00");
        bustime2.add("10:45:00");
        bustime2.add("10:50:00");
        bustime2.add("10:55:00");
        bustime2.add("11:00:00");
        bustime2.add("11:10:00");
        bustime2.add("11:20:00");
        bustime2.add("11:30:00");
        bustime2.add("12:00:00");
        bustime2.add("12:20:00");
        bustime2.add("12:40:00");
        bustime2.add("13:00:00");
        bustime2.add("13:20:00");
        bustime2.add("13:40:00");
        bustime2.add("14:00:00");
        bustime2.add("14:20:00");
        bustime2.add("14:40:00");
        bustime2.add("15:00:00");
        bustime2.add("15:10:00");
        bustime2.add("15:20:00");
        bustime2.add("15:30:00");
        bustime2.add("15:40:00");
        bustime2.add("15:40:00");
        bustime2.add("15:45:00");
        bustime2.add("15:50:00");
        bustime2.add("15:55:00");
        bustime2.add("16:00:00");
        bustime2.add("16:05:00");
        bustime2.add("16:10:00");
        bustime2.add("16:15:00");
        bustime2.add("16:20:00");
        bustime2.add("16:25:00");
        bustime2.add("16:30:00");
        bustime2.add("16:35:00");
        bustime2.add("16:40:00");
        bustime2.add("16:45:00");
        bustime2.add("16:50:00");
        bustime2.add("16:55:00");
        bustime2.add("17:00:00");
        bustime2.add("17:05:00");
        bustime2.add("17:10:00");
        bustime2.add("17:15:00");
        bustime2.add("17:20:00");
        bustime2.add("17:25:00");
        bustime2.add("17:30:00");
        bustime2.add("17:35:00");
        bustime2.add("17:40:00");
        bustime2.add("17:45:00");
        bustime2.add("17:50:00");
        bustime2.add("17:55:00");
        bustime2.add("18:00:00");
        bustime2.add("18:05:00");
        bustime2.add("18:10:00");
        bustime2.add("18:15:00");
        bustime2.add("18:20:00");
        bustime2.add("18:25:00");
        bustime2.add("18:30:00");
        bustime2.add("18:35:00");
        bustime2.add("18:40:00");
        bustime2.add("18:45:00");
        bustime2.add("18:50:00");
        bustime2.add("19:15:00");
        bustime2.add("20:15:00");
        bustime2.add("20:35:00");
        bustime2.add("21:05:00");
        bustime2.add("21:35:00");
        bustime2.add("21:55:00");
        bustime2.add("22:15:00");

        //대림대→범계역
        bustime3.add("08:20:00");
        bustime3.add("08:25:00");
        bustime3.add("08:55:00");
        bustime3.add("09:25:00");
        bustime3.add("09:55:00");
        bustime3.add("10:25:00");
        bustime3.add("15:45:00");
        bustime3.add("16:15:00");
        bustime3.add("16:45:00");
        bustime3.add("17:15:00");
        bustime3.add("17:45:00");
        bustime3.add("18:15:00");





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



}
