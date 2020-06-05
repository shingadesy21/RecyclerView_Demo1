package com.example.recyclerviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Random;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    private List<Dataitem> items;
    private Context context;

    public ItemAdapter(Context context,List<Dataitem> items) {
        this.items = items;
        this.context=context;
    }

    public ItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.student_info,parent,false);
        return new ItemAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemAdapter.ViewHolder holder, int position) {
        final Dataitem dataitem=items.get(position);

       // final int[] img={R.drawable.img,R.drawable.img1};
        //final int img_random=new Random().nextInt(img.length);
        String[] LBS=context.getResources().getStringArray(R.array.LBS);
        String rstring=LBS[new Random().nextInt(LBS.length)];
        holder.exe_txt.setText(dataitem.exercise);
        holder.type_txt.setText(dataitem.type);
        //holder.imageView.setImageResource(img_random);

        holder.rep_txt.setText(dataitem.rep);
        holder.button.setText(rstring);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView type_txt,exe_txt,rep_txt;
        Button button;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            type_txt=itemView.findViewById(R.id.type);
            exe_txt=itemView.findViewById(R.id.exe);
            rep_txt=itemView.findViewById(R.id.rep);
           button=itemView.findViewById(R.id.btn);
        }
    }
}
