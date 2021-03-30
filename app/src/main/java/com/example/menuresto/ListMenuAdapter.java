package com.example.menuresto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.ListViewHolder>{
    private ArrayList<Menu> listMenu;

    public ListMenuAdapter (ArrayList<Menu> list) {
        this.listMenu = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);

        return new  ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Menu menu = listMenu.get(position);

        Glide.with(holder.itemView.getContext())
                .load(menu.getImages())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.images);
        holder.tvName.setText(menu.getName());
        holder.tvDesc.setText(menu.getDesc());

    }

    @Override
    public int getItemCount() {
        return listMenu.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView images;
        TextView tvName, tvDesc;


        public ListViewHolder(View view) {
            super(view);
            images = view.findViewById(R.id.img);
            tvName = view.findViewById(R.id.tv_name);
            tvDesc = view.findViewById(R.id.tv_desc);
        }
    }
}
