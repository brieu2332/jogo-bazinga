package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class jogoTela extends AppCompatActivity {

    class Jogo {
        private int escolhaUsuario;
        private int escolhaComputador;
        private String[] opcoes = {"Pedra", "Papel", "Tesoura", "Lagarto", "Spock"};

        public void escolhaDoUsuario(int escolha) {
            this.escolhaUsuario = escolha;
        }

        public void escolhaDoComputador() {
            this.escolhaComputador = new Random().nextInt(5);
        }

        public int img() {
            int imagemResult;
            switch (this.escolhaComputador) {
                case 0:
                    imagemResult = R.drawable.pedra_definitiv;
                    break;
                case 1:
                    imagemResult = R.drawable.papel_icon;
                    break;
                case 2:
                    imagemResult = R.drawable.tesoura_icon;
                    break;
                case 3:
                    imagemResult = R.drawable.lagarto_icon;
                    break;
                case 4:
                    imagemResult = R.drawable.spock_icon;
                    break;
                default:
                    imagemResult = R.drawable.tela_de_frente;
                    break;
            }
            return imagemResult;
        }


        public String regras() {
            if (this.escolhaUsuario == this.escolhaComputador) {
                return "Empate!";
                //  return imagem igual a selecionada
            } else if ((this.escolhaUsuario == 0 && this.escolhaComputador == 2) || (this.escolhaUsuario == 1 && this.escolhaComputador == 0) || (this.escolhaUsuario == 2 && this.escolhaComputador == 1) || (this.escolhaUsuario == 3 && this.escolhaComputador == 1) || (this.escolhaUsuario == 3 && this.escolhaComputador == 4) || (this.escolhaUsuario == 4 && this.escolhaComputador == 2) || (this.escolhaUsuario == 4 && this.escolhaComputador == 0) || (this.escolhaUsuario == 2 && this.escolhaComputador == 3) || (this.escolhaUsuario == 0 && this.escolhaComputador == 3) || (this.escolhaUsuario == 1 && this.escolhaComputador == 4)) {
                return "Você ganhou!";
                // mostrar imagem do perderdor
            } else {
                return "Você perdeu!";
                // mostrar imagem do vencendor
            }
        }



        public String getEscolhaComputador() {
            return opcoes[escolhaComputador];
        }
    }

    private Jogo jogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jogo_tela);
        jogo = new Jogo();
    }

    public void jogoTesoura(View v){
        jogo.escolhaDoUsuario(2);
        jogo.escolhaDoComputador();
        String resultado = jogo.regras();
        int imagemResult = jogo.img();

        TextView texto = findViewById(R.id.txt_result);
        texto.setText(resultado);

        ImageView mudarImagem = findViewById(R.id.imagemPrincipal);
        mudarImagem.setImageResource(imagemResult);//alterado
    }

    public void jogoPapel(View v){
        jogo.escolhaDoUsuario(1);
        jogo.escolhaDoComputador();
        String resultado = jogo.regras();
        int imagemResult = jogo.img();

        TextView texto = findViewById(R.id.txt_result);
        texto.setText(resultado);

        ImageView mudarImagem = findViewById(R.id.imagemPrincipal);
        mudarImagem.setImageResource(imagemResult);
    }

    public void jogoSpock(View v){
        jogo.escolhaDoUsuario(4);
        jogo.escolhaDoComputador();
        String resultado = jogo.regras();
        int imagemResult = jogo.img();

        TextView texto = findViewById(R.id.txt_result);
        texto.setText(resultado);

        ImageView mudarImagem = findViewById(R.id.imagemPrincipal);
        mudarImagem.setImageResource(imagemResult);
    }

    public void jogoLagarto(View v){
        jogo.escolhaDoUsuario(3);
        jogo.escolhaDoComputador();
        String resultado = jogo.regras();
        int imagemResult = jogo.img();

        TextView texto = findViewById(R.id.txt_result);
        texto.setText(resultado);

        ImageView mudarImagem = findViewById(R.id.imagemPrincipal);
        mudarImagem.setImageResource(imagemResult);
    }

    public void jogoPedra(View v){
        jogo.escolhaDoUsuario(0);
        jogo.escolhaDoComputador();
        String resultado = jogo.regras();
        int imagemResult = jogo.img();

        TextView texto = findViewById(R.id.txt_result);
        texto.setText(resultado);

        ImageView mudarImagem = findViewById(R.id.imagemPrincipal);
        mudarImagem.setImageResource(imagemResult);
    }
}
