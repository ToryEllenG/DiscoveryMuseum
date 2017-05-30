package com.example.troygbv.discoverymuseum.Home;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.troygbv.discoverymuseum.R;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter{
    private Context context;
    private ArrayList<Integer> listId;
    private ArrayList<String> namesList;

    public ItemAdapter(Context context, ArrayList<Integer> ids, ArrayList<String> names) {
        this.context = context;
        this.listId=ids;
        this.namesList = names;
    }

    @Override
    public int getCount() {
        return namesList.size();
    }

    @Override
    public Object getItem(int position) {
        return namesList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = View.inflate(context, R.layout.items_list, null);
        }
        ImageView img = (ImageView) convertView.findViewById(R.id.iconImage);
        TextView tv = (TextView) convertView.findViewById(R.id.ItemName);
        img.setImageResource(listId.get(position));
        tv.setText(namesList.get(position));

        return convertView;
    }

}
