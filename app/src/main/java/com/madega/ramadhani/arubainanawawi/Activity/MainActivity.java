package com.madega.ramadhani.arubainanawawi.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.madega.ramadhani.arubainanawawi.Adapter.HadithAdapter;
import com.madega.ramadhani.arubainanawawi.Models.HadithModel;
import com.madega.ramadhani.arubainanawawi.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private HadithModel mHadithobj;
    private List<HadithModel> hadithList=new ArrayList<>();
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView mRecyclerView;
    private HadithAdapter hAdpter;
    private TextView mViewHadith;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView= findViewById(R.id.recView);
        linearLayoutManager=new LinearLayoutManager(MainActivity.this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        hAdpter=new HadithAdapter(MainActivity.this,hadithList);
        mRecyclerView.setAdapter(hAdpter);
        setDatatoAdapter();


    }

    public void setDatatoAdapter() {
        mHadithobj = new HadithModel();

        mHadithobj.setHadithName("Kila kitendo kina nia yake");
        mHadithobj.setHadithno("01");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith1));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith1tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Kuja kwa Jibril عليه السلام Kuwafundisha Waislamu Mambo Ya Dini Yao");
        mHadithobj.setHadithno("02");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith2));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith2tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Nguzo Za Kiislamu Ni Tano");
        mHadithobj.setHadithno("03");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Umbo la kila mwanadamu");
        mHadithobj.setHadithno("04");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Atakayezua Kitu Kisichokuwemo Katika Jambo Hili Letu Kitakataliwa");
        mHadithobj.setHadithno("05");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Hakika Halali Iko Wazi Na Haramu Iko Wazi");
        mHadithobj.setHadithno("06");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Dini Ni Nasiha");
        mHadithobj.setHadithno("07");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Nimeamrishwa Nipigane Na Watu");
        mHadithobj.setHadithno("08");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Nilichokukatazeni Kiepukeni");
        mHadithobj.setHadithno("09");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Allah Ni Mwema Anakubali Kilicho Chema Tu");
        mHadithobj.setHadithno("10");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Wacha Kile Kinachokutia Shaka Ufuate Kile Kisochokutia shaka");
        mHadithobj.setHadithno("11");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Muislamu Mzuri");
        mHadithobj.setHadithno("12");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Hatoamini Mmojawenu…");
        mHadithobj.setHadithno("13");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Damu Ya Muislamu Isimwagwe Isipokuwa Kwa Sababu Tatu");
        mHadithobj.setHadithno("14");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Aliyekuwa Amemuamini Allah " +
                "Na Siku Ya Qiyaamah Aseme Ya Kheri ");
        mHadithobj.setHadithno("15");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Usihamaki");
        mHadithobj.setHadithno("16");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Mola Kaandika Uzuri (wema) Katika Kila Kitu");
        mHadithobj.setHadithno("17");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Mche Mwenyeezi Mungu Popote Ulipo");
        mHadithobj.setHadithno("18");
        hadithList.add(mHadithobj);


        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Muhifadhi Allah Atakuhifadhi");
        mHadithobj.setHadithno("19");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();

        mHadithobj.setHadithName(" Ikiwa Huna Haya Basi Fanya Utakavyo");
        mHadithobj.setHadithno("20");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Sema Namuamini Allah Kisha Kuwa Mwenye Msimamo");
        mHadithobj.setHadithno("21");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName(" Je, Nikiswali Swalah Za Fardhi, Nikafunga Ramadhaan…");
        mHadithobj.setHadithno("22");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Tohara Ni Nusu Ya Imaan");
        mHadithobj.setHadithno("23");
        hadithList.add(mHadithobj);



        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Enyi Waja Wangu Nimeikataza Nafsi Yangu Dhulma");
        mHadithobj.setHadithno("24");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Wenye Mali Wameondoka Na Fungu (jaza) Kubwa");
        mHadithobj.setHadithno("25");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Kila Kiungo Cha Mtu Lazima Kitolewe Sadaka");
        mHadithobj.setHadithno("26");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Uadilifu Ni Tabia Nzuri");
        mHadithobj.setHadithno("27");
        hadithList.add(mHadithobj);



        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Nakuhusieni Kumcha Allah Na Tabia Njema");
        mHadithobj.setHadithno("28");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Muabudu Allah Na Usimshirikishe Na Chochote");
        mHadithobj.setHadithno("29");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Allah Amefaradhisha Mambo Ya Dini Tusiyapuuze");
        mHadithobj.setHadithno("30");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Upe Ulimwengu Kisogo Allah Atakupenda");
        mHadithobj.setHadithno("31");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Kusiwe Na Kudhuriana Wala Kulipiza Dhara");
        mHadithobj.setHadithno("32");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Jukumu La Ushahidi Liko Kwa Yule Anayedai Na " +
                "Kula Kiapo Kunamuwajibikia Yule Anayekana");
        mHadithobj.setHadithno("33");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Yeyote Atakayeona Kitendo Kiovu AkiondoeKwa Mkono Wake");
        mHadithobj.setHadithno("34");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Msioneane Choyo, Msizidishiane Bei, Msichukiane");
        mHadithobj.setHadithno("35");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Atakayemuondoshea Shida Muislamu Mwenzake,Allah Atamuondoshea Shida Zake\n");
        mHadithobj.setHadithno("36");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Allah Kaviandika Vitendo Vyema Na Vibaya");
        mHadithobj.setHadithno("37");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Anayeonyesha Uadui Kwa Rafiki Yangu Mtiifu Ninatangaza Vita Dhidi Yake");
        mHadithobj.setHadithno("38");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Allah Amewasamehe Umma Wake Kukosea Na Kusahau Kwa Ajili Yake ( Mtume صلى الله عليه وسلم )");
        mHadithobj.setHadithno("39");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Kuwa Duniani Kama Vile Mgeni Au Mpita Njia");
        mHadithobj.setHadithno("40");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Hatoamini Mmoja Wenu Mpaka Mapenzi Yake Yatakapomili (yatakapoendana) Na Yale Niliyokuja Nayo");
        mHadithobj.setHadithno("41");
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Ewe Mwana Wa Adam, Utakaponiomba Na Kuweka Matumaini Kwangu Basi Nitakusamehe");
        mHadithobj.setHadithno("42");
        hadithList.add(mHadithobj);




        hAdpter.notifyDataSetChanged();
    }
    public String pataHadith(int id){
        return getResources().getString(id);
    }
}
