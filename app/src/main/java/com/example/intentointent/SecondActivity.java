package com.example.intentointent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    private Bundle bonchedeMain;
    private TextView textNombre;
    private TextView txtApellido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textNombre = findViewById(R.id.secondtxtVNombre);
        txtApellido = findViewById(R.id.viewApellido);

        bonchedeMain = getIntent().getExtras();
        if(bonchedeMain!=null){
            if(bonchedeMain.getString("nombre")!= null && bonchedeMain.getString("apellido")!=null){
                textNombre.setText(bonchedeMain.getString("nombre"));
                txtApellido.setText(bonchedeMain.getString("apellido"));
            }else{
                Toast.makeText(SecondActivity.this, "Se necesita nombre y apellido", Toast.LENGTH_SHORT).show();
            }

        }else{
            Toast.makeText(SecondActivity.this, "No se envio algun intento", Toast.LENGTH_SHORT).show();
        }



    }
}
