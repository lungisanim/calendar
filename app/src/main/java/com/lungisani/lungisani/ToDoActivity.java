package com.lungisani.lungisani;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ToDoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_form);
    }

    public void addToDoItem(View view) {
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("item", message);
        setResult(Activity.RESULT_OK, intent);

        finish();
    }
}
