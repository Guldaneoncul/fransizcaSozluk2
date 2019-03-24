package com.example.fransizcasozluk;

public class diller {
    private String tr;
    private String fr;
    private int resimId;
    private int sesId;

    public diller(String tr, String fr, int resimId, int sesId) {
        this.tr = tr;
        this.fr = fr;
        this.resimId = resimId;
        this.sesId = sesId;
    }


    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }

    public int getSesId() {
        return sesId;
    }

    public void setSesId(int sesId) {
        this.sesId = sesId;
    }



}