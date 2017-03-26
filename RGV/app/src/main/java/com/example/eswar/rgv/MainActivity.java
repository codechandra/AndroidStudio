package com.example.eswar.rgv;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private static RadioGroup R1;
    private static RadioButton RB;
    private static Button sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickk();
    }
    public void onClickk()
    {
        R1=(RadioGroup)findViewById(R.id.R_id);
        sb=(Button)findViewById(R.id.button);
        sb.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        int s_id=R.getCheckedRadioButton();
                        RB=(RadioButton)findViewById(s_id);
                        Toast.makeText(MainActivity.this,RB.getText().toString(),Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
