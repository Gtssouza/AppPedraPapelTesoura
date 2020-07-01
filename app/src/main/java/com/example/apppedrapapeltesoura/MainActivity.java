package com.example.apppedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        System.out.println("Opção Pedra selecionada");
        this.opcaoSelecionada(1);
    }

    public void selecionadoPapel(View view){
        System.out.println("Opção Papel selecionada");
        this.opcaoSelecionada(2);
    }

    public void selecionadoTesoura(View view){
        System.out.println("Opção Tesoura selecionada");
        this.opcaoSelecionada(3);
    }

    public void opcaoSelecionada(int opçãoSelecionada){
        System.out.println(opçãoSelecionada);
    }
}
