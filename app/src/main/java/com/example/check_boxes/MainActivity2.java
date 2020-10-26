package com.example.check_boxes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView text;
    String output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text=findViewById(R.id.Textview);

        Intent intent=getIntent();
        output=intent.getStringExtra("result");

        text.setText(output);
    }
}