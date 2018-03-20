package com.example.kid_d_000.lab223;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by kid_d_000 on 05/03/2018.
 */

public class AdapterDatos extends RecyclerView.Adapter<AdapterDatos.ViewHolderDatos>{
    Context context;
    ArrayList<Item> listDatos;

    public AdapterDatos(Context context,ArrayList<Item> listDatos) {
        this.context=context;
        this.listDatos = listDatos;
    }

    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view= layoutInflater.inflate(R.layout.item_list,null);
        return new ViewHolderDatos(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderDatos holder, int position) {
        holder.clave.setText(listDatos.get(position).getClave()+"");
        holder.nombre.setText(listDatos.get(position).getNombre());
        holder.salario.setText(listDatos.get(position).getSueldo()+"");
    }

    @Override
    public int getItemCount() {
        return listDatos.size();
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        TextView clave,nombre,salario;

        public ViewHolderDatos(View itemView) {
            super(itemView);

            clave=itemView.findViewById(R.id.idClave);
            nombre=itemView.findViewById(R.id.idNombre);
            salario=itemView.findViewById(R.id.idSalario);
        }
    }
}
