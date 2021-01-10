package com.example.demo.service;

import com.example.demo.model.Top3;
import com.example.demo.repository.Top3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Top3ServiceImpl implements Top3Service {
    @Autowired
    private Top3Repository top3Repository;
    @Override
    public Iterable<Top3> findAll() {
        return top3Repository.findAll();
    }


}
