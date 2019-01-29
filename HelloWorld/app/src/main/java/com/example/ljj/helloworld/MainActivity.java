package com.example.ljj.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.btn_1);
        Switch sw1 = findViewById(R.id.sw1);
        final TextView tv1 = findViewById(R.id.tv_1);
        final TextView tv2 = findViewById(R.id.tv_2);
        final ImageView iv1 = findViewById(R.id.iv_1);
        final EditText et = findViewById(R.id.et);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("Hello, " + et.getText().toString() + "!");
            }
        });

        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    iv1.setImageResource(R.drawable.timg3);
                    tv2.setText("Male");
                }else {
                    iv1.setImageResource(R.drawable.timg);
                    tv2.setText("Female");
                }
            }
        });
    }
}
