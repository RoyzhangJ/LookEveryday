package com.roy.lookeveryday.mylibrary.network;

import android.content.Context;

import com.android.volley.RequestQueue;

/**
 * Created by zhang on 2018/10/17.
 */

public class NetHelpler {
    private static RequestQueue requestQueue;

    private RequestQueue getRequestQueue(){
        if(requestQueue == null){
            requestQueue = new RequestQueue(Lapp)
        }
    }

    public void get(){

    }
}
