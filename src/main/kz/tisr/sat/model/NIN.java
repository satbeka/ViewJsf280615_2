package main.kz.tisr.sat.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NIN {

    private String b1_date_reg_emission;
    private String b1_num_emission;
            private String volofplacedsecurities;
            private String volofdeclaredsecurities;


    public String getB1_date_reg_emission() {
        return b1_date_reg_emission;
    }

    public void setB1_date_reg_emission(Date b1_date_reg_emission) {

        if (b1_date_reg_emission==null){this.b1_date_reg_emission=null;return;}
        SimpleDateFormat dt1 = new SimpleDateFormat("dd-MM-yyyy");
        this.b1_date_reg_emission = dt1.format(b1_date_reg_emission);

    }

    public String getB1_num_emission() {
        return b1_num_emission;
    }

    public void setB1_num_emission(String b1_num_emission) {
        this.b1_num_emission = b1_num_emission;
    }

    public String getVolofplacedsecurities() {
        return volofplacedsecurities;
    }

    public void setVolofplacedsecurities(String volofplacedsecurities) {
        this.volofplacedsecurities = volofplacedsecurities;
    }

    public String getVolofdeclaredsecurities() {
        return volofdeclaredsecurities;
    }

    public void setVolofdeclaredsecurities(String volofdeclaredsecurities) {
        this.volofdeclaredsecurities = volofdeclaredsecurities;
    }

    public String getSrok() {
        return srok;
    }

    public void setSrok(String srok) {
        this.srok = srok;
    }

    private String srok;


}
