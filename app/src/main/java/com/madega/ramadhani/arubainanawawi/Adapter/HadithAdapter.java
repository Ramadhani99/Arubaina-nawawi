package com.madega.ramadhani.arubainanawawi.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.gson.Gson;
import com.madega.ramadhani.arubainanawawi.Activity.CallfragmentActivity;
import com.madega.ramadhani.arubainanawawi.Models.HadithModel;
import com.madega.ramadhani.arubainanawawi.R;

import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;
import static com.madega.ramadhani.arubainanawawi.Activity.CallfragmentActivity.HADITH;


/**
 * Created by root on 8/27/18.
 */


public class HadithAdapter extends RecyclerView.Adapter<HadithAdapter.HadithItemHolder> implements View.OnClickListener {
    private Context context;

    private List<HadithModel> Hadithmodel;
     public HadithAdapter(Context context,List Hadithmodel){
         this.context=context;
         this.Hadithmodel=Hadithmodel;

     }



    @NonNull
    @Override
    public HadithItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.hadith,parent,false
        );
        v.setOnClickListener(this);
        HadithItemHolder holder=new HadithItemHolder(v);
        return holder;

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
            Intent showhadith=new Intent(context,CallfragmentActivity.class);
            showhadith.putExtra(HADITH, new Gson().toJson(hadithModel));
            context.startActivity(showhadith);

        }
    }
}
