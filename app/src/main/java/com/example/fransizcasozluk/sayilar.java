package com.example.fransizcasozluk;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class sayilar extends AppCompatActivity {
    List<diller> diller=new ArrayList<>();
    ListView liste;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.satir);
        diller.add(new diller("bir","une",R.drawable.bir,R.raw.birr));
        diller.add(new diller("iki","deux",R.drawable.iki,R.raw.birr));
       adapp adaptor=new adapp(this,diller,R.color.colorAccent);
       liste=(ListView)findViewById(R.id.listee);
         liste.setAdapter(adaptor);

}}
