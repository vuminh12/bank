package com.example.demo.service;

import com.example.demo.model.GiaodichKhachhang;
import com.example.demo.model.GiaodichThe;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface GiaodichTheService {
    Iterable<GiaodichThe> findAll();
     GiaodichThe save(GiaodichThe giaodichThe);
    Optional<GiaodichThe> findById(String id);
    GiaodichThe updateById(GiaodichThe giaodichThe);
}
