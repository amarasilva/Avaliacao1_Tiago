package com.example.avaliacao1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.avaliacao1.model.Usuarios;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.botao1).setOnClickListener(new View.OnClickListener() {
            //pega o objeto botão "findViewById(R.id.botao1)" seta o objeto que vai
            //fazer a escuta do evento de clic

            @Override
            public void onClick(View view) {
                //evento de clic

                EditText login, senha;
                //cria as variaveis

                login = findViewById(R.id.entraLogin);
                senha = findViewById(R.id.entraSenha);
                //vincula os campos "entraLogin e entraSenha" as variaveis

                Usuarios lista = new Usuarios();
                //estancia da classe Usuários

                for (int i = 0; i < lista.getUser().size(); i++) {
                    Usuarios temp = lista.users.get(i);
                //varre a lista

                    if (login.getText().toString().equals(temp.getNome()) && senha.getText().toString().equals(temp.getSenha())) {
                //compara o que foi digitado pelo usuário com o que está na lista se bater cria a intent e executa
                        Intent intent = new Intent(view.getContext(), Activity2.class);
                //cria o objeto intent intent
                        startActivity(intent);
                //dispara a intent criado
                    }


                }


            }
        });
    }

}



