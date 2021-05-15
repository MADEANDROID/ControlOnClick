package com.example.controlonclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*btn1 = (Button) findViewById(R.id.btnClaseAnonima);
        btn2 = (Button) findViewById(R.id.btnImplements);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);*/
    }
    //activar el on click en la interface
        @Override
        public void onClick (View v){

            switch (v.getId()) {
                case R.id.btnClaseAnonima:
                    Toast.makeText(getApplicationContext(),"desde la Anonimo",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnImplements:
                    Toast.makeText(getApplicationContext(), "desde el implements 000", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnOnClick:
                    Toast.makeText(getApplicationContext(), "desde el metodo", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }


        /* 1RA FORMA DE MANEJO DE BOTON**********
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"desde la Anonimo",Toast.LENGTH_SHORT).show();
            }
        });
        2DA FORMA DE LLAMAR AL BOTON***********
            public void onClick(View v) {
            Toast.makeText(getApplicationContext(),"desde el implements 000",Toast.LENGTH_SHORT).show();
}

    }
        // trabajando botones con el if para reducir metodos***************
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnClaseAnonima){
            Toast.makeText(getApplicationContext(),"desde la Anonimo",Toast.LENGTH_SHORT).show();
        }

        if (v.getId()==btn2.getId()){
            Toast.makeText(getApplicationContext(),"desde el implements 000",Toast.LENGTH_SHORT).show();
        }
        if (v.getId()==R.id.btnOnClick){
            Toast.makeText(getApplicationContext(),"desde el metodo",Toast.LENGTH_SHORT).show();
        }
    }

//3RA FORMA DE LLAMAR AL BOTON ************
    public void eventoBoton(View view) {
        Toast.makeText(getApplicationContext(),"desde el metodo",Toast.LENGTH_SHORT).show();
    }
    }*/