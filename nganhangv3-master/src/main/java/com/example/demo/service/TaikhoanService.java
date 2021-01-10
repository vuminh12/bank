package com.example.demo.service;
import com.example.demo.model.Taikhoan;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface TaikhoanService {
    Iterable<Taikhoan> findAll();
    Taikhoan save(Taikhoan taikhoan);
    Optional<Taikhoan> findById(String id);
    Taikhoan updateById(Taikhoan taikhoan);
    void deleteById(String id);
}
