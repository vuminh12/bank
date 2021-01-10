package com.example.demo.controller;

import com.example.demo.model.Sotaikhoanmotnhanvien;
import com.example.demo.repository.SotaikhoanmotnhanvienRepository;
import com.example.demo.service.SotaikhoanmotnhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sotaikhoanmotnhanvien",produces = "application/json")
public class SotaikhoanmotnhanvienController {
    @Autowired
    private SotaikhoanmotnhanvienService sotaikhoanmotnhanvienService;

    @GetMapping
    public Iterable<Sotaikhoanmotnhanvien> getAll(){
        return sotaikhoanmotnhanvienService.findAll();
    }
}
