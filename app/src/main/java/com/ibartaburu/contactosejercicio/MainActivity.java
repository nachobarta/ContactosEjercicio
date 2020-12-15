package com.ibartaburu.contactosejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText pNombre;
    private EditText pTelefono;
    private EditText pEmail;
    private EditText pDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pNombre = (EditText) findViewById(R.id.nombre);
        pTelefono = (EditText) findViewById(R.id.telefono);
        pEmail = (EditText) findViewById(R.id.email);
        pDescripcion = (EditText) findViewById(R.id.descripcion);


        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            String nombreParam = bundle.getString("nombre");
            String telefonoParam = bundle.getString("telefono");
            String emailParam = bundle.getString("email");
            String descripcionParam = bundle.getString("descripcion");

            pNombre.setText(nombreParam);
            pTelefono.setText(telefonoParam);
            pEmail.setText(emailParam);
            pDescripcion.setText(descripcionParam);
        }
    }

    public void btSiguiente(View view) {
        Intent intent = new Intent(this, ConfirmarInfo.class);
        intent.putExtra("nombre", pNombre.getText().toString());
        intent.putExtra("telefono", pTelefono.getText().toString());
        intent.putExtra("email", pEmail.getText().toString());
        intent.putExtra("descripcion", pDescripcion.getText().toString());

        startActivity(intent);
    }

}