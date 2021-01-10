package com.example.demo.service;

import com.example.demo.model.SonoTondong;
import com.example.demo.model.Sotaikhoanmotnhanvien;
import org.springframework.stereotype.Service;

@Service
public interface SonoTondongService {
    Iterable<SonoTondong> findAll();
}
