package com.roy.lookeveryday.demoTest;

/**
 * Created by zhang on 2018/11/9.
 */
public class DemoPresenter implements DemoContract.Presenter {
    DemoContract.View demoView;
    public DemoPresenter(DemoContract.View view){
        demoView = view;
    }

    @Override
    public void startLoad() {
        //doSometing
        String url = "https://www.baidu.com";
        demoView.loadFinish(url);
    }
}
