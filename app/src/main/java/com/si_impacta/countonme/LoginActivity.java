package com.si_impacta.countonme;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText login;
    private EditText senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //logar = (Button) findViewById(R.id.btn_login);
    }

    public void Logar(View view){
        login = (EditText)findViewById(R.id.et_login);
        senha = (EditText)findViewById(R.id.et_senha);
        if (login.getText().toString().equals("willian@countonme.com.br") && senha.getText().toString().equals("12345")){
            login.setText("");
            senha.setText("");
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(intent);
        } else {
            Context contexto = getApplicationContext();
            String texto = "Login ou Senha inválidos, por favor verificar e tentar novamente";
            int duracao = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(contexto, texto,duracao);
            toast.show();
        }
    }

    public void criarConta(View view){
            Intent intent = new Intent(LoginActivity.this, CadastroActivity.class);
            startActivity(intent);
    }

}
