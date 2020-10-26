package com.example.check_boxes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4;
    Button btn;
    String answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=findViewById(R.id.checkBox);
        cb2=findViewById(R.id.checkBox2);
        cb3=findViewById(R.id.checkBox3);
        cb4=findViewById(R.id.checkBox4);
        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append("Choosen Options are:");
                if (cb1.isChecked()) {
                    result.append("\n");
                    result.append(cb1.getText().toString());

                }
                if (cb2.isChecked()) {
                    result.append("\n");
                    result.append(cb2.getText().toString());

                }
                if (cb3.isChecked()) {
                    result.append("\n");
                    result.append(cb3.getText().toString());

                }
                if (cb4.isChecked()) {
                    result.append("\n");
                    result.append(cb4.getText().toString());

                }
                if (!cb1.isChecked() && !cb2.isChecked() && !cb3.isChecked() && !cb4.isChecked()) {
                    result.append("\n None");




                }
                answer = result.toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);

                intent.putExtra("result",answer);
                startActivity(intent);
            }
        });


    }
}