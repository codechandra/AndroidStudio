package com.example.eswar.senddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
public static TextView t1,t2;
    String message="myname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i1=getIntent();
        int f=i1.getIntExtra(message);
        //setContentView(R.layout.activity_second);
        t1.setText(Integer.toString(f));
    }
    public void onShow()
    {
        t1=(TextView) findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
    }
}
