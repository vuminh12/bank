package com.example.demo.service;

import com.example.demo.model.GiaodichKhachhang;
import com.example.demo.model.Khachhang;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface GiaodichKhachhangService {
    Iterable<GiaodichKhachhang> findAll();
    GiaodichKhachhang save(GiaodichKhachhang giaodichkhachhang);
    Optional<GiaodichKhachhang> findById(String id);
    GiaodichKhachhang updateById(GiaodichKhachhang giaodichKhachhang);

}
