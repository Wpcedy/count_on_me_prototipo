package com.si_impacta.countonme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ChatActivity extends AppCompatActivity {

    private TextView chat;
    private TextView mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
    }

    public void Enviar(View view){
        chat = (TextView)findViewById(R.id.mensagem);

        mensagem = (TextView)findViewById(R.id.nova_mensagem);

        chat.setText("Willian: "+mensagem.getText());

        mensagem.setText("");
    }
}
