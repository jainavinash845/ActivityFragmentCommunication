package com.example.avinash.activityfragment;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Button sendingbutton;
    EditText editmessage;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendingbutton=findViewById(R.id.button);
        editmessage=findViewById(R.id.send_message);





        sendingbutton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                BlankFragment blankFragment = new BlankFragment();
                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container,blankFragment,null);
                fragmentTransaction.commit();
                TextView textView = findViewById(R.id.show);
                String message=editmessage.getText().toString();
                textView.setText(message);

            }
        });
    }






}
