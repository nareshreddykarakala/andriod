package com.example.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnSubmit;
    EditText userName;
    EditText passWord;
    Button regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        final Context context = this;
        userName=(EditText) findViewById(R.id.usernameET);
        passWord = (EditText) findViewById(R.id.passwordET);
        btnSubmit = (Button) findViewById(R.id.loginBtn);
        regBtn= (Button) findViewById(R.id.registerBtn);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, App2Activity.class);
                startActivity(intent);
            }
        });

    }

}
