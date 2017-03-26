package com.example.eswar.attendancecalci;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Secondactivity extends AppCompatActivity {
    public static Button b2;

    private static final String TAG = "Secondactivity";

TextView t1,t2;
    public static float lastMonthPercentage;
    public static int totalWorkingDays, monthNumber;
    public static EditText e2, e3, e4;
    public double lmp;
    public int cmn, twd;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);



        // lastMonthPercentage=Float.parseFloat(e2.getText().toString());
        //totalWorkingDays=Integer.parseInt(e3.getText().toString());
        //monthNumber=Integer.parseInt(e4.getText().toString());*/


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void newMethod(View v) {
        t1=(TextView)findViewById(R.id.textView3);
         t2=(TextView) findViewById(R.id.textView4);
        b2 = (Button) findViewById(R.id.button4);
        e2 = (EditText) findViewById(R.id.editText14);
        e3 = (EditText) findViewById(R.id.editText15);
        e4 = (EditText) findViewById(R.id.editText16);
        lmp = Double.parseDouble(e2.getText().toString());
        twd = Integer.parseInt(e3.getText().toString());
        cmn = Integer.parseInt(e4.getText().toString());


        b2.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        if (lmp > 100 || lmp < 0) {

                            Toast.makeText(getApplicationContext(), "rei yedava last month percentage 1 to 100 lope undali", Toast.LENGTH_LONG).show();

                            Intent i1=new Intent(Secondactivity.this,Secondactivity.class);
                            startActivity(i1);


                        }
                        if(twd>31)
                        {
                            Toast.makeText(getApplicationContext(), "Babu rajinikanth month lo 31 kanna yekkuva days undavamma", Toast.LENGTH_LONG).show();
                            Intent i1=new Intent(Secondactivity.this,Secondactivity.class);
                            startActivity(i1);
                        }

                        if (cmn > 6 || cmn < 1) {
                            Toast.makeText(getApplicationContext(), "Babu rajinikanth current month number 1-6 lope undalamma", Toast.LENGTH_LONG).show();
                            Intent i1=new Intent(Secondactivity.this,Secondactivity.class);
                            startActivity(i1);
                        }
                         if (cmn == 1 && lmp > 0) {
                            Toast.makeText(getApplicationContext(), "If this is the first month how did u get the last months percentage??", Toast.LENGTH_LONG)
                                    .show();
                             Intent i1=new Intent(Secondactivity.this,Secondactivity.class);
                             startActivity(i1);


                        }


                            int wd75 = (int) (((75 * cmn) -( lmp*(cmn-1))) * twd) / 100;
                            int wd65 = (int) (((65 * cmn) - (lmp*(cmn-1))) * twd) / 100;
                            if (wd75 > twd && wd65 > twd) {
                                t2.setText("Sorry you are helpless you need to attend " + wd65 + " days to get atleast 65%");
                                t1.setText("Sorry you are helpless you need to attend  " + wd75 + " days to get atleast 75%");

                            }
                            else if (wd65 < twd && wd75 > twd) {
                                t1.setText("Sorry! You've to attend " + wd75 + "days out of " + twd + "to get 75% which is impossible in this month ");
                                t2.setText("Great you've to attend " + wd65 + "days out of" + twd + "to get 65%");
                            } else
                            {
                                t1.setText("You've to attend " + wd75 + " days out of " + twd + " to get 75%");
                                t2.setText("You've to attend " + wd65 + " days out of " + twd + " to get 65%");
                            }



                    }

                }
        );

    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Secondactivity Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
