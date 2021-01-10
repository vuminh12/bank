package com.example.demo.service;

import com.example.demo.model.Nhanvien;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface NhanvienService {
    Iterable<Nhanvien> findAll();
    Nhanvien save(Nhanvien nhanvien);
    Optional<Nhanvien> findById(String id);
    Nhanvien updateById(Nhanvien nhanvien);
    void deleteById(String id);



    List<Nhanvien> findByNameOrId(String searchName);

}
