package com.lungisani.lungisani;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.lungisani.lungisani.util.ToDoListAdapter;

public class MainActivity extends AppCompatActivity {

    private ToDoListAdapter toDoListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.toDoListAdapter = new ToDoListAdapter(this);
        ListView toDoListView = findViewById(R.id.to_do_list);
        toDoListView.setAdapter(toDoListAdapter);
    }

    public void openToDoForm(View view) {
        startActivityForResult(new Intent(this, ToDoActivity.class), 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1){
            if (resultCode == RESULT_OK){
                String newItem = data.getStringExtra("item");
                this.toDoListAdapter.addItem(newItem);
            }
        }
    }
}