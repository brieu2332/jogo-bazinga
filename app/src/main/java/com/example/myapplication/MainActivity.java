package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.example.myapplication.jogoTela;
import com.example.myapplication.regrasTela;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirJogoTela(View view){
        Intent in = new Intent(MainActivity.this, jogoTela.class);
        startActivity(in);
    }


    public void abrirTelaRegras(View v){
        Intent it_regrasTela = new Intent(this, regrasTela.class);
        startActivity(it_regrasTela);
    }


    public void voltar2(View v){
        // Encerra a atividade atual
        finish();
    }

}


