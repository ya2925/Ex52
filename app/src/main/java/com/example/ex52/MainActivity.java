package com.example.ex52;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    WebView wV;
    EditText URLinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wV = findViewById(R.id.wV);
        URLinput = findViewById(R.id.URLtext);

        wV.setWebViewClient(new MyWebViewClient());
        wV.getSettings().setJavaScriptEnabled(true);
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public void buttonClick(View view) {
        wV.loadUrl(URLinput.getText().toString());
    }
}