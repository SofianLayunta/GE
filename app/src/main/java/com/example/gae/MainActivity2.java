package com.example.gae;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.gae.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.GoogleMap;

public class MainActivity2 extends AppCompatActivity {

    Button btnButton;
    TextView tvNama, tvKota, tvTahun,tvPhone;
    String nama,kota,tahun,phone;
    Integer image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvNama = findViewById(R.id.tv_Nama);
        tvKota = findViewById(R.id.tv_Kota);
        tvTahun = findViewById(R.id.tv_tahun);
        tvPhone = findViewById(R.id.tv_Phone);
        btnButton = findViewById(R.id.btnButton);

        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        tahun = intent.getStringExtra("tahun");
        phone = intent.getStringExtra("phone");
        kota = intent.getStringExtra("Kota");


        tvNama.setText(nama);
        tvKota.setText(kota);
        tvPhone.setText(phone);
        tvTahun.setText(tahun);

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,AddressBook.class);
                intent.putExtra("nama",nama);
                intent.putExtra("tahun",tahun);
                intent.putExtra("phone",phone);
                intent.putExtra("Kota",kota);
                intent.putExtra("image",image);

                startActivity(intent);
            }
        });
    }
}