package com.example.cadastrocliente;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CreateUser extends AppCompatActivity {

    EditText nomecompleto;
    EditText email;
    Button salvar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_user);

        nomecompleto = findViewById(R.id.nome_completo);
        email = findViewById(R.id.email);
        salvar = findViewById(R.id.btnSalvar);

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
