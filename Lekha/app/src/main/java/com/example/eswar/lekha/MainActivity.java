package com.example.eswar.lekha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static EditText e1,e2;
    public static Button B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         e1=(EditText)findViewById(R.id.editText);
       // e2=(EditText)findViewById(R.id.editText2);
        B=(Button)findViewById(R.id.button);
        B.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i=new Intent(MainActivity.this,Secondactivity.class);
                        i.putExtra("mouli",e1.getText().toString());
                       // i.putExtra("lekha",e2.getText().toString());
                        startActivity(i);
                    }
                }
        );

    }
}
