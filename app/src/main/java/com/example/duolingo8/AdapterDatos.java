package com.example.duolingo8;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos> {


    ArrayList<Category> datos;

    public AdapterDatos(ArrayList<Category> datos) {
        this.datos = datos;
    }

    @Override
    public AdapterDatos.ViewHolderDatos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);
        return new ViewHolderDatos(view);
    }
    @Override
    public void onBindViewHolder(@NonNull AdapterDatos.ViewHolderDatos holder, int position) {

        holder.asignarDatos(datos.get(position).getCategory_name());
        holder.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("AAAAAA", "Boton MIerda");
            }
        });
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder{

        Button b;
        public ViewHolderDatos(@NonNull View itemView) {
            super(itemView);
            Context context = itemView.getContext();
            b = (Button) itemView.findViewById(R.id.button);
        }

        void asignarDatos(String s) {
            b.setText(s);
        }
    }
}
