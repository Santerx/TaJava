package com.example.parci3.adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.parci3.R;
import com.example.parci3.Ver;
import com.example.parci3.entidades.Contactos;

import java.util.ArrayList;

public class ListaContactosAdapter extends RecyclerView.Adapter<ListaContactosAdapter.ContactoViewHolder> {
    ArrayList<Contactos> listaContactos;

    public ListaContactosAdapter(ArrayList<Contactos> listaContactos){
        this.listaContactos = listaContactos;
    }

    @NonNull
    @Override
    public ContactoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_contacto, null, false);

        return new ContactoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoViewHolder holder, int position) {
        holder.viewUser.setText(listaContactos.get(position).getUser());
        holder.viewProducto.setText(listaContactos.get(position).getProducto());
        holder.viewPrecio.setText(listaContactos.get(position).getPrecio());
    }

    @Override
    public int getItemCount() {
        return listaContactos.size();
    }

    public class ContactoViewHolder extends RecyclerView.ViewHolder {

        TextView viewUser, viewProducto, viewPrecio;
        public ContactoViewHolder(@NonNull View itemView) {
            super(itemView);

            viewUser = itemView.findViewById(R.id.viewUser);
            viewProducto = itemView.findViewById(R.id.viewProducto);
            viewPrecio = itemView.findViewById(R.id.viewPrecio);
        }
    }
}
