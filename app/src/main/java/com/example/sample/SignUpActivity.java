package com.example.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import customfonts.MyEditText;

public class SignUpActivity  extends AppCompatActivity {

    private TextView sup,act,sin,fbook;
    private MyEditText userName,pswd,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        final Context context = this;
        sup = (TextView)findViewById(R.id.sup);
        sin = (TextView)findViewById(R.id.sin);
        fbook = (TextView)findViewById(R.id.fboook);
        act = (TextView)findViewById(R.id.act);
        mail = (MyEditText)findViewById(R.id.mail);
        pswd = (MyEditText)findViewById(R.id.pswd);
        userName = (MyEditText)findViewById(R.id.user);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(context,App2Activity.class);
                startActivity(it);
            }
        });


        act .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sigup=new Intent(context,WelcomeActivity.class);
                startActivity(sigup);
            }
        });
    }
}
