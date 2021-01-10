package com.example.demo.service;

import com.example.demo.model.GiaodichKhachhang;
import com.example.demo.repository.GiaodichKhachhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GiaodichKhachhangServiceImpl implements GiaodichKhachhangService{
    @Autowired
    private GiaodichKhachhangRepository giaodichKhachhangRepository;

    @Override
    public Iterable<GiaodichKhachhang> findAll() {

        return giaodichKhachhangRepository.findAll();
    }

    @Override
    public GiaodichKhachhang save(GiaodichKhachhang giaodichkhachhang) {
        return giaodichKhachhangRepository.save(giaodichkhachhang);
    }

    @Override
    public Optional<GiaodichKhachhang> findById(String id) {
        return giaodichKhachhangRepository.findById(id);
    }

    @Override
    public GiaodichKhachhang updateById(GiaodichKhachhang giaodichKhachhang) {
        return save(giaodichKhachhang);
    }


}
