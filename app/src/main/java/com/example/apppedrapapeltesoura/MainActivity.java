package com.example.apppedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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

        ImageView ImageResultado = findViewById(R.id.imageResult);
        TextView txtView = findViewById(R.id.textResulFinal);

        int numero = new Random().nextInt(3);

        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opApp = opcoes[numero];

        switch (opApp){
            case "pedra":
                ImageResultado.setImageResource(R.drawable.pedra);
                break;

            case "papel":
                ImageResultado.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                ImageResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        if(( opApp == "tesoura" && opçãoSelecionada == "papel") ||
                (opApp == "papel" && opçãoSelecionada == "pedra") ||
                (opApp == "pedra" && opçãoSelecionada == "tesoura")
                //App vence
        ){
            txtView.setText("Você Perdeu");
        }else if(( opApp == "papel" && opçãoSelecionada == "tesoura") ||
                (opApp == "pedra" && opçãoSelecionada == "papel") ||
                (opApp == "tesoura" && opçãoSelecionada == "papel")
                //player Vence
        ){
            txtView.setText("Você Ganhou!");
        }else{
            txtView.setText("Empatou!");
        }

        System.out.println("item clicado:" + numero);
    }
}
