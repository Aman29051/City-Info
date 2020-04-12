package com.example.cityinfo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
//import android.support.annotation.NonNull;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recycleradapter extends RecyclerView.Adapter<recycleradapter.ViewHolder>{
    ArrayList<String> coursename = new ArrayList<>();
    ArrayList<String> courseexplanation = new ArrayList<>();
    ArrayList<Integer> pictures = new ArrayList<>();
    Context context;

    public recycleradapter(ArrayList<String> coursename, ArrayList<String> courseexplanation, ArrayList<Integer> pictures, Context context) {
        this.coursename = coursename;
        this.courseexplanation = courseexplanation;
        this.pictures = pictures;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_recycle, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        //ViewHolder viewHolder;
        viewHolder.image.setImageResource(pictures.get(i));
        viewHolder.coursena.setText(coursename.get(i));
        viewHolder.courseExp.setText(courseexplanation.get(i));

    }

    @Override
    public int getItemCount() {
        return coursename.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView coursena;
        TextView courseExp;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            image = itemView.findViewById(R.id.mainIcon);
            coursena=itemView.findViewById(R.id.mainTitle);
            courseExp=itemView.findViewById(R.id.mainDesc);
            parentLayout=itemView.findViewById(R.id.parent);

        }
    }

}
