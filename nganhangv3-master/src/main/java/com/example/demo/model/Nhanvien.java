package com.example.demo.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Nhanvien {
    @Id
    private String manhanvien;
    private int chungminhthu;
    private String tennhanvien;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngaysinh;
    private int bacnghe;
    private int thamnien;
    private String machucvu;

    @ManyToOne
    @JoinColumn
   private Chucvu chucvu;



    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public int getChungminhthu() {
        return chungminhthu;
    }

    public void setChungminhthu(int chungminhthu) {
        this.chungminhthu = chungminhthu;
    }

    public String getTennhanvien() {
        return tennhanvien;
    }

    public void setTennhanvien(String tennhanvien) {
        this.tennhanvien = tennhanvien;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getBacnghe() {
        return bacnghe;
    }

    public void setBacnghe(int bacnghe) {
        this.bacnghe = bacnghe;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }
}
