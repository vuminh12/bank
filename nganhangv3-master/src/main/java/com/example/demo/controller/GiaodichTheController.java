package com.example.demo.controller;

import com.example.demo.model.GiaodichKhachhang;
import com.example.demo.model.GiaodichThe;
import com.example.demo.service.GiaodichTheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/giaodichThe",produces = "application/json")
public class GiaodichTheController {
    @Autowired
    private GiaodichTheService giaodichTheService;

    @GetMapping
    public Iterable<GiaodichThe> getAllTaikhoan() {
        return giaodichTheService.findAll();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void postTaikhoan(@RequestBody GiaodichThe giaodichThe) {
         giaodichTheService.save(giaodichThe);
    }
    @GetMapping("search-giaodichThe/{id}")
    public Optional<GiaodichThe> updateThe(@PathVariable(value = "id", required = false) String id){
        return giaodichTheService.findById(id);
    }
}
