package com.example.fransizcasozluk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayılar(View view) {
        Intent i=new Intent(this,sayilar.class);
        startActivity(i);
    }

    public void aile(View view) {
        Intent i=new Intent(this,aile.class);
        startActivity(i);
    }

    public void renkler(View view) {
        Intent i=new Intent(this,renkler.class);
        startActivity(i);
    }

    public void kalip(View view) {
        Intent i=new Intent(this,kalip.class);
        startActivity(i);
    }
}
