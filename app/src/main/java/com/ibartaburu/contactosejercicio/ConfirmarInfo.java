package com.ibartaburu.contactosejercicio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarInfo extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_info);

        Bundle bundle = getIntent().getExtras();

        tvNombre = (TextView) findViewById(R.id.textNombre);
        tvTelefono = (TextView) findViewById(R.id.textTelefono);
        tvEmail = (TextView) findViewById(R.id.textEmail);
        tvDescripcion = (TextView)  findViewById(R.id.textDescripcion);

        if (bundle != null) {
            String nombreParam = bundle.getString("nombre");
            String telefonoParam = bundle.getString("telefono");
            String emailParam = bundle.getString("email");
            String descripcionParam = bundle.getString("descripcion");

            tvNombre.setText(nombreParam);
            tvTelefono.setText(telefonoParam);
            tvEmail.setText(emailParam);
            tvDescripcion.setText(descripcionParam);
        }

    }

    public void btVolver(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("nombre",tvNombre.getText().toString());
        intent.putExtra("telefono",tvTelefono.getText().toString());
        intent.putExtra("email",tvEmail.getText().toString());
        intent.putExtra("descripcion",tvDescripcion.getText().toString());
        startActivity(intent);
    }
}