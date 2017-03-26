package com.example.eswar.first;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private static Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickButtonListner();
    }
    public void onClickButtonListner()
    {
        click=(Button)findViewById(R.id.button);
        click.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent intent=new Intent("com.example.eswar.first.Main2Activity");
                        startActivity(intent);
                    }
                }
        );
    }
}
