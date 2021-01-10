package com.example.demo.model;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "luongnhanvien")
@Immutable
public class luongnhanvien {
    @Id
    private String manhanvientaotaikhoan;
    private Float luong;

    public String getManhanvientaotaikhoan() {
        return manhanvientaotaikhoan;
    }

    public void setManhanvientaotaikhoan(String manhanvientaotaikhoan) {
        this.manhanvientaotaikhoan = manhanvientaotaikhoan;
    }

    public Float getLuong() {
        return luong;
    }

    public void setLuong(Float luong) {
        this.luong = luong;
    }
}

