package com.roy.lookeveryday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ArrayList list = new ArrayList();
        list.add("a");
        list.add(1);
        Log.e("zhang223",""+list.get(0));
//        try {
//            Class a = Class.forName("com.roy.lookeveryday.Lapp");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
