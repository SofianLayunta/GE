package com.example.gae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> NamaList;
    private ArrayList<String> TahunList;
    private ArrayList<Integer> GambarList;
    private ArrayList<String> PhoneList;
    private ArrayList<String> KotaList;
    Context context;


    private String[] Nama = {"Wildan", "Taufan", "Aish", "Ferdi", "Taufik", "Dzaki", "Annisa"};
    private String[] Tahun = {"2000", "2001", "2000", "2001", "2000", "2002", "2001"};
    private int[] Gambar = {R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_background, R.drawable.ic_launcher_background, R.drawable.ic_launcher_background};
    private String[] Phone = {"62323232", "62323232", "62323232", "62323232",
            "62323232", "62323232", "62323232"};
    private String[] Kota = {"Jakarta", "Surakarta", "Jakarta", "Jakarta", "Jakarta", "Bogor", "Jakarta"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context context;

        context = MainActivity.this;

        NamaList = new ArrayList<>();
        PhoneList = new ArrayList<>();
        GambarList = new ArrayList<>();
        TahunList = new ArrayList<>();
        KotaList = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        DaftarItem();
        //Menggunakan Layout Manager, Dan Membuat List Secara Vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(NamaList, GambarList,TahunList,PhoneList,KotaList,context);
        //Memasang Adapter pada RecyclerView
        recyclerView.setAdapter(adapter);
    }

    //Mengambil data dari Varibale Gambar dan Judul, lalu memasangnya pada list yang terhubung dengan Class Adapter
    private void DaftarItem(){
        for (int w = 0; w< Nama.length; w++){
            GambarList.add(Gambar[w]);
            NamaList.add(Nama[w]);
            TahunList.add(Tahun[w]);
            PhoneList.add(Phone[w]);
            KotaList.add(Kota[w]);

        }
    }
}