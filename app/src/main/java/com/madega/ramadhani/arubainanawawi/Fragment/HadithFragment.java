package com.madega.ramadhani.arubainanawawi.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.madega.ramadhani.arubainanawawi.Activity.MainActivity;
import com.madega.ramadhani.arubainanawawi.Models.HadithModel;
import com.madega.ramadhani.arubainanawawi.R;



public class HadithFragment extends Fragment implements View.OnClickListener{

    private TextView hadithkisw;
    private TextView hadithArabic;
    private TextView h1;
    private TextView h2;

    private HadithModel hadith;



    public HadithFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View FragmentHadith=inflater.inflate(R.layout.fragment_hadith, container, false);
        // Inflate the layout for this fragment
        hadithkisw=FragmentHadith.findViewById(R.id.hadithkisw);
        hadithArabic=FragmentHadith.findViewById(R.id.hadithArabic);
        h1=FragmentHadith.findViewById(R.id.h1);
        h2=FragmentHadith.findViewById(R.id.h2);

        hadithkisw.setText(hadith.getHadithKisw());
        h1.setText("Hadith "+hadith.getHadithno());
        h2.setText(hadith.getHadithName());

        FragmentHadith.findViewById(R.id.home).setOnClickListener(this);
        hadithArabic.setText(hadith.getHadithArabic());
        return FragmentHadith;
    }





    public HadithModel getHadith() {
        return hadith;
    }

    public void setHadith(HadithModel hadith) {
        this.hadith = hadith;
    }

    @Override
    public void onClick(View v) {
        Intent homeactvity=new Intent(getContext(), MainActivity.class);
        getContext().startActivity(homeactvity);

    }
}
