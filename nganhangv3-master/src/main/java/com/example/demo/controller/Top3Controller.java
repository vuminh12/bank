package com.example.demo.controller;

import com.example.demo.model.Top3;
import com.example.demo.service.Top3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/top3",produces ="application/json")
public class Top3Controller {
    @Autowired
    private Top3Service top3Service;

    @GetMapping
    public Iterable<Top3> findAll(){
        return top3Service.findAll();
    }
}
