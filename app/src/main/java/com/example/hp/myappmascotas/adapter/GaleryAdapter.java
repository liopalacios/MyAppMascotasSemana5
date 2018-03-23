package com.example.hp.myappmascotas.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hp.myappmascotas.R;
import com.example.hp.myappmascotas.pojo.Galeria;

import java.util.ArrayList;

/**
 * Created by HP on 21/03/2018.
 */

public class GaleryAdapter extends RecyclerView.Adapter<GaleryAdapter.GaleryViewHolder> {
    ArrayList<Galeria> galerias;

    public GaleryAdapter(ArrayList<Galeria> galerias) {
        this.galerias = galerias;
    }

    @Override
    public GaleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_galery,parent,false);
        return new GaleryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(GaleryViewHolder holder, int position) {

        Galeria galeria = galerias.get(position);
        holder.txtnombre.setText(String.valueOf(galeria.getId()));
        holder.imgFoto.setImageResource(galeria.getFoto());
    }

    @Override
    public int getItemCount() {
        return galerias.size();
    }

    public class GaleryViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgFoto;
        private TextView txtnombre;
        public GaleryViewHolder(View itemView) {
            super(itemView);
            imgFoto=(ImageView)itemView.findViewById(R.id.ivFotoGalery);
            txtnombre=(TextView)itemView.findViewById(R.id.tvNombreMascota);
        }
    }
}
