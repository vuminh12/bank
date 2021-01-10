package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "taikhoantietkiem")
@Table
public class TaikhoanTietkiem {
    @Id
    private String mataikhoantietkiem;
    private String tenloaitaikhoan;
    private Float laisuathangthang;
    private Float sodutoithieu;
    private Float sotienguilandau;

    public Float getSotienguilandau() {
        return sotienguilandau;
    }

    public void setSotienguilandau(Float sotienguilandau) {
        this.sotienguilandau = sotienguilandau;
    }



    public String getMataikhoantietkiem() {
        return mataikhoantietkiem;
    }

    public void setMataikhoantietkiem(String mataikhoantietkiem) {
        this.mataikhoantietkiem = mataikhoantietkiem;
    }

    public String getTenloaitaikhoan() {
        return tenloaitaikhoan;
    }

    public void setTenloaitaikhoan(String tenloaitaikhoan) {
        this.tenloaitaikhoan = tenloaitaikhoan;
    }

    public Float getSodutoithieu() {
        return sodutoithieu;
    }

    public void setSodutoithieu(Float sodutoithieu) {
        this.sodutoithieu = sodutoithieu;
    }

    public Float getLaisuathangthang() {
        return laisuathangthang;
    }

    public void setLaisuathangthang(Float laisuathangthang) {
        this.laisuathangthang = laisuathangthang;
    }
}
