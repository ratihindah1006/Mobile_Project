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
import com.example.listdrama.model.Fantasi;

import java.util.List;

public class FantasiAdapter extends RecyclerView.Adapter<FantasiAdapter.FantasiViewHolder> {

    private Context context;
    private List<Fantasi> fantasiList;

    public FantasiAdapter(Context context, List<Fantasi> fantasiList) {
        this.context = context;
        this.fantasiList = fantasiList;
    }

    @NonNull
    @Override
    public FantasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_drama, parent, false);


        return new FantasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FantasiViewHolder holder, final int position) {
        holder.namaFantasi.setText(fantasiList.get(position).getName());
        Glide.with(context).load(fantasiList.get(position).getImageUrl()).into(holder.gambarFantasi);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DramaDetailActivity.class);
                i.putExtra("image", fantasiList.get(position).getImage());
                i.putExtra("imageUrl", fantasiList.get(position).getImageUrl());
                i.putExtra("name", fantasiList.get(position).getName());
                i.putExtra("rating", fantasiList.get(position).getRating());
                i.putExtra("genre", fantasiList.get(position).getGenre());
                i.putExtra("sinopsis", fantasiList.get(position).getSinopsis());
                i.putExtra("pemeran1", fantasiList.get(position).getPemeran1());
                i.putExtra("pemeran2", fantasiList.get(position).getPemeran2());
                i.putExtra("pemeran3", fantasiList.get(position).getPemeran3());
                i.putExtra("pemeran4", fantasiList.get(position).getPemeran4());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return fantasiList.size();
    }

    public static class FantasiViewHolder extends RecyclerView.ViewHolder{


        ImageView gambarFantasi;
        TextView namaFantasi;

        public FantasiViewHolder(@NonNull View itemView){
            super((itemView));
            gambarFantasi = itemView.findViewById(R.id.item_drama_img);
            namaFantasi = itemView.findViewById(R.id.nama_item);
        }
    }



}
