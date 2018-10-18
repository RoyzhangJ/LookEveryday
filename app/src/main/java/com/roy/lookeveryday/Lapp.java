package com.roy.lookeveryday;

import android.app.Application;

/**
 * Created by zhang on 2018/10/17.
 */

public class Lapp extends Application {
    private static Lapp lapp;
    @Override
    public void onCreate() {
        super.onCreate();
        lapp = this;
    }

    public static Lapp getLapp(){
        return lapp;
    }
}
