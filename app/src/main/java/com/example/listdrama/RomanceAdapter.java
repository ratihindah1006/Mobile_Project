package com.example.listdrama;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.listdrama.model.Romace;

import java.util.List;

public class RomanceAdapter extends RecyclerView.Adapter<RomanceAdapter.RomanceViewHolder> {

    private Context context;
    private List<Romace> romanceList;

    public RomanceAdapter(Context context, List<Romace> romanceList) {
        this.context = context;
        this.romanceList = romanceList;
    }

    @NonNull
    @Override
    public RomanceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_drama, parent, false);


        return new RomanceViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RomanceViewHolder holder, final int position) {
        holder.namaRomance.setText(romanceList.get(position).getName());
        Glide.with(context).load(romanceList.get(position).getImageUrl()).into(holder.gambarRomance);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DramaDetailActivity.class);
                i.putExtra("image", romanceList.get(position).getImage());
                i.putExtra("imageUrl", romanceList.get(position).getImageUrl());
                i.putExtra("name", romanceList.get(position).getName());
                i.putExtra("rating", romanceList.get(position).getRating());
                i.putExtra("genre", romanceList.get(position).getGenre());
                i.putExtra("sinopsis", romanceList.get(position).getSinopsis());
                i.putExtra("pemeran1", romanceList.get(position).getPemeran1());
                i.putExtra("pemeran2", romanceList.get(position).getPemeran2());
                i.putExtra("pemeran3", romanceList.get(position).getPemeran3());
                i.putExtra("pemeran4", romanceList.get(position).getPemeran4());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return romanceList.size();
    }

    public static class RomanceViewHolder extends RecyclerView.ViewHolder{


        ImageView gambarRomance;
        TextView namaRomance;

        public RomanceViewHolder(@NonNull View itemView){
            super((itemView));
            gambarRomance = itemView.findViewById(R.id.item_drama_img);
            namaRomance = itemView.findViewById(R.id.nama_item);
        }
    }



}
