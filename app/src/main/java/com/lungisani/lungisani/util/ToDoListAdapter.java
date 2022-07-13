package com.lungisani.lungisani.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.lungisani.lungisani.R;

import java.util.ArrayList;
import java.util.List;

public class ToDoListAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<String> toDoList = new ArrayList<>();

    public ToDoListAdapter(Context context){
        toDoList.add("first item");
        toDoList.add("second item");
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return toDoList.size();
    }

    @Override
    public Object getItem(int i) {
        return toDoList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        String message = getItem(position).toString();
        if (view == null)
            view = inflater.inflate(R.layout.to_do_list, null);

        TextView textView = view.findViewById(R.id.to_do_message);
        textView.setText(message);

        return view;
    }

    public void addItem(String newItem) {
        toDoList.add(newItem);
        notifyDataSetChanged();
    }
}
