package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class popup2Activity extends Activity {

    Button back2;

    View.OnClickListener click2 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(popup2Activity.this,MainActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup2);

        back2 = findViewById(R.id.back2);
        back2.setOnClickListener(click2);
    }
}
