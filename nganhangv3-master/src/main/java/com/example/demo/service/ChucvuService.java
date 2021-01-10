package com.example.demo.service;

import com.example.demo.model.Chucvu;
import com.example.demo.model.Khachhang;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface ChucvuService {
    Iterable<Chucvu> findAll();
    Chucvu save(Chucvu chucvu);
    Optional<Chucvu> findById(String machucvu);
    Chucvu updateById(Chucvu chucvu);
    void deleteById(String machucvu);
}
