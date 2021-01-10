package com.example.demo.service;

import com.example.demo.model.Top3;
import org.springframework.stereotype.Service;

@Service
public interface Top3Service {
    Iterable<Top3> findAll();
}
