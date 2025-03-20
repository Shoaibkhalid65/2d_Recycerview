package com.example.a2drecycerviewassign;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChildAdaptar extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static final int VIEW_TYPE_CHILD_1=0;
    public static final int VIEW_TYPE_CHILD_2=1;
    List <ChildProduct> childProducts;
    OnItemClickListener onItemClickListener;
    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public ChildAdaptar(List<ChildProduct> childProducts) {
        this.childProducts = childProducts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(viewType==VIEW_TYPE_CHILD_1){
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.child_row_view_1,null);
            return new Child1ViewHolder(view);
        }else{
            View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.child_row_view_2,null);
            return new Child2ViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
         if(holder instanceof Child1ViewHolder){
             ChildProduct1 childProduct1=(ChildProduct1)childProducts.get(position);
             ((Child1ViewHolder) holder).ivImage.setImageResource(childProduct1.getImageResourceId());
             ((Child1ViewHolder) holder).tvTitle.setText(childProduct1.getTitle());
             ((Child1ViewHolder) holder).tvRating.setText(String.valueOf(childProduct1.getRating()));
         }else if (holder instanceof Child2ViewHolder){
             ChildProduct2 childProduct2= (ChildProduct2) childProducts.get(position);
             ((Child2ViewHolder) holder).ivImage1.setImageResource(childProduct2.getImageResourceId1());
             ((Child2ViewHolder) holder).ivImage2.setImageResource(childProduct2.getImageResourceId2());
             ((Child2ViewHolder) holder).ivImage3.setImageResource(childProduct2.getImageResourceId3());
             ((Child2ViewHolder) holder).tvTitle1.setText(childProduct2.getTitle1());
             ((Child2ViewHolder) holder).tvTitle2.setText(childProduct2.getTitle2());
             ((Child2ViewHolder) holder).tvTitle3.setText(childProduct2.getTitle3());
             ((Child2ViewHolder) holder).tvComment11.setText(childProduct2.getComment11());
             ((Child2ViewHolder) holder).tvComment12.setText(childProduct2.getComment21());
             ((Child2ViewHolder) holder).tvComment13.setText(childProduct2.getComment31());
             ((Child2ViewHolder) holder).tvComment21.setText(childProduct2.getComment12());
             ((Child2ViewHolder) holder).tvComment22.setText(childProduct2.getComment22());
             ((Child2ViewHolder) holder).tvComment23.setText(childProduct2.getComment32());
             ((Child2ViewHolder) holder).tvRating1.setText(String.valueOf(childProduct2.getRating1()));
             ((Child2ViewHolder) holder).tvRating2.setText(String.valueOf(childProduct2.getRating2()));
             ((Child2ViewHolder) holder).tvRating3.setText(String.valueOf(childProduct2.getRating3()));
             ((Child2ViewHolder) holder).tvMb1.setText(childProduct2.getMb1());
             ((Child2ViewHolder) holder).tvMb2.setText(childProduct2.getMb2());
             ((Child2ViewHolder) holder).tvMb3.setText(childProduct2.getMb3());
         }
    }

    @Override
    public int getItemViewType(int position) {
        if(childProducts.get(position) instanceof ChildProduct1){
            return VIEW_TYPE_CHILD_1;
        }else
            return VIEW_TYPE_CHILD_2;
    }

    @Override
    public int getItemCount() {
        return childProducts.size();
    }

    class Child1ViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle,tvRating;
        ImageView ivImage;

        public Child1ViewHolder(@NonNull View itemView) {
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
    class Child2ViewHolder extends RecyclerView.ViewHolder{
        ImageView ivImage1,ivImage2,ivImage3;
        TextView tvTitle1,tvTitle2,tvTitle3;
        TextView tvComment11,tvComment12,tvComment13;
        TextView tvComment21,tvComment22,tvComment23;
        TextView tvRating1,tvRating2,tvRating3;
        TextView tvMb1,tvMb2,tvMb3;

        public Child2ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivImage1=itemView.findViewById(R.id.ivImage1);
            ivImage2=itemView.findViewById(R.id.ivImage2);
            ivImage3=itemView.findViewById(R.id.ivImage3);
            tvTitle1=itemView.findViewById(R.id.tv_title);
            tvTitle2=itemView.findViewById(R.id.tv_title2);
            tvTitle3=itemView.findViewById(R.id.tv_title3);
            tvComment11=itemView.findViewById(R.id.tv_comment1);
            tvComment12=itemView.findViewById(R.id.tv_comment12);
            tvComment13=itemView.findViewById(R.id.tv_comment13);
            tvComment21=itemView.findViewById(R.id.tv_comment2);
            tvComment22=itemView.findViewById(R.id.tv_comment22);
            tvComment23=itemView.findViewById(R.id.tv_comment23);
            tvRating1=itemView.findViewById(R.id.tv_rating);
            tvRating2=itemView.findViewById(R.id.tv_rating2);
            tvRating3=itemView.findViewById(R.id.tv_rating3);
            tvMb1=itemView.findViewById(R.id.tv_mb);
            tvMb2=itemView.findViewById(R.id.tv_mb2);
            tvMb3=itemView.findViewById(R.id.tv_mb3);


        }
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
}
