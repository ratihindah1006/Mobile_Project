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
import com.example.listdrama.model.Horor;

import java.util.List;

public class HororAdapter extends RecyclerView.Adapter<HororAdapter.HororViewHolder> {

    private Context context;
    private List<Horor> hororList;

    public HororAdapter(Context context, List<Horor> hororList) {
        this.context = context;
        this.hororList = hororList;
    }

    @NonNull
    @Override
    public HororViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_drama, parent, false);


        return new HororViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HororViewHolder holder, final int position) {
        holder.namaHoror.setText(hororList.get(position).getName());
        Glide.with(context).load(hororList.get(position).getImageUrl()).into(holder.gambarHoror);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DramaDetailActivity.class);
                i.putExtra("image", hororList.get(position).getImage());
                i.putExtra("imageUrl", hororList.get(position).getImageUrl());
                i.putExtra("name", hororList.get(position).getName());
                i.putExtra("rating", hororList.get(position).getRating());
                i.putExtra("genre", hororList.get(position).getGenre());
                i.putExtra("sinopsis", hororList.get(position).getSinopsis());
                i.putExtra("pemeran1", hororList.get(position).getPemeran1());
                i.putExtra("pemeran2", hororList.get(position).getPemeran2());
                i.putExtra("pemeran3", hororList.get(position).getPemeran3());
                i.putExtra("pemeran4", hororList.get(position).getPemeran4());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return hororList.size();
    }

    public static class HororViewHolder extends RecyclerView.ViewHolder{


        ImageView gambarHoror;
        TextView namaHoror;

        public HororViewHolder(@NonNull View itemView){
            super((itemView));
            gambarHoror = itemView.findViewById(R.id.item_drama_img);
            namaHoror = itemView.findViewById(R.id.nama_item);
        }
    }



}
