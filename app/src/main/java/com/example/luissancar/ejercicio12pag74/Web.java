package com.example.luissancar.ejercicio12pag74;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class Web extends AppCompatActivity {


    WebView w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        w=(WebView)findViewById(R.id.webView);
        Bundle bun=getIntent().getExtras();
        w.loadUrl("http://"+bun.getString("webAdress").toString());
    }

    public void salir(View view){
        finish();
    }
}
