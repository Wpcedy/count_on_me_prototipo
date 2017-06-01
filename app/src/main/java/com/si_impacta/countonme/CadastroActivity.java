package com.si_impacta.countonme;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {


    private EditText nome;
    private EditText email;
    private EditText senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void criarUsuario(View view){
        Context contexto = getApplicationContext();

        nome = (EditText)findViewById(R.id.nome);
        email = (EditText)findViewById(R.id.email);
        senha = (EditText)findViewById(R.id.senha);
        if (nome.getText().toString().equals("") || email.getText().toString().equals("") || senha.getText().toString().equals("")) {
            String texto = "Os campos seguintes são obrigatórios: Nome, Email, Senha;";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        } else {
            String texto = "Usuário registrado com sucesso";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
            finish();
        }
    }
}
