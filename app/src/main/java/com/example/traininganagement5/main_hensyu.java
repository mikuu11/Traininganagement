package com.example.traininganagement5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class main_hensyu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_hensyu);
        TextView text = (TextView)findViewById(R.id.textView);
        String t = text.getText().toString();
        TextView text2 = (TextView)findViewById(R.id.textView2);
        String t2 = text2.getText().toString();

        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
    }
}