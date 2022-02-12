package com.example.gae;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> arrayList;
    private ArrayList<Integer> memeList;
    private ArrayList<String> tahunList;
    private ArrayList<String> phoneList;
    private ArrayList<String> kotaList;
    Context context;


    public RecyclerViewAdapter(ArrayList<String> namaList, ArrayList<Integer> gambarList, ArrayList<String> tahunList, ArrayList<String> phoneList, ArrayList<String> kotaList, Context context) {
        this.arrayList = namaList;
        this.memeList = gambarList;
        this.tahunList = tahunList;
        this.phoneList = phoneList;
        this.kotaList = kotaList;
        this.context = context;
    }

    //ViewHolder Digunakan Untuk Menyimpan Referensi Dari View-View
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView tvNama, tvTahun, tvPhone,tvKota;
        private ImageView images;
        private RelativeLayout ItemList;

        ViewHolder(View itemView) {
            super(itemView);
            //Menginisialisasi View-View untuk kita gunakan pada RecyclerView
            tvNama = itemView.findViewById(R.id.tvNama);
            tvTahun = itemView.findViewById(R.id.tvTahun);
            images = itemView.findViewById(R.id.ivImages);
            ItemList = itemView.findViewById(R.id.item_list);
            tvPhone =  itemView.findViewById(R.id.tvPhone);
            tvKota = itemView.findViewById(R.id.tvKota);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View V = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design, parent, false);
        ViewHolder VH = new ViewHolder(V);
        return VH;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        final String Nama = arrayList.get(position);
        final String Tahun = tahunList.get(position);
        final String Phone = phoneList.get(position);
        final String Kota = kotaList.get(position);
        final Integer image = memeList.get(position);

        holder.tvNama.setText(Nama);
        holder.tvTahun.setText(Tahun);
        holder.tvPhone.setText(Phone);
        holder.tvKota.setText(Kota);
        holder.images.setImageResource(image);
        holder.ItemList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainActivity2.class);
                intent.putExtra("nama",Nama);
                intent.putExtra("tahun",Tahun);
                intent.putExtra("phone",Phone);
                intent.putExtra("Kota",Kota);

                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}
