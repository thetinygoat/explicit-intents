package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String MESSAGE_REPLY = "extraRepl";
    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tv = findViewById(R.id.intentReciever);
        tv.setText(message);
        et = findViewById(R.id.editText_second);
    }

    public void returnReply(View view) {
        String message = et.getText().toString();
        Intent reply = new Intent();
        reply.putExtra(MESSAGE_REPLY, message);
        setResult(RESULT_OK, reply);
        finish();
    }
}
