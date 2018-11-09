package com.roy.lookeveryday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.roy.lookeveryday.demoTest.demoActivity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    Button demoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        demoButton =  (Button)findViewById(R.id.button_demo);
        demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,demoActivity.class);
                startActivity(intent);
            }
        });
    }
}
