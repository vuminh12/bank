package com.example.demo.model;

import jdk.nashorn.internal.ir.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "top3")
@Immutable
public class Top3 {
    @Id
    private String makhachhang;
    private Float tongtiengui;

    public String getMakhachhang() {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public Float getTongtiengui() {
        return tongtiengui;
    }

    public void setTongtiengui(Float tongtiengui) {
        this.tongtiengui = tongtiengui;
    }
}
