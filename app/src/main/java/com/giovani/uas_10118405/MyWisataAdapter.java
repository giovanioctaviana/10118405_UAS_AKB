package com.giovani.uas_10118405;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyWisataAdapter extends RecyclerView.Adapter<MyWisataAdapter.ViewHolder> {

    MyWisata[] myWisatas;
    Context context;

    //10118405 Giovani Octaviana 14 agustus 2021 13.33

    public MyWisataAdapter(MyWisata[] myWisata,MainActivity activity) {
        this.myWisatas = myWisata;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.fragment_home,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final  MyWisata myWisataList = myWisatas[position];
        holder.textViewName.setText(myWisataList.getWisataName());
        holder.textViewAddress.setText(myWisataList.getWisataData());
        holder.wisataImage.setImageResource(myWisataList.getWisataImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myWisataList.getWisataName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return myWisatas.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView wisataImage;
        TextView textViewName;
        TextView textViewAddress;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            wisataImage = itemView.findViewById(R.id.imageView);
            textViewName = itemView.findViewById(R.id.wisataname);
            textViewAddress = itemView.findViewById(R.id.wisataaddress);
        }
    }

}
