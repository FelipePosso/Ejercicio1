package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nom,ape,n1,n2;
    Button envioDatos;
    String name,lName,num1,num2,sRes;
    float res,sN1,sN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        nom =  findViewById(R.id.nom);
        ape = findViewById(R.id.ape);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        envioDatos = findViewById(R.id.envioDatos);
    }
    public void recolectarDatos(){
        name=nom.getText().toString();
        lName=ape.getText().toString();
        num1=n1.getText().toString();
        num2=n2.getText().toString();
        sN1=Float.parseFloat(num1);
        sN2=Float.parseFloat(num2);
    }
    public void mostrarResultado(){

        String puntoCero = ".0";
        sRes = Float.toString(res);
        sRes = sRes.toUpperCase();
        String calPuntCero = sRes.substring(sRes.length() - 2);
        if (calPuntCero.equals(puntoCero)) {
            sRes = sRes.substring(0, sRes.length() - 2);
            sRes=String.valueOf(res);
        } else {
            sRes=(Math.round(res*100.0)/100.0)+"";
            sRes=String.valueOf(res);
        }
    }
    public void enviarDatos_Activity(View view){

        recolectarDatos();
        res=sN1+sN2;
        mostrarResultado();

        Intent intent= new Intent(this,activity_2.class);

        intent.putExtra("nombre",name);
        intent.putExtra("apellido",lName);
        intent.putExtra("num1",num1);
        intent.putExtra("num2",num2);
        intent.putExtra("resultado",sRes);

        startActivity(intent);

    }
}
