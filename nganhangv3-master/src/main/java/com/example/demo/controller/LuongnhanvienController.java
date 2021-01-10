package com.example.demo.controller;

import com.example.demo.model.luongnhanvien;
import com.example.demo.service.LuongnhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/luongnhanvien", produces = "application/json")
public class LuongnhanvienController {
    @Autowired
    private LuongnhanvienService luongnhanvienService;

    @GetMapping
    public Iterable<luongnhanvien> findAll(){
        return luongnhanvienService.findAll();
    }
}
