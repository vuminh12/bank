package com.example.demo.service;

import com.example.demo.model.TaikhoanTietkiem;
import com.example.demo.repository.TaikhoanTietkiemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaikhoanTietkiemServiceImpl implements TaikhoanTietkiemService{
    @Autowired
    private TaikhoanTietkiemRepository taikhoanTietkiemRepository;

    @Override
    public Iterable<TaikhoanTietkiem> findAll() {
        return taikhoanTietkiemRepository.findAll();
    }

    @Override
    public TaikhoanTietkiem save(TaikhoanTietkiem taikhoanTietkiem) {
        return taikhoanTietkiemRepository.save(taikhoanTietkiem);
    }


    @Override
    public Optional<TaikhoanTietkiem> findById(String id) {
        return taikhoanTietkiemRepository.findById(id);
    }

    @Override
    public TaikhoanTietkiem updateById(TaikhoanTietkiem taikhoanTietkiem) {
        return taikhoanTietkiemRepository.save(taikhoanTietkiem);
    }

    @Override
    public void deleteById(String id) {
        taikhoanTietkiemRepository.deleteById(id);
    }

//    @Override
//    public List<TaikhoanTietkiem> GetFromAccount(String mataikhoantietkiem, String tenloaitaikhoan) {
//        List<TaikhoanTietkiem> taikhoanTietkiems =taikhoanTietkiemRepository.GetFromAccount(mataikhoantietkiem,tenloaitaikhoan);
//    return taikhoanTietkiems;
//    }
}
