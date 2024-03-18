package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class regrasTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regras_tela);
    }

    public void voltar(View v){
        Intent voltar_regrasTela = new Intent(this,MainActivity.class);
        startActivity(voltar_regrasTela);
    }

}