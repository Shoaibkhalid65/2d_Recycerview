package com.example.a2drecycerviewassign;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildAdapter extends RecyclerView.Adapter<ChildAdapter.ChildViewHolder> {
   List<ChildProduct1> childProduct1s;
   OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public ChildAdapter(List<ChildProduct1> childProduct1s) {
        this.childProduct1s = childProduct1s;
    }

    @NonNull
    @Override
    public ChildViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.child_row_view_1,null);
        return new ChildViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ChildProduct1 childProduct1=childProduct1s.get(position);
        holder.ivImage.setImageResource(childProduct1.getImageResourceId());
        holder.tvTitle.setText(childProduct1.getTitle());
        holder.tvRating.setText(Float.toString(childProduct1.getRating()));

    }

    @Override
    public int getItemCount() {
        return childProduct1s.size();
    }

    class ChildViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle,tvRating;
        ImageView ivImage;

        public ChildViewHolder(@NonNull View itemView) {
            super(itemView);
            tvRating= itemView.findViewById(R.id.tv_child1_rating);
            tvTitle=itemView.findViewById(R.id.tv_child1_title);
            ivImage=itemView.findViewById(R.id.iv_child1_pic);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(onItemClickListener!=null&&getAdapterPosition()==2) {
                        onItemClickListener.onItemClick(getAdapterPosition());
                    }
                }
            });

        }
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
}
