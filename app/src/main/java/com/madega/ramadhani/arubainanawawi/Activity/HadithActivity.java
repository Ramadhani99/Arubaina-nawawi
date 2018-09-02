package com.madega.ramadhani.arubainanawawi.Activity;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import com.madega.ramadhani.arubainanawawi.Models.HadithModel;
import com.madega.ramadhani.arubainanawawi.R;

public class HadithActivity extends AppCompatActivity {
    public static String HADITH="hadith";
    private HadithModel hadith;
    private TextView hadithkisw;
    private TextView hadithArabic;
    private TextView h1;
    private TextView h2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hadithactivity);
        hadithkisw=findViewById(R.id.hadithkisw);
        hadithArabic=findViewById(R.id.hadithArabic);
        h1=findViewById(R.id.h1);
        h2=findViewById(R.id.h2);

        hadith = new Gson().fromJson(getIntent().getStringExtra(HADITH), HadithModel.class);
        h1.setText("Hadith "+hadith.getHadithno());
        h2.setText(hadith.getHadithName());
        hadithArabic.setText(hadith.getHadithArabic());
        hadithkisw.setText(hadith.getHadithKisw());
        findViewById(R.id.home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(getBaseContext(),MainActivity.class);
                home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home);
                finish();
            }
        });
        findViewById(R.id.backhomebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home=new Intent(getBaseContext(),MainActivity.class);
                home.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(home);
                finish();
            }
        });



        Log.e( "onCreate: hadith",hadithArabic.getText().toString() );
        Log.e( "onCreate: hadith",hadithkisw.getText().toString() );
    }


}
