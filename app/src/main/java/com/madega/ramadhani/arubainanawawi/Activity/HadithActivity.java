package com.madega.ramadhani.arubainanawawi.Activity;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import com.madega.ramadhani.arubainanawawi.Models.HadithModel;
import com.madega.ramadhani.arubainanawawi.R;

public class HadithActivity extends AppCompatActivity{
    public static String HADITH="hadith";
    private HadithModel hadith;
    private TextView hadithkisw;
    private TextView hadithArabic;
    private TextView h1;
    private TextView h2;
    private LinearLayout mMainlayout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hadithactivity);
        hadithkisw=findViewById(R.id.hadithkisw);
        hadithArabic=findViewById(R.id.hadithArabic);
        mMainlayout=findViewById(R.id.layoutMain);
        h1=findViewById(R.id.h1);
        h2=findViewById(R.id.h2);



        hadith = new Gson().fromJson(getIntent().getStringExtra(HADITH), HadithModel.class);
        h1.setText("Hadith "+hadith.getHadithno());
        h2.setText(hadith.getHadithName());
        hadithArabic.setText(hadith.getHadithArabic());
        hadithkisw.setText(hadith.getHadithKisw());
        findViewById(R.id.zoomOut).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float x=hadithArabic.getTextSize();

                hadithArabic.setTextSize(TypedValue.COMPLEX_UNIT_PX, x + 1f);
                hadithkisw.setTextSize(TypedValue.COMPLEX_UNIT_PX, x + 1f);
            }
        });
        findViewById(R.id.zoomIn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float x=hadithkisw.getTextSize();

                if (x>21) {
                    hadithArabic.setTextSize(TypedValue.COMPLEX_UNIT_PX, x - 1f);
                    hadithkisw.setTextSize(TypedValue.COMPLEX_UNIT_PX, x - 1f);
                }
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
        findViewById(R.id.sharebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = hadith.getHadithName() +"\n"+ hadith.getHadithArabic() +"\n\n"+ hadith.getHadithKisw();
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, hadith.getHadithName());
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));

            }
        });



        Log.e( "onCreate: hadith",hadithArabic.getText().toString() );
        Log.e( "onCreate: hadith",hadithkisw.getText().toString() );
    }



}
