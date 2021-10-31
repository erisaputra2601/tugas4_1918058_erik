package com.example.praktikum4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SepedaAdapter extends
    RecyclerView.Adapter<SepedaAdapter.SepedaViewHolder>{
        private ArrayList<Sepeda> dataList;
    public SepedaAdapter(ArrayList<Sepeda> dataList) {
            this.dataList = dataList;
        }
        @NonNull
        @Override
        public SepedaAdapter.SepedaViewHolder
        onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
            View view = layoutInflater.inflate(R.layout.item_sepeda, parent, false);
            return new SepedaViewHolder(view);
        }
        public void onBindViewHolder(SepedaViewHolder holder, int position) {
            holder.Foto.setImageResource(dataList.get(position).getFoto());
            holder.txtNama.setText(dataList.get(position).getNama());
            holder.txtMerk.setText(dataList.get(position).getMerk());
            holder.txtWarna.setText(dataList.get(position).getWarna());
        }
        @Override
        public int getItemCount() {
            return (dataList != null) ? dataList.size() : 0;
        }

        public class SepedaViewHolder extends RecyclerView.ViewHolder{
            private TextView txtNama, txtMerk, txtWarna;
            private ImageView Foto;
            public SepedaViewHolder(View itemView) {
                super(itemView);
                Foto = (ImageView) itemView.findViewById(R.id.foto);
                txtNama = (TextView)itemView.findViewById(R.id.txt_nama);
                txtMerk = (TextView) itemView.findViewById(R.id.txt_merk);
                txtWarna = (TextView) itemView.findViewById(R.id.txt_warna);
            }
        }
    }
