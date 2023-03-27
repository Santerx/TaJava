package com.example.parci3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Usuario extends AppCompatActivity {

    private EditText txtuser, txtpassword;
    private Button btnSigue;

    private Persona persona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        txtuser = findViewById(R.id.txtUser);
        txtpassword = findViewById(R.id.txtPassword);
        btnSigue = findViewById(R.id.btnSigue);


        btnSigue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtUser = txtuser.getText().toString();
                persona = new Persona(txtUser);

                Intent intent = new Intent(Usuario.this, Producto.class);
                intent.putExtra("persona", persona);
                startActivity(intent);
                limpiar();
            }
        });
    }

    private void limpiar() {
        txtuser.setText("");
        txtpassword.setText("");
    }
}