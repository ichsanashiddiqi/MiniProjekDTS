package com.example.project1.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.R;
import com.example.project1.models.Catatan;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class catatanAdapter extends RecyclerView.Adapter<catatanAdapter.MyViewHolder> {
    List<Catatan> catatanList;

    public catatanAdapter(List<Catatan> catatanList) {
        this.catatanList = catatanList;
    }

    @Override
    public catatanAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //object context diambil dari parent
        Context context = parent.getContext();
        //object context digunakan untuk membuat object layoutInflater
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //object layoutInflater digunakan untuk membuat object view yang merupakan hasil inflate  layout ( mengubungkan adapter dengan layout)
        View pengeluaranView = layoutInflater.inflate(R.layout.item_list_catatan,parent,false);
        //object superHeroView digunakan untuk membuat object viewHolder
        MyViewHolder viewHolder = new MyViewHolder(pengeluaranView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull catatanAdapter.MyViewHolder holder, int position) {
        //ambil satu item hero
        Catatan pengeluaran = catatanList.get(position);
        holder.nama.setText(pengeluaran.getNamaCatatan());
        holder.nomor.setText(String.valueOf(pengeluaran.getNomorCatatan()));
    }

    @Override
    public int getItemCount() {
        return catatanList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nama,nomor;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.txt_nama);
            nomor = itemView.findViewById(R.id.txt_nomorCatatan);
        }
    }
}
