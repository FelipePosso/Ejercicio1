package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_2 extends AppCompatActivity {
    TextView nom,ape,n1,n2,mRes;
    String name,lName,num1,num2,sRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        nom=findViewById(R.id.nom);
        ape=findViewById(R.id.ape);
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        mRes=findViewById(R.id.mRes);

        name=getIntent().getStringExtra("nombre");
        lName=getIntent().getStringExtra("apellido");
        num1=getIntent().getStringExtra("num1");
        num2=getIntent().getStringExtra("num2");
        sRes=getIntent().getStringExtra("resultado");

        nom.setText(name);
        ape.setText(lName);
        n1.setText(num1);
        n2.setText(num2);
        mRes.setText(sRes);
    }
    public void volver_Activity(View view){

        Intent intent10= new Intent(this,MainActivity.class);
        startActivity(intent10);
    }
}
