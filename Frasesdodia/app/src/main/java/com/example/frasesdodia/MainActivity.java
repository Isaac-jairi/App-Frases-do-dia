package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void novaFrase(View view){

        String[] frases = {
                "O importante não é vencer todos os dias, mas lutar sempre",
                "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
                "É melhor conquistar a si mesmo do que vencer mil batalhas.",
                "Quem ousou conquistar e saiu pra lutar, chega mais longe!",
                "Enquanto houver vontade de lutar haverá esperança de vencer.",
                "Difícil é ganhar um amigo em uma hora; fácil é ofendê-lo em um minuto.",
                "O medo de perder tira a vontade de ganhar.",
                "Aquele que não tem confiança nos outros, não lhes pode ganhar a confiança.",
                "Escolher o seu tempo é ganhar tempo.",
                "Perder para a razão, sempre é ganhar.",
                "Arriscamo-nos a perder quando queremos ganhar demais.",
                "Quem sabe o que se pode ganhar num dia jamais furta.",
                "A maior caridade é habilitar o pobre a ganhar a sua vida.",
                "Para ganhar aquilo que vale a pena ter, pode ser necessário perder tudo mais.",
                "O homem digno ganha para viver; o menos honesto vive para ganhar.",
                "Se você pretende ser rico, pense em economizar tanto quanto em ganhar.",
                "Muitos sabem ganhar dinheiro, mas poucos sabem gastá-lo."
        };

        int sorteio = new Random().nextInt(frases.length);

        TextView text = findViewById(R.id.txt_resultado);
        text.setText(frases[sorteio]);

    }

}
