package com.example.exame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Cachorro> ListaCachorros;
    private Context context;

    public MyAdapter(List<Cachorro> listaCachorros, Context context) {
        ListaCachorros = listaCachorros;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                 .inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Cachorro cachorro = ListaCachorros.get(position);

        holder.editNome.setText(cachorro.getNome());
        holder.editSexo.setText(cachorro.getSexo());
        holder.editRaca.setText(cachorro.getRaca());
    }

    @Override
    public int getItemCount() {
        return ListaCachorros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView editNome;
        public TextView editSexo;
        public TextView editRaca;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            editNome = (TextView) itemView.findViewById(R.id.editNome);
            editSexo = (TextView) itemView.findViewById(R.id.editSexo);
            editRaca = (TextView) itemView.findViewById(R.id.editRaca);
        }
    }
}
