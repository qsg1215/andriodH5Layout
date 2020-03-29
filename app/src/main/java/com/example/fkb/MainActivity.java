package com.example.fkb;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       //  webview
        WebView myWebView;
        String URL = "http://pages.fkb.cdsunrise.net:28666/work";
        myWebView = (WebView) findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setLoadsImagesAutomatically(true);
        myWebView.getSettings().setAppCacheEnabled(true); // Disable while debugging
        myWebView.loadUrl(URL);
    }
}
