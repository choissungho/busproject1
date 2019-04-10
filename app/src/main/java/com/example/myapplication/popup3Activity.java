package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class popup3Activity extends Activity {

    Button back3;

    View.OnClickListener click3 =new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(popup3Activity.this,MainActivity.class);
            startActivity(i);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup3);

        back3 = findViewById(R.id.back3);
        back3.setOnClickListener(click3);
    }
}
