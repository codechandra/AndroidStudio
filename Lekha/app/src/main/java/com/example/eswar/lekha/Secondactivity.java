package com.example.eswar.lekha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Secondactivity extends AppCompatActivity {

public static Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        TextView t1=(TextView)findViewById(R.id.textView2);
        //TextView t2=(TextView)findViewById(R.id.textView3);
        t1.setText(getIntent().getExtras().getString("mouli"));
        //t2.setText(getIntent().getExtras().getString("lekha"));

        b1=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View V)
                    {
                        Intent s=new Intent(Secondactivity.this,Thirdactivity.class);
                        startActivity(s);
                    }
                }
        );

    }
}
