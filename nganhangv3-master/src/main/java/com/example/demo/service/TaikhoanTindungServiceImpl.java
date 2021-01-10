package com.example.demo.service;

import com.example.demo.model.TaikhoanTindung;
import com.example.demo.repository.TaikhoanTindungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaikhoanTindungServiceImpl implements TaikhoanTindungService{
    @Autowired
    private TaikhoanTindungRepository taikhoanTindungRepository;

    @Override
    public Iterable<TaikhoanTindung> findAll() {
        return taikhoanTindungRepository.findAll();
    }

    @Override
    public TaikhoanTindung save(TaikhoanTindung taikhoanTindung) {
        return taikhoanTindungRepository.save(taikhoanTindung);
    }


    @Override
    public Optional<TaikhoanTindung> findById(String id) {
        return taikhoanTindungRepository.findById(id);
    }

    @Override
    public TaikhoanTindung updateById(TaikhoanTindung taikhoanTindung) {
        return taikhoanTindungRepository.save(taikhoanTindung);
    }

    @Override
    public void deleteById(String id) {
        taikhoanTindungRepository.deleteById(id);
    }


}
