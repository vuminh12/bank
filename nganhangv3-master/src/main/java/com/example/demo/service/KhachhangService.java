package com.example.demo.service;

import com.example.demo.model.Chucvu;
import com.example.demo.model.Khachhang;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface KhachhangService {
     Iterable<Khachhang> findAll();
     Khachhang save(Khachhang khachhang);
     Optional<Khachhang> findById(String id);
    Khachhang updateById(Khachhang khachhang);
    void deleteById(String makhachhang);
}


