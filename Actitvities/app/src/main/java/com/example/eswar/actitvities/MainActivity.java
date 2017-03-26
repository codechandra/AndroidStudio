package com.example.eswar.actitvities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.activities.SecondActivity;

public class MainActivity extends AppCompatActivity {
public static EditText e1;
    public static Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void on(View vi)
    {
     e1=(EditText)findViewById(R.id.editText2);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View V)
                    {
                       // String s=e1.getText().toString();
                       // int a=Integer.parseInt(s);
                        Intent intent =new Intent("com.example.activities.SecondActivity");
                     //  intent.putExtra("Hai",s);
                        startActivity(intent);
                    }
                }
        );
    }
}
