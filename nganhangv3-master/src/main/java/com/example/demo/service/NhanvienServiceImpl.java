package com.example.demo.service;

import com.example.demo.model.Nhanvien;
import com.example.demo.repository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NhanvienServiceImpl implements NhanvienService{
    @Autowired
    private NhanVienRepository nhanvienRepository;

    @Override
    public Iterable<Nhanvien> findAll() {

        return  nhanvienRepository.findAll();
    }
    @Override
    public Nhanvien save(Nhanvien nhanvien) {

        return nhanvienRepository.save(nhanvien);
    }

    @Override
    public Optional<Nhanvien> findById(String id) {
        return nhanvienRepository.findById(id);
    }
    @Override
    public Nhanvien updateById(Nhanvien nhanvien){
        return nhanvienRepository.save(nhanvien);
    }
    @Override
    public void deleteById(String id) {
        nhanvienRepository.deleteById(id);
    }
    @Override
    public List<Nhanvien> findByNameOrId(String searchName) {
        return nhanvienRepository.findAllByNameOrId(searchName);
    }


}
