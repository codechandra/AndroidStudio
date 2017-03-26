package com.example.eswar.adder;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
//private EditText pass_word;
  //  private Button button_sbm;
    //private CheckBox check1,check2,check3,check4,check5,check6;
   // private Button sum;

    // * ATTENTION: This was auto-generated to implement the App Indexing API.
    // * See https://g.co/AppIndexing/AndroidStudio for more information.
     private static RadioGroup R1;
    private static RadioButton radio_b;
    private static Button s;
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        onCall();
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public  void onCall()
    {
        R1= (RadioGroup)findViewById(R.id.one);
        //radio_b=(RadioButton)findViewById(R.id.radioButton8);
        //radio_2=(RadioButton)findViewById(R.id.radioButton9);
        s=(Button)findViewById(R.id.button4);
        s.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                        int s_id=R1.getCheckedRadioButtonId();
                        radio_b=(RadioButton)findViewById(s_id);
                        Toast.makeText(MainActivity.this,radio_b.getText().toString(),Toast.LENGTH_SHORT).show();
                    }
                }
        );
        
/*    public void onDance(View v)
    {
        check1=(CheckBox)findViewById(R.id.checkBox);
        check2=(CheckBox)findViewById(R.id.checkBox2);
        check3=(CheckBox)findViewById(R.id.checkBox3);
        check4=(CheckBox)findViewById(R.id.checkBox4);
        check5=(CheckBox)findViewById(R.id.checkBox5);
        check6=(CheckBox)findViewById(R.id.checkBox6);
        TextView e1=(TextView)findViewById(R.id.textView);
       sum=(Button)findViewById(R.id.button);
        int c=0;
        if(((Check1.isChecked()){
            e1.setText(Integer.toString(c));
       }
       /* sum.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                StringBuffer result=new StringBuffer();
                result.append("\nDog:").append(check1.isChecked());
                result.append("\nfox:").append(check2.isChecked());
                result.append("\npig:").append(check3.isChecked());
                Toast.makeText(MainActivity.this,result.toString(),Toast.LENGTH_LONG).show();

            }

        }

        );*/

   /* public void addListneronButton()
    {
        pass_word=(EditText)findViewById(R.id.editText11);
        button_sbm=(Button)findViewById(R.id.button3);
        button_sbm.setonClickListener(new View.onClickListener(){

        }
        {

        });*/
    }
/*    @SuppressLint("SetTextI18n")
    public void onGreater(View v)
    {
        EditText e1=(EditText)findViewById(R.id.editText9);
        EditText e2=(EditText)findViewById(R.id.editText10);
        TextView t1=(TextView)findViewById(R.id.textView4);
        int a=Integer.parseInt(e1.getText().toString());
        int b=Integer.parseInt(e2.getText().toString());
        int c;
        if(a>b)
        {
            c=a;
        }
        else
        {
            c=b;
        }
        t1.setText(Integer.toString(c));

    }*/


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
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
