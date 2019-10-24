package com.example.intentointent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    private Bundle boncheActTres;
    private TextView txtVResX1;
    private TextView txtVResX2;
    private int A;
    private int B;
    private int C;
    private double resFlotante;
    private String resX;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        txtVResX1 = findViewById(R.id.txtResX1);
        txtVResX2 = findViewById(R.id.txtResX2);

        boncheActTres = getIntent().getExtras();
        if(boncheActTres!=null){
            A = Integer.parseInt(boncheActTres.getString("cajaA"));
            B = Integer.parseInt(boncheActTres.getString("cajaB"));
            C = Integer.parseInt(boncheActTres.getString("cajaC"));
            resFlotante = ((-1)*B)/(2*A);
            resX = argumento(A, B, C);
            txtVResX1.setText(resFlotante+"+"+resX);
            txtVResX2.setText(resFlotante+"-"+resX);

        }else{
            Toast.makeText(ThirdActivity.this, "El intento viene vacio", Toast.LENGTH_SHORT).show();
        }



    }
    public String argumento(int A, int B, int C){
        float resTmp = 0;

        resTmp = ((B*B)-(4*A*C));
        if(resTmp<0){
            resTmp = (-1)*(resTmp);
            resTmp = (float)(Math.sqrt(resTmp)/2*A);
            return resTmp + "i";
        }else{
            return resTmp + "";
        }
    }
}
