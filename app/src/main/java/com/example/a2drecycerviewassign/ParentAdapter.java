package com.example.a2drecycerviewassign;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ParentAdapter extends RecyclerView.Adapter <ParentAdapter.ParentViewHolder>{
    List <ParentProduct> parentProducts;

    public ParentAdapter(List<ParentProduct> parentProducts) {
        this.parentProducts = parentProducts;
    }

    @NonNull
    @Override
    public ParentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.parent_row_view,null);
        return new ParentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentViewHolder holder, @SuppressLint("RecyclerView") int positio) {
          ParentProduct parentProduct=parentProducts.get(positio);
          holder.tvTitle.setText(parentProduct.getTitle());
          holder.ivImage.setImageResource(parentProduct.getImageResourceId());
          ChildAdaptar childAdapter=new ChildAdaptar(parentProduct.getChildProducts());
          childAdapter.setOnItemClickListener(new ChildAdaptar.OnItemClickListener() {
              @Override
              public void onItemClick(int position) {
                  if(positio==6) {
                      Intent intent = new Intent(holder.recyclerView.getContext(), WaterTracker.class);
                      holder.recyclerView.getContext().startActivity(intent);
                  }
              }
          });
          holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder.recyclerView.getContext(),LinearLayoutManager.HORIZONTAL,false));
          holder.recyclerView.setAdapter(childAdapter);
    }

    @Override
    public int getItemCount() {
        return parentProducts.size();
    }

    class ParentViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ImageView ivImage;
        RecyclerView recyclerView;

        public ParentViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle=itemView.findViewById(R.id.tv_parent_title);
            ivImage=itemView.findViewById(R.id.iv_parent_logo);
            recyclerView=itemView.findViewById(R.id.child_rv);
        }
    }
}
