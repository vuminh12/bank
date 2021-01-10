package com.example.demo.service;

import com.example.demo.model.Chucvu;
import com.example.demo.model.Nhanvien;
import com.example.demo.repository.ChucVuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ChucvuServiceImpl implements ChucvuService{
    @Autowired
    private ChucVuRepository chucVuRepository;

    @Override
    public Iterable<Chucvu> findAll(){
        return chucVuRepository.findAll();
    }
    public Chucvu save(Chucvu chucvu){
        return chucVuRepository.save(chucvu);
    }
   public Optional<Chucvu> findById(String machucvu){
        return chucVuRepository.findById(machucvu);
   }
    public Chucvu updateById(Chucvu chucvu){
        return chucVuRepository.save(chucvu);
    }
    public void deleteById(String machucvu){
        chucVuRepository.deleteById(machucvu);
    }
}
