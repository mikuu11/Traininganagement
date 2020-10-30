package com.example.traininganagement5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class main_tuika extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tuika);
        TextView text1 = (TextView)findViewById(R.id.textView6);
        String t1 = text1.getText().toString();
        TextView text2 = (TextView)findViewById(R.id.textView7);
        String t2 = text2.getText().toString();

        TextView text3 = (TextView)findViewById(R.id.textView8);
        String t3 = text3.getText().toString();
        TextView text4 = (TextView)findViewById(R.id.textView9);
        String t4 = text4.getText().toString();
        TextView text5 = (TextView)findViewById(R.id.textView10);
        String t5 = text5.getText().toString();




    }
}