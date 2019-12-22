package com.example.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import customfonts.MyEditText;
import customfonts.MyRegulerText;

public class App2Activity extends AppCompatActivity {

    MyEditText username;
    MyEditText password;
    MyRegulerText login;
    private TextView acc,sin,sup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context = this;
        sup = (TextView)findViewById(R.id.sup);
        sin = (TextView)findViewById(R.id.sin);
        acc = (TextView)findViewById(R.id.act);
        username=(MyEditText)findViewById(R.id.email);

        password=(MyEditText)findViewById(R.id.pswd);
         login = (MyRegulerText)findViewById(R.id.sinup);

            sup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent sinInt= new Intent(context,SignUpActivity.class);
                    startActivity(sinInt);
                }
            });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
