package com.example.demo.service;

import com.example.demo.model.Sotaikhoanmotnhanvien;
import com.example.demo.repository.SotaikhoanmotnhanvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SotaikhoanmotnhanvienServiceImpl implements SotaikhoanmotnhanvienService{
    @Autowired
    private SotaikhoanmotnhanvienRepository sotaikhoanmotnhanvienRepository;




    @Override
    public Iterable<Sotaikhoanmotnhanvien> findAll() {
        return sotaikhoanmotnhanvienRepository.findAll();
    }
}
