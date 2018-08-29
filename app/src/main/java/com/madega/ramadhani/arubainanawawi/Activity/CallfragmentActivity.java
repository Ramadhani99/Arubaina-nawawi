package com.madega.ramadhani.arubainanawawi.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.madega.ramadhani.arubainanawawi.Fragment.HadithFragment;
import com.madega.ramadhani.arubainanawawi.Models.HadithModel;
import com.madega.ramadhani.arubainanawawi.R;

public class CallfragmentActivity extends AppCompatActivity {
    public static String HADITH="hadith";
    private HadithModel hadith;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.callfragment);

        hadith=new Gson().fromJson(getIntent().getStringExtra(HADITH),HadithModel.class);


        HadithFragment hadithFragment = new HadithFragment();
        hadithFragment.setHadith(hadith);

        getSupportFragmentManager().beginTransaction().add(R.id.callfragement,hadithFragment).commit();
    }
}
