package com.madega.ramadhani.arubainanawawi.Fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Toast;


import com.madega.ramadhani.arubainanawawi.Adapter.HadithAdapter;
import com.madega.ramadhani.arubainanawawi.Models.HadithModel;
import com.madega.ramadhani.arubainanawawi.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 8/29/18.
 */

public class Test extends Fragment {
    private HadithModel  mHadithobj;
    public List<HadithModel> hadithList=new ArrayList<>();
    private RecyclerView mRecyclerView;
    private LinearLayoutManager linearLayoutManager;
    public HadithAdapter hAdpter;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.testactivity,container,false);
        mRecyclerView = v.findViewById(R.id.recView);
        linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        hAdpter = new HadithAdapter(getActivity(), hadithList);

        mRecyclerView.setAdapter(hAdpter);
        setDatatoAdapter();
        return v;
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
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith3));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith3tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Umbo la kila mwanadamu");
        mHadithobj.setHadithno("04");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith4));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith4tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Atakayezua Kitu Kisichokuwemo Katika Jambo Hili Letu Kitakataliwa");
        mHadithobj.setHadithno("05");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith5));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith5tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Hakika Halali Iko Wazi Na Haramu Iko Wazi");
        mHadithobj.setHadithno("06");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith6));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith6tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Dini Ni Nasiha");
        mHadithobj.setHadithno("07");

        mHadithobj.setHadithArabic(pataHadith(R.string.hadith7));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith7tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Nimeamrishwa Nipigane Na Watu");
        mHadithobj.setHadithno("08");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith8));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith8tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Nilichokukatazeni Kiepukeni");
        mHadithobj.setHadithno("09");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith9));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith9tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Allah Ni Mwema Anakubali Kilicho Chema Tu");
        mHadithobj.setHadithno("10");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith10));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith10tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Wacha Kile Kinachokutia Shaka Ufuate Kile Kisochokutia shaka");
        mHadithobj.setHadithno("11");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith11));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith11tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Muislamu Mzuri");
        mHadithobj.setHadithno("12");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith12));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith12tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Hatoamini Mmojawenu…");
        mHadithobj.setHadithno("13");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith13));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith13tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Damu Ya Muislamu Isimwagwe Isipokuwa Kwa Sababu Tatu");
        mHadithobj.setHadithno("14");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith14));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith14tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Aliyekuwa Amemuamini Allah " +
                "Na Siku Ya Qiyaamah Aseme Ya Kheri ");
        mHadithobj.setHadithno("15");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith15));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith15tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Usihamaki");
        mHadithobj.setHadithno("16");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith16));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith16tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Mola Kaandika Uzuri (wema) Katika Kila Kitu");
        mHadithobj.setHadithno("17");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith17));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith17tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Mche Mwenyeezi Mungu Popote Ulipo");
        mHadithobj.setHadithno("18");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith18));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith18tafsiri));
        hadithList.add(mHadithobj);


        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Muhifadhi Allah Atakuhifadhi");
        mHadithobj.setHadithno("19");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith19));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith19tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();

        mHadithobj.setHadithName(" Ikiwa Huna Haya Basi Fanya Utakavyo");
        mHadithobj.setHadithno("20");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith20));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith20tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Sema Namuamini Allah Kisha Kuwa Mwenye Msimamo");
        mHadithobj.setHadithno("21");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith21));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith21tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName(" Je, Nikiswali Swalah Za Fardhi, Nikafunga Ramadhaan…");
        mHadithobj.setHadithno("22");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith22));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith22tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Tohara Ni Nusu Ya Imaan");
        mHadithobj.setHadithno("23");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith23));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith23tafsiri));
        hadithList.add(mHadithobj);


        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Enyi Waja Wangu Nimeikataza Nafsi Yangu Dhulma");
        mHadithobj.setHadithno("24");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith24));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith24tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Wenye Mali Wameondoka Na Fungu (jaza) Kubwa");
        mHadithobj.setHadithno("25");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith25));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith25tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Kila Kiungo Cha Mtu Lazima Kitolewe Sadaka");
        mHadithobj.setHadithno("26");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith27));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith27tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Uadilifu Ni Tabia Nzuri");
        mHadithobj.setHadithno("27");
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith27));
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith27tafsiri));
        hadithList.add(mHadithobj);


        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Nakuhusieni Kumcha Allah Na Tabia Njema");
        mHadithobj.setHadithno("28");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith28));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith28tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Muabudu Allah Na Usimshirikishe Na Chochote");
        mHadithobj.setHadithno("29");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith29));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith29tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Allah Amefaradhisha Mambo Ya Dini Tusiyapuuze");
        mHadithobj.setHadithno("30");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith30));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith30tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Upe Ulimwengu Kisogo Allah Atakupenda");
        mHadithobj.setHadithno("31");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith31));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith31tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Kusiwe Na Kudhuriana Wala Kulipiza Dhara");
        mHadithobj.setHadithno("32");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith32));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith32tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Jukumu La Ushahidi Liko Kwa Yule Anayedai Na " +
                "Kula Kiapo Kunamuwajibikia Yule Anayekana");
        mHadithobj.setHadithno("33");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith33));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith33tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Yeyote Atakayeona Kitendo Kiovu AkiondoeKwa Mkono Wake");
        mHadithobj.setHadithno("34");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith34));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith34tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Msioneane Choyo, Msizidishiane Bei, Msichukiane");
        mHadithobj.setHadithno("35");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith35));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith35tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Atakayemuondoshea Shida Muislamu Mwenzake,Allah Atamuondoshea Shida Zake\n");
        mHadithobj.setHadithno("36");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith36));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith36tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Allah Kaviandika Vitendo Vyema Na Vibaya");
        mHadithobj.setHadithno("37");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith37));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith37tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Anayeonyesha Uadui Kwa Rafiki Yangu Mtiifu Ninatangaza Vita Dhidi Yake");
        mHadithobj.setHadithno("38");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith38));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith38tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Allah Amewasamehe Umma Wake Kukosea Na Kusahau Kwa Ajili Yake ( Mtume صلى الله عليه وسلم )");
        mHadithobj.setHadithno("39");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith39));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith39tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Kuwa Duniani Kama Vile Mgeni Au Mpita Njia");
        mHadithobj.setHadithno("40");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith40));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith40tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Hatoamini Mmoja Wenu Mpaka Mapenzi Yake Yatakapomili (yatakapoendana) Na Yale Niliyokuja Nayo");
        mHadithobj.setHadithno("41");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith41));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith41tafsiri));
        hadithList.add(mHadithobj);

        mHadithobj = new HadithModel();
        mHadithobj.setHadithName("Ewe Mwana Wa Adam, Utakaponiomba Na Kuweka Matumaini Kwangu Basi Nitakusamehe");
        mHadithobj.setHadithno("42");
        mHadithobj.setHadithArabic(pataHadith(R.string.hadith42));
        mHadithobj.setHadithKisw(pataHadith(R.string.hadith42tafsiri));
        hadithList.add(mHadithobj);

        hAdpter.notifyDataSetChanged();

    }

    public String pataHadith(int id) {
        return getActivity().getResources().getString(id);
    }
    public void updateRecycler(String text) {
            List<HadithModel> newlist=new ArrayList<>();
            text.toString().toLowerCase();

            if (text.isEmpty()) {
                hAdpter.updateList(hadithList);
            } else {

                for (int i = 0; i < hadithList.size(); i++) {
                    String name = hadithList.get(i).getHadithName().toLowerCase();
                    String number=hadithList.get(i).getHadithno().toLowerCase();
                    // Adapt the if for your usage
                    if (name.contains(text) || number.contains(text)) {
                        newlist.add(hadithList.get(i));

                    }


                }
                if (newlist.isEmpty()) {
                    Toast.makeText(getActivity(), "Hakuna hadith hio", Toast.LENGTH_SHORT).show();
                    hAdpter.updateList(newlist);
                } else {
                    hAdpter.updateList(newlist);
                }


            }
        }


}
