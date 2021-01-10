package com.example.demo.controller;

import com.example.demo.model.Khachhang;
import com.example.demo.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/khachhang" , produces = "application/json")
@CrossOrigin(origins = "*")
public class KhachhangController {
    @Autowired
    private KhachhangService khachhangService;

    @GetMapping
    public Iterable<Khachhang> getAllKhachhang() {
        return khachhangService.findAll();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Khachhang postKhachhang(@RequestBody Khachhang khachhang) {
        return khachhangService.save(khachhang);
    }

    @GetMapping("edit-khachhang/{id}")
    public Optional<Khachhang> updateKhachHang(@PathVariable(value = "id", required = false) String id){
        return khachhangService.findById(id);
    }

    @DeleteMapping("delete-khachhang/{id}")
    public void deleteKhachHang(@PathVariable(value = "id",required = false) String id){
        khachhangService.deleteById(id);
    }
}


