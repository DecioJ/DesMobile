package com.example.listadenomes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listNomes;
    private String[] itens = {
            "Beatriz Matos Pereira", "Decio Alves da Silva Junior",
            "Kauê Negrini Ciglioni", "Ruliana Sauanna Moreira dos Santos"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listNomes = findViewById(R.id.listNomes);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1, itens
        );

        listNomes.setAdapter(adapter);
    }
}