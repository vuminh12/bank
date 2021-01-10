package com.example.demo.controller;

import com.example.demo.model.SonoTondong;
import com.example.demo.service.SonoTondongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "sonotondong",produces = "application/json")
public class SonoTondongController {
    @Autowired
    private SonoTondongService sonoTondongService;

    @GetMapping
    public Iterable<SonoTondong> findAll(){
        return sonoTondongService.findAll();
    }
}
