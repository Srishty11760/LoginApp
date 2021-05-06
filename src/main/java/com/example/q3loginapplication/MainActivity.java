 package com.example.q3loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText name, password;
    String pass="login123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=findViewById(R.id.button);
        name=findViewById(R.id.editTextTextPersonName);
        password=findViewById(R.id.editTextTextPassword);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                if (name.getText().toString().equals("admin")&&password.getText().toString().equals(pass))
                    Toast.makeText(getApplicationContext(),"Login Successful !!", Toast.LENGTH_LONG).show();
                else {
                    Toast.makeText(getApplicationContext(), "wrong username/password!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}