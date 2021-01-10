package com.example.demo.service;

import com.example.demo.model.Taikhoan;
import com.example.demo.model.TaikhoanTietkiem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface TaikhoanTietkiemService {
   Iterable<TaikhoanTietkiem> findAll();
    TaikhoanTietkiem save(TaikhoanTietkiem taikhoanTietkiem);
    Optional<TaikhoanTietkiem> findById(String id);
    TaikhoanTietkiem updateById(TaikhoanTietkiem taikhoanTietkiem);
    void deleteById(String id);

//    List<TaikhoanTietkiem> GetFromAccount(String mataikhoantietkiem, String tenloaitaikhoan);
}
