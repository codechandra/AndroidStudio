package com.example.eswar.attendancecalci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static Button b1;
    public static EditText e1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i1=new Intent(MainActivity.this,Secondactivity.class);
                        startActivity(i1);
                    }
                }
        );
    }
}
