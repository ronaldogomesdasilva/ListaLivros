package br.com.etecia.myapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
List<Livros> lstLivros;
RecyclerView idRecLivros;



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

        idRecLivros = findViewById(R.id.idRecLivros);

        lstLivros = new ArrayList<>();

        lstLivros.add(new Livros("rainha das sombras","suspense", R.drawable.rainha_das_sombras, 50.00));
        lstLivros.add(new Livros("abrace","motivação",R.drawable.abrace,35.50));
        lstLivros.add(new Livros("namorado","romantico",R.drawable.namorado,40.50));
        lstLivros.add(new Livros("harry_potter","ficção",R.drawable.harry_potter,80.00));



        AdpterLivros adpterLivros = new AdpterLivros(getApplicationContext(),lstLivros);

        idRecLivros.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        idRecLivros.setAdapter(adpterLivros);
    }
}