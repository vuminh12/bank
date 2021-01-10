package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "sonotondong")
public class SonoTondong {
    @Id
    private String makhachhang;
    private int  soluongtaikhoantd;
     private Float tongtienno;

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public int getSoluongtaikhoantd() {
        return soluongtaikhoantd;
    }

    public void setSoluongtaikhoantd(int soluongtaikhoantd) {
        this.soluongtaikhoantd = soluongtaikhoantd;
    }

    public Float getTongtienno() {
        return tongtienno;
    }

    public void setTongtienno(Float tongtienno) {
        this.tongtienno = tongtienno;
    }
}
