package com.haydertran.tranapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import java.util.ArrayList;

public  class AdapterClass extends BaseAdapter {
    final ArrayList<Item> arrayList;
    final Context context;
    final Conection conection;


    public AdapterClass(ArrayList<Item> arrayList, Context context,Conection conection) {
        this.arrayList = arrayList;
        this.context = context;
        this.conection=conection;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view=LayoutInflater.from(context).inflate(R.layout.main_adapter, null, false);

        Item item=arrayList.get(position);
      final Button  button=view.findViewById(R.id.but_item);
        button.setText(item.getName());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=button.getText().toString();
                conection.Onclick(name);

            }
        });


        return view;
    }
}
