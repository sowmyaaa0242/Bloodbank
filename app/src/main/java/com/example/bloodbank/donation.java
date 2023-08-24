package com.example.bloodbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class donation extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] bloodgroup={"A+","A-","B+","B-","O+","O-","AB+","AB-"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);
        Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,bloodgroup);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
    {
        Toast.makeText(getApplicationContext(),bloodgroup[position] , Toast.LENGTH_LONG).show();
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0)
    {


    }
    public void listdonors()
    {
        Intent i=new Intent(getApplicationContext(),listactivity.class);
        startActivity(i);

    }
}

