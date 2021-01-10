package com.example.demo.controller;

import com.example.demo.model.Taikhoan;
import com.example.demo.service.TaikhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/taikhoan" , produces = "application/json")
@CrossOrigin(origins = "*")
public class TaikhoanController {
    @Autowired
    private TaikhoanService taikhoanService;

    @GetMapping
    public Iterable<Taikhoan> getAllTaikhoan() {
        return taikhoanService.findAll();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Taikhoan postTaikhoan(@RequestBody Taikhoan taikhoan) {
        return taikhoanService.save(taikhoan);
    }

    @GetMapping("edit-taikhoan/{id}")
    public Optional<Taikhoan> updateTaikhoan(@PathVariable(value = "id", required = false) String id){
        return taikhoanService.findById(id);
    }

    @DeleteMapping("delete-taikhoan/{id}")
    public void deleteTaikhoan(@PathVariable(value = "id",required = false) String id){
        taikhoanService.deleteById(id);
    }

}


