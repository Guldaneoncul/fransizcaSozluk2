package com.example.fransizcasozluk;

import android.content.Context;
import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class adapp  extends BaseAdapter{

    private Context context;
    private List<diller> words;
    private int resimId;

    public adapp(Context context, List<diller> words, int resimId) {
        this.context = context;
        this.words = words;
        this.resimId = resimId;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return words.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v=View.inflate(context,R.layout.satir,null);
        ImageView iv=(ImageView)v.findViewById(R.id.image1);
        TextView tv=(TextView)v.findViewById(R.id.fransizca_tv);
        LinearLayout layout=(LinearLayout)v.findViewById(R.id.text_container);
        TextView tv2=(TextView)v.findViewById(R.id.turkce_tv);
        iv.setImageResource(words.get(i).getResimId());
        tv.setText(words.get(i).getFr());
        tv2.setText(words.get(i).getTr());

        layout.setBackgroundColor(resimId);
        return v;
    }
}
