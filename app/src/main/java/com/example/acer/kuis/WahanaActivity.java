package com.example.acer.kuis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.example.acer.kuis.model.Wahana;
import com.example.acer.kuis.adapter.*;

import java.util.ArrayList;
import java.util.List;

public class WahanaActivity extends AppCompatActivity {

    Button bthome, btfasilitas, btdeskripsi, btanggota, btwahana;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;
    private List<Wahana> mWahanas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wahana);

        button();
        mRecyclerView = (RecyclerView) findViewById(R.id.rvWahana);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        dummyData();
        mAdapter = new WahanaAdapter(mWahanas,this);
        mRecyclerView.setAdapter(mAdapter);

    }

    public void button(){
        Button bthome = (Button) findViewById(R.id.bthome);
        bthome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WahanaActivity.this, HomeActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button btfasilitas = (Button) findViewById(R.id.btfasilitas);
        btfasilitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WahanaActivity.this, FasilitasActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button btdeskripsi = (Button) findViewById(R.id.btdesc);
        btdeskripsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WahanaActivity.this, DeskripsiActivity.class);
                startActivity(i);
                finish();
            }
        });

        Button btanggota = (Button) findViewById(R.id.btanggota);
        btanggota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(WahanaActivity.this, AnggotaActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

    private void dummyData() {
        Wahana fasilitas= new Wahana(R.drawable.hallentrance,"Hall Entrance");
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.hallfame,"Hall");
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.science,"Science");
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.checkup,"Checkup");
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.cadavar,"Cadavar");
        mWahanas.add(fasilitas);

        fasilitas= new Wahana(R.drawable.zonatubuh,"Zona Tubuh");
        mWahanas.add(fasilitas);
    }

}
