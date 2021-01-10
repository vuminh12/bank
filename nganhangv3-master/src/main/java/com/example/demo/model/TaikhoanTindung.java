package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="taikhoantindung")
public class TaikhoanTindung {
    @Id
    private String mataikhoantindung;
    private String tenloaitaikhoan;
    private Float hanmuctoida;
    private  Float sonohientai;

    public String getMataikhoantindung() {
        return mataikhoantindung;
    }

    public void setMataikhoantindung(String mataikhoantindung) {
        this.mataikhoantindung = mataikhoantindung;
    }

    public String getTenloaitaikhoan() {
        return tenloaitaikhoan;
    }

    public void setTenloaitaikhoan(String tenloaitaikhoan) {
        this.tenloaitaikhoan = tenloaitaikhoan;
    }

    public Float getHanmuctoida() {
        return hanmuctoida;
    }

    public void setHanmuctoida(Float hanmuctoida) {
        this.hanmuctoida = hanmuctoida;
    }

    public Float getSonohientai() {
        return sonohientai;
    }
    public void setSonohientai(Float sonohientai) {
        this.sonohientai = sonohientai;
    }
}
