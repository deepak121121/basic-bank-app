package com.example.myapplication;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    ArrayList<Model> list;
    Context mContext;


    public Adapter(Context mContext, ArrayList<Model> list) {

        this.list = list;
        this.mContext=mContext;
    }


    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View v;
        LayoutInflater layoutInflater=LayoutInflater.from(mContext);
        v=layoutInflater.inflate(R.layout.my_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Adapter.MyViewHolder holder, int position) {

        holder.name.setText("  name        "+list.get(position).getName());
        holder.balance.setText("balance      "+list.get(position).getBalance());






        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Model temp=list.get(position);
                Intent intent=new Intent(mContext,MainActivity3.class);
                intent.putExtra("name",temp.getName());
                intent.putExtra("balance",temp.getBalance());
                intent.putExtra("email",temp.getEmail());
                intent.putExtra("ifsc",temp.getIfscCode());
                intent.putExtra("email",temp.getAccountNumber());
                mContext.startActivity(intent);

            }
        });







    }

    @Override
    public int getItemCount() {

        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView balance;




        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name_text);
            balance=itemView.findViewById(R.id.balance_text);






        }
    }


}

