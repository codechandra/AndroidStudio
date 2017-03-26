package com.example.eswar.newactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private static Button b_sbm1,b_sbm2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onListnerr();
    }
    public void onListnerr()
    {
        b_sbm1=(Button)findViewById(R.id.button);
        b_sbm1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent intentt=new Intent("com.example.eswar.newactivity.MainActivity");
                            startActivity(intentt);
                        Intent intenttt=new Intent("com.example.eswar.newactivity.Main3Activity");
                        startActivity(intenttt);
                    }
                }
        );
    }
}
