package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    TextView t1,t2;
    EditText e1,e2;
    Button b1;
    String w="admin";
    String p="admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        t1=findViewById(R.id.email);
        t2=findViewById(R.id.password);
        e1=findViewById(R.id.email1);
        e2=findViewById(R.id.password1);
        b1=findViewById(R.id.signin);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View V) {
                String un=e1.getText().toString();
                String pass=e2.getText().toString();
                if(w.equals(un)&&(p.equals(pass)))
                {
                    Toast.makeText(getApplicationContext(),"success"+un, Toast.LENGTH_LONG).show();
                    Intent i=new Intent(getApplicationContext(),donation.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Authentication failed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
