package com.madega.ramadhani.arubainanawawi.Models;

/**
 * Created by root on 8/27/18.
 */

public class HadithModel {
    private String Hadithno;

    private String heading;
    private String hadithName;
    private String hadithArabic;
    private String hadithKisw;

    public String getHadithno() {
        return Hadithno;
    }

    public void setHadithno(String hadithno) {
        Hadithno = hadithno;
    }

    public String getHadithName() {
        return hadithName;
    }

    public void setHadithName(String hadithName) {
        this.hadithName = hadithName;
    }


    public String getHadithArabic() {
        return hadithArabic;
    }

    public void setHadithArabic(String hadithArabic) {
        this.hadithArabic = hadithArabic;
    }

    public String getHadithKisw() {
        return hadithKisw;
    }

    public void setHadithKisw(String hadithKisw) {
        this.hadithKisw = hadithKisw;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }
}
