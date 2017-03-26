package com.example.eswar.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
    /*public void onListner()
    {
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent intent=new Intent("com.example.eswar.newactivity.Main3Activity");

                        startActivity(intent);
                    }
                }
        );
    }*/
}
