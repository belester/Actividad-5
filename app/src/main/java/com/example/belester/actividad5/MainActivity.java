package com.example.belester.actividad5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText nombre;
EditText apellido;
EditText  Edad;
Button boton;
ListView lv1;
List<String> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.apellido);
        Edad = (EditText) findViewById(R.id.edad);
        boton = (Button) findViewById(R.id.imprimir);
        lv1 =(ListView)findViewById(R.id.VISTA);
        final ArrayAdapter<String>adaptador = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,lista);

        lv1 .setAdapter(adaptador);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lv1.setAdapter(null);
                String nombr = nombre.getText().toString();
                String apellid = apellido.getText().toString();
                String eda = Edad.getText().toString();
                lista.add(eda);
                lista.add(nombr);
                lista.add(apellid);
                lv1.setAdapter(adaptador);

            }
        });
    }
}
