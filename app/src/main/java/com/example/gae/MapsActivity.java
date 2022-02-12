package com.example.gae;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;

import com.example.gae.databinding.ActivityMapsBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    Double lat = null;
    Double lng = null;
    Toolbar toolbar;
    TextView tvNama, tvKota, tvTahun,tvPhone;
    String nama,kota,tahun,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        tvNama = findViewById(R.id.tv_Nama);
        tvKota = findViewById(R.id.tv_Kota);
        tvTahun = findViewById(R.id.tv_tahun);
        tvPhone = findViewById(R.id.tv_Phone);

        Intent intent = getIntent();
        nama = intent.getStringExtra("nama");
        kota = intent.getStringExtra("Kota");
        phone = intent.getStringExtra("phone");
        tahun = intent.getStringExtra("tahun");

        tvNama.setText(nama);
        tvKota.setText(kota);
        tvPhone.setText(phone);
        tvTahun.setText(tahun);


//        binding = ActivityMapsBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//        Intent intent = this.getIntent();
//        lng = intent.getDoubleExtra("lng",0.00);
//        lat = intent.getDoubleExtra("lat",0.00);
//
//        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(lat, lng);
//        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }


}