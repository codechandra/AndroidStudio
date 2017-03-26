package com.example.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.eswar.actitvities.R;

public class SecondActivity extends AppCompatActivity {
TextView t1=(TextView)findViewById(R.id.textView3);
    Intent intent=getIntent();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
