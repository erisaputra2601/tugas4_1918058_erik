package com.example.praktikum4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SepedaAdapter adapter;
    private ArrayList<Sepeda> sepedaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new SepedaAdapter(sepedaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        sepedaArrayList = new ArrayList<>();
        sepedaArrayList.add(new Sepeda("N Max", "Merk : Yamaha", "Warna : dari Nmax sendiri ada Black, Abu-Abu, Red.", R.drawable.nmax));
        sepedaArrayList.add((new Sepeda("Scoopy", "Merk : Honda", "Warna : dari scoopy sendiri ada Red Style, Stylish Brown, Sporty Black, Prestige Black .", R.drawable.scoopy)));
        sepedaArrayList.add((new Sepeda("Vespa LX 125 I-Get", "Merk : Vespa", "Warna : dari Vespa matic sendiri ada  Black, Kuning, Biru, Merah.", R.drawable.vespa)));
        sepedaArrayList.add((new Sepeda("Gl - Pro", "Merk : Honda", "Warna : dari Gl Pro sendiri ada Black, Biru.", R.drawable.gl)));
        sepedaArrayList.add((new Sepeda("Megapro", "Merk : Honda", "Warna : dari Megapro sendiri ada  Black, Biru, Merah.", R.drawable.megapro)));
    }
}
