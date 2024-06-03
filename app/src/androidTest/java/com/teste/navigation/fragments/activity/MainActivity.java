package com.teste.navigation.fragments.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.teste.navigation.fragments.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonConversa, buttonContato;
    private ConversasFragment conversasFragment;
    private ContatoFragment contatoFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonContato = findViewById(R.id.buttonContato);
        buttonConversa = findViewById(R.id.buttonConversa);

        buttonConversa = new Button();
        //configuração fragmentos
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frameConteudo, contatoFragment);
}