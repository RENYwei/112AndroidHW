package com.example.raddiobutton1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView txvShow = (TextView) findViewById(R.id.txvShow);
        txvShow.setTextSize(30);

        Intent intent = getIntent();
        txvShow.setText("訂單：" + "\n" + intent.getStringExtra("outputStr"));

    }
}