package com.example.eswar.senddata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static EditText e1,e2;
    public static Button b_sbm;
    String message="myname";
    //int a[]=new int[10];
    public static int a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void getDetails(View v){
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
         a=Integer.parseInt(e1.getText().toString());
        //int a[1]=Integer.parseInt(e1.getText().toString());

        b_sbm=(Button)findViewById(R.id.button);
        b_sbm.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        Intent i1=new Intent("com.example.eswar.senddata.SecondActivity");
                        i1.putExtra(message,a);
                        startActivity(i1);

                    }
                }
        );
    }
}
