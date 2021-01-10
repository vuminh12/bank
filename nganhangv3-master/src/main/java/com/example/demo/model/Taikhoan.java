package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Taikhoan {
    @Id
    private String mataikhoan;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaytaotaikhoan;
    private String tenloaitaikhoan;
    private String makhachhang;
    private String manhanvientaotaikhoan;
    private Float sodu;


    public String getMataikhoan() {
        return mataikhoan;
    }

    public void setMataikhoan(String mataikhoan) {
        this.mataikhoan = mataikhoan;
    }

    public Date getNgaytaotaikhoan() {
        return ngaytaotaikhoan;
    }

    public void setNgaytaotaikhoan(Date ngaytaotaikhoan) {
        this.ngaytaotaikhoan = ngaytaotaikhoan;
    }

    public String getTenloaitaikhoan() {
        return tenloaitaikhoan;
    }

    public void setTenloaitaikhoan(String tenloaitaikhoan) {
        this.tenloaitaikhoan = tenloaitaikhoan;
    }

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getManhanvientaotaikhoan() {
        return manhanvientaotaikhoan;
    }

    public void setManhanvientaotaikhoan(String manhanvientaotaikhoan) {
        this.manhanvientaotaikhoan = manhanvientaotaikhoan;
    }

    public Float getSodu() {
        return sodu;
    }

    public void setSodu(float sodu) {
        this.sodu = sodu;
    }
}
