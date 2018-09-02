package com.madega.ramadhani.arubainanawawi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.madega.ramadhani.arubainanawawi.Activity.HadithActivity;
import com.madega.ramadhani.arubainanawawi.Models.HadithModel;
import com.madega.ramadhani.arubainanawawi.R;

import java.util.ArrayList;
import java.util.List;


import static com.madega.ramadhani.arubainanawawi.Activity.HadithActivity.HADITH;


/**
 * Created by root on 8/27/18.
 */


public class HadithAdapter extends RecyclerView.Adapter<HadithAdapter.HadithItemHolder> implements View.OnClickListener {
    private Context context;

    private List<HadithModel> Hadithmodel;
     public HadithAdapter(Context context,List<HadithModel> Hadithmodel){
         this.context=context;
         this.Hadithmodel=Hadithmodel;

     }



    @NonNull
    @Override
    public HadithItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.hadith,parent,false);
        return new HadithItemHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull HadithItemHolder holder, int position) {
       holder.setData(Hadithmodel.get(position));
    }

    @Override
    public int getItemCount() {
        return Hadithmodel.size();
    }

    @Override
    public void onClick(View v) {




    }

    public void updateList(List<HadithModel> hadithList) {
         Hadithmodel=new ArrayList<>();
        Hadithmodel.addAll(hadithList);
        notifyDataSetChanged();


    }


    public class HadithItemHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView mHadith;
        private TextView mHadithno;

        private HadithModel hadithModel;



        public HadithItemHolder(View itemView) {
            super(itemView);
            mHadith=itemView.findViewById(R.id.hadith);
            mHadithno=itemView.findViewById(R.id.hnumber);
            itemView.setOnClickListener(this);

        }

        public  void setData(HadithModel hadithModel){
            mHadith.setText(hadithModel.getHadithName());
            mHadithno.setText(hadithModel.getHadithno());

            this.hadithModel=hadithModel;

        }

        @Override
        public void onClick(View v) {

            Intent showhadith=new Intent(context,HadithActivity.class);
            showhadith.putExtra(HADITH, new Gson().toJson(hadithModel));
            context.startActivity(showhadith);

        }

    }
}
