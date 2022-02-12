package com.example.gae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AddressBook extends AppCompatActivity {

    TextView tvNama, tvKota, tvTahun,tvPhone;
    String nama,kota,tahun,phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_book);

        tvNama = findViewById(R.id.tvNama);
        tvKota = findViewById(R.id.tvKota);
        tvTahun = findViewById(R.id.tvTahun);
        tvPhone = findViewById(R.id.tvPhone);

        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        tahun = intent.getStringExtra("tahun");
        phone = intent.getStringExtra("phone");
        kota = intent.getStringExtra("Kota");


        tvNama.setText(nama);
        tvKota.setText(kota);
        tvPhone.setText(phone);
        tvTahun.setText(tahun);
    }
}