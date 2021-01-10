package com.example.demo.service;

import com.example.demo.model.luongnhanvien;
import com.example.demo.repository.LuongnhanvienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LuongnhanvienServiceImpl implements LuongnhanvienService{

    @Autowired
    private LuongnhanvienRepository luongnhanvienRepository;

    @Override
    public Iterable<luongnhanvien> findAll() {
        return luongnhanvienRepository.findAll();
    }
}
