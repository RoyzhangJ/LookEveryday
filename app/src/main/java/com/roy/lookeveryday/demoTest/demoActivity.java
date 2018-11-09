package com.roy.lookeveryday.demoTest;

import android.net.http.SslError;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.Toast;

import com.roy.lookeveryday.R;

/**
 * Created by zhang on 2018/11/9.
 */
public class demoActivity extends AppCompatActivity implements DemoContract.View{
    WebView webView;
    Button button;
    DemoPresenter demoPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        demoPresenter = new DemoPresenter(this);
        setContentView(R.layout.activity_demo);
        webView = (WebView)findViewById(R.id.demo_webview);
        button = (Button)findViewById(R.id.start_load);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                demoPresenter.startLoad();
            }
        });
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
    }

    @Override
    public void loadFinish(String url) {
        webView.loadUrl(url);
        Toast.makeText(this,"回来了",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(DemoContract.Presenter presenter) {

    }
}
