package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaColetarDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_coletar_dados);
        getSupportActionBar().hide();
    }
    public void informacoesPessoais(View view){
        Intent i = new Intent(this, TelaInfoPessoais.class);
        startActivity(i);
    }

    public void informacoesSaude(View view){
        Intent i = new Intent(this, TelaInfoSaude.class);
        startActivity(i);
    }

    public void informacoesNumero(View view){
        Intent i = new Intent(this, TelaContatosEmergencia.class);
        startActivity(i);
    }

    public void Planos(View view) {
        Intent y = new Intent(this, TelaDeVendas.class);
        startActivity(y);
    }

    public void salvarInfo(View view) {
        Intent y = new Intent(this, TelaLogin.class);
        startActivity(y);
    }
}