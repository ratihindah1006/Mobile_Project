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
import com.example.listdrama.model.Action;



import java.util.List;

public class ActionAdapter extends RecyclerView.Adapter<ActionAdapter.ActionViewHolder> {

    private Context context;
    private List<Action> actionList;

    public ActionAdapter(Context context, List<Action> actionList) {
        this.context = context;
        this.actionList = actionList;
    }

    @NonNull
    @Override
    public ActionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_drama, parent, false);


        return new ActionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActionViewHolder holder, final int position) {
        holder.namaAction.setText(actionList.get(position).getName());
        Glide.with(context).load(actionList.get(position).getImageUrl()).into(holder.gambarAction);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DramaDetailActivity.class);
                i.putExtra("image", actionList.get(position).getImage());
                i.putExtra("imageUrl", actionList.get(position).getImageUrl());
                i.putExtra("name", actionList.get(position).getName());
                i.putExtra("rating", actionList.get(position).getRating());
                i.putExtra("genre", actionList.get(position).getGenre());
                i.putExtra("sinopsis", actionList.get(position).getSinopsis());
                i.putExtra("pemeran1", actionList.get(position).getPemeran1());
                i.putExtra("pemeran2", actionList.get(position).getPemeran2());
                i.putExtra("pemeran3", actionList.get(position).getPemeran3());
                i.putExtra("pemeran4", actionList.get(position).getPemeran4());

                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return actionList.size();
    }

    public static class ActionViewHolder extends RecyclerView.ViewHolder{


        ImageView gambarAction;
        TextView namaAction;

        public ActionViewHolder(@NonNull View itemView){
            super((itemView));
            gambarAction = itemView.findViewById(R.id.item_drama_img);
            namaAction = itemView.findViewById(R.id.nama_item);
        }
    }



}
