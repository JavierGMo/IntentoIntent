package com.example.intentointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editNombre;
    private EditText editA;
    private EditText editB;
    private EditText editC;
    private EditText editApellido;
    private Button btnEjercicioUno;
    private Button btnEjercicioDos;
    private Intent intentoEjer1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ejercicio1
        editNombre = (EditText)findViewById(R.id.editTextNombre);
        editApellido = (EditText) findViewById(R.id.editTextApellido);
        editA = findViewById(R.id.editTextA);
        editB = findViewById(R.id.editTextB);
        editC = findViewById(R.id.editTextC);
        btnEjercicioUno = findViewById(R.id.buttonEjercicio1);
        btnEjercicioDos = findViewById(R.id.buttonEjercicio2);

        //Click Ejercicio1

        btnEjercicioUno.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editNombre.getText().toString() != "" && editApellido.getText().toString() != "") {
                    //Toast.makeText(MainActivity.this, "Entro al intent", Toast.LENGTH_SHORT).show();
                    intentoEjer1 = new Intent(MainActivity.this, SecondActivity.class);
                    intentoEjer1.putExtra("nombre", editNombre.getText().toString());
                    intentoEjer1.putExtra("apellido", editApellido.getText().toString());
                    startActivity(intentoEjer1);
                }else{
                    Toast.makeText(MainActivity.this, "Escriba en ambos campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //Ejercicio 2
        btnEjercicioDos.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentoEjer2 = new Intent(MainActivity.this, ThirdActivity.class);
                intentoEjer2.putExtra("cajaA", editA.getText().toString());
                intentoEjer2.putExtra("cajaB", editB.getText().toString());
                intentoEjer2.putExtra("cajaC", editC.getText().toString());
                startActivity(intentoEjer2);
            }
        });


    }
}
