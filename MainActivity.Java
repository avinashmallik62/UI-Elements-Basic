package com.example.uielements;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;
        public void show (View view) {
            t1.setVisibility(View.VISIBLE);
        }

        public void hide (View view){
        t1.setVisibility(View.INVISIBLE);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       t1 = (TextView) findViewById(R.id.textView);
        t1.setText("Ho gya!");

    }
}
