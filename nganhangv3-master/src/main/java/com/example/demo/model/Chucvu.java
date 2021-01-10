package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Chucvu {
    @Id
    private String machucvu;
    private String tenchucvu;
    @OneToMany(mappedBy = "chucvu",cascade = CascadeType.ALL)
    private List<Nhanvien> nhanviens = new ArrayList<Nhanvien>();

    public String getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(String machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }
}
