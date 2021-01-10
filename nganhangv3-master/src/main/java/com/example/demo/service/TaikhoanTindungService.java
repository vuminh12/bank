package com.example.demo.service;

import com.example.demo.model.TaikhoanTindung;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface TaikhoanTindungService {
    Iterable<TaikhoanTindung> findAll();
    TaikhoanTindung save(TaikhoanTindung taikhoanTindung);
    Optional<TaikhoanTindung> findById(String id);
    TaikhoanTindung updateById(TaikhoanTindung taikhoanTindung);
    void deleteById(String id);

}
