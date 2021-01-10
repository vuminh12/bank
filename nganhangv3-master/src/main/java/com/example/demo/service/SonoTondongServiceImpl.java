package com.example.demo.service;

import com.example.demo.model.SonoTondong;

import com.example.demo.repository.SonoTondongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SonoTondongServiceImpl implements SonoTondongService{

    @Autowired
    private SonoTondongRepository sonoTondongRepository;

    @Override
    public Iterable<SonoTondong> findAll() {
        return sonoTondongRepository.findAll();
    }
}
