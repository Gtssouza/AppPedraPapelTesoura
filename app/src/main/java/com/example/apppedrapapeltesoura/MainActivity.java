package com.example.apppedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view){
        System.out.println("Opção Pedra selecionada");
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view){
        System.out.println("Opção Papel selecionada");
        this.opcaoSelecionada("papel");
    }

    public void selecionadoTesoura(View view){
        System.out.println("Opção Tesoura selecionada");
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opçãoSelecionada){

        int numero = new Random().nextInt(3);

        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opApp = opcoes[numero];

        System.out.println("item clicado:" + numero);
    }
}
