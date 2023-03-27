package com.example.parci3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.parci3.db.DbContactos;

public class Producto extends AppCompatActivity {

    private EditText txtProducto, txtPrecio;
    private Button btnSigue;
    private Persona persona;

    private String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);

        txtProducto = findViewById(R.id.txtProducto);
        txtPrecio = findViewById(R.id.txtPrecio);
        btnSigue = findViewById(R.id.btnSigue);

        persona = (Persona) getIntent().getSerializableExtra("persona");


        btnSigue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DbContactos dbContactos = new DbContactos(Producto.this);

                long id = dbContactos.insetarContacto(persona.getTxtUser().toString(), txtProducto.getText().toString(), txtPrecio.getText().toString());

                if (id > 0){
                    Toast.makeText(Producto.this, "REGISTRO GUARDADO", Toast.LENGTH_LONG).show();
                    limpiar();
                }else{
                    Toast.makeText(Producto.this, "ERROR AL GUARDAR REGISTRO", Toast.LENGTH_LONG).show();
                }

                Intent intent = new Intent(Producto.this, Ver.class);
                startActivity(intent);
            }
        });
    }
    private void limpiar(){
        txtProducto.setText("");
        txtPrecio.setText("");
    }
}