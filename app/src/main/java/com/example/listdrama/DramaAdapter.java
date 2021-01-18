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
import com.example.listdrama.model.Drama;

import java.util.List;

public class DramaAdapter extends RecyclerView.Adapter<DramaAdapter.DramaViewHolder> {

    private Context context;
    private List<Drama> dramaList;

    public DramaAdapter(Context context, List<Drama> dramaList) {
        this.context = context;
        this.dramaList = dramaList;
    }

    @NonNull
    @Override
    public DramaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_drama, parent, false);


        return new DramaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DramaViewHolder holder, final int position) {
        holder.namaDrama.setText(dramaList.get(position).getName());
        Glide.with(context).load(dramaList.get(position).getImageUrl()).into(holder.gambarDrama);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DramaDetailActivity.class);
                i.putExtra("image", dramaList.get(position).getImage());
                i.putExtra("imageUrl", dramaList.get(position).getImageUrl());
                i.putExtra("name", dramaList.get(position).getName());
                i.putExtra("rating", dramaList.get(position).getRating());
                i.putExtra("genre", dramaList.get(position).getGenre());
                i.putExtra("sinopsis", dramaList.get(position).getSinopsis());
                i.putExtra("pemeran1", dramaList.get(position).getPemeran1());
                i.putExtra("pemeran2", dramaList.get(position).getPemeran2());
                i.putExtra("pemeran3", dramaList.get(position).getPemeran3());
                i.putExtra("pemeran4", dramaList.get(position).getPemeran4());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dramaList.size();
    }

    public static class DramaViewHolder extends RecyclerView.ViewHolder{


        ImageView gambarDrama;
        TextView namaDrama;

        public DramaViewHolder(@NonNull View itemView){
            super((itemView));
            gambarDrama = itemView.findViewById(R.id.item_drama_img);
            namaDrama = itemView.findViewById(R.id.nama_item);
        }
    }



}
