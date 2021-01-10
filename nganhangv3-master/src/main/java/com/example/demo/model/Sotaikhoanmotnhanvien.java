package com.example.demo.model;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity(name = "sotaikhoanmotnhanvien")
@Immutable
public class Sotaikhoanmotnhanvien {
    @Id
    private String manhanvientaotaikhoan  ;
    private String tenloaitaikhoan;
    private int soluong;

    public String getTenloaitaikhoan() {
        return tenloaitaikhoan;
    }

    public void setTenloaitaikhoan(String tenloaitaikhoan) {
        this.tenloaitaikhoan = tenloaitaikhoan;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getManhanvientaotaikhoan() {
        return manhanvientaotaikhoan;
    }

    public void setManhanvientaotaikhoan(String manhanvientaotaikhoan) {
        this.manhanvientaotaikhoan = manhanvientaotaikhoan;
    }
}


