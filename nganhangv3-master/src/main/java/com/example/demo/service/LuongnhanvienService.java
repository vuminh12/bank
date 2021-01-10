package com.example.demo.service;

import com.example.demo.model.luongnhanvien;
import org.springframework.stereotype.Service;

@Service
public interface LuongnhanvienService {
    Iterable<luongnhanvien> findAll();
}
