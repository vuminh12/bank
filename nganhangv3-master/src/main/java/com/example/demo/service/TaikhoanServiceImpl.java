package com.example.demo.service;

import com.example.demo.model.Taikhoan;
import com.example.demo.repository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaikhoanServiceImpl implements TaikhoanService{
    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Override
    public Iterable<Taikhoan> findAll() {
        return taiKhoanRepository.findAll();
    }

    @Override
    public Taikhoan save(Taikhoan taikhoan) {
        return taiKhoanRepository.save(taikhoan);
    }

    @Override
    public Optional<Taikhoan> findById(String id) {
        return taiKhoanRepository.findById(id);
    }

    @Override
    public Taikhoan updateById(Taikhoan taikhoan) {
        return taiKhoanRepository.save(taikhoan);
    }

    @Override
    public void deleteById(String id) {
        taiKhoanRepository.deleteById(id);
    }
}
