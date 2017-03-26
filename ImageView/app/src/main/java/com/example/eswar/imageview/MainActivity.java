package com.example.eswar.imageview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity
    private static ListView list_view;
    private static String[] Names=new String[]{"mouli","Manu","Sairam"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void listView() {

    }
}
