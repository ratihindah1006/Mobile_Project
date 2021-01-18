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
import com.example.listdrama.model.Populer;

import java.util.List;

public class PopulerAdapter extends RecyclerView.Adapter<PopulerAdapter.PopulerViewHolder> {

    private Context context;
    private List<Populer> populerList;

    public PopulerAdapter(Context context, List<Populer> populerList) {
        this.context = context;
        this.populerList = populerList;
    }

    @NonNull
    @Override
    public PopulerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.populer_recycler_items, parent, false);


        return new PopulerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopulerViewHolder holder, final int position) {

        holder.namaPopuler.setText(populerList.get(position).getName());
        Glide.with(context).load(populerList.get(position).getImage()).into(holder.gambarPopuler);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DramaDetailActivity.class);
                i.putExtra("image", populerList.get(position).getImage());
                i.putExtra("imageUrl", populerList.get(position).getImageUrl());
                i.putExtra("name", populerList.get(position).getName());
                i.putExtra("rating", populerList.get(position).getRating());
                i.putExtra("genre", populerList.get(position).getGenre());
                i.putExtra("sinopsis", populerList.get(position).getSinopsis());
                i.putExtra("pemeran1", populerList.get(position).getPemeran1());
                i.putExtra("pemeran2", populerList.get(position).getPemeran2());
                i.putExtra("pemeran3", populerList.get(position).getPemeran3());
                i.putExtra("pemeran4", populerList.get(position).getPemeran4());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return populerList.size();
    }

    public static class PopulerViewHolder extends RecyclerView.ViewHolder{

        ImageView gambarPopuler;
        TextView namaPopuler;

        public PopulerViewHolder(@NonNull View itemView){
            super((itemView));

            gambarPopuler = itemView.findViewById(R.id.gambar_populer);
            namaPopuler = itemView.findViewById(R.id.txt_populer);
        }
    }
}
