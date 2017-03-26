package com.example.eswar.my;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private static Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onDance();
    }
    public void onDance()
    {
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent intent1=new Intent("com.example.eswar.my.SecondActivity");
                        startActivity(intent1);
                    }
                }
        );
        b2.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent intent2=new Intent("com.example.eswar.my.ThirdActivityy");
                        startActivity(intent2);
                    }
                }
        );

    }
}
