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

public class Adapter2 extends RecyclerView.Adapter<Adapter2.MyViewHolder> {

    ArrayList<Model2> list2;
    Context mContext2;


    public Adapter2(Context mContext2, ArrayList<Model2> list2) {

        this.list2 = list2;
        this.mContext2=mContext2;
    }


    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {

        View v;
        LayoutInflater layoutInflater=LayoutInflater.from(mContext2);
        v=layoutInflater.inflate(R.layout.transfer_item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull Adapter2.MyViewHolder holder, int position) {
        holder.Sender.setText("Sender      "+list2.get(position).getSender());
        holder.Reciever.setText("Reciever      "+list2.get(position).getReciever());
        holder.amount.setText("amount      "+list2.get(position).getAmount());




    }

    @Override
    public int getItemCount() {

        return list2.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {


        TextView Sender;
        TextView Reciever;
        TextView amount;

        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView2) {
            super(itemView2);
            Sender=itemView2.findViewById(R.id.sender_text);
            Reciever=itemView2.findViewById(R.id.reciver_text);
            amount=itemView2.findViewById(R.id.amount_text);





        }
    }


}


