package com.roy.lookeveryday.demoTest;

import com.roy.lookeveryday.base.presenter.BasePresenter;
import com.roy.lookeveryday.base.view.BaseView;

/**
 * Created by zhang on 2018/11/9.
 */
public interface DemoContract {
    interface View extends BaseView<Presenter>{
        void loadFinish(String url);
    }

    interface Presenter extends BasePresenter{
        void startLoad();
    }
}
