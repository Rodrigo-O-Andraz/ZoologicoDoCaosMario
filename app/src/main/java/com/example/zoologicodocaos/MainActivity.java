package com.example.zoologicodocaos;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.zoologicodocaos.models.AnimalT1;
import com.example.zoologicodocaos.models.ZoologicoDoCaosT1;

public class MainActivity extends AppCompatActivity {

    // Zoo
    ZoologicoDoCaosT1 z1;

    // Animais
    AnimalT1 a1;
    AnimalT1 a2;
    AnimalT1 a3;
    AnimalT1 a4;
    AnimalT1 a5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        buildZoologico();
    }

    private void buildZoologico()
    {

        // Criar miguinhos da KIKA
        a1 = new AnimalT1("Felpudo", "Faz RUM RUM");
        a2 = new AnimalT1("Orelhudo", "Como CENOURAS");
        a3 = new AnimalT1("Duduzinho", "Faz ROM ROM");
        a4 = new AnimalT1("Jimmy Jones", "Faz ROC ROC");
        a5 = new AnimalT1("Palmi", "Faz contas de SOMAR");
        // Criar o ZOO
        z1 = new ZoologicoDoCaosT1("Miguinho da KIKA");

        z1.addAnimal(a1).addAnimal(a2).addAnimal(a3).addAnimal(a4).addAnimal(a5);

        Toast.makeText(MainActivity.this, z1.toString(), Toast.LENGTH_SHORT).show();
    }
}