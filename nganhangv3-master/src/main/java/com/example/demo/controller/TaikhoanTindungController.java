package com.example.demo.controller;

import com.example.demo.model.TaikhoanTindung;
import com.example.demo.service.TaikhoanTindungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/taikhoanTindung", produces = "application/json")
@CrossOrigin(origins = "*")
public class TaikhoanTindungController {
    @Autowired
    private TaikhoanTindungService taikhoanTindungService;

    @GetMapping
    public Iterable<TaikhoanTindung> getAllTaikhoanTindung() {
        return taikhoanTindungService.findAll();
    }


    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public TaikhoanTindung postTaikhoanTindung(@RequestBody TaikhoanTindung taikhoanTindung) {
        return taikhoanTindungService.save(taikhoanTindung);
    }

    @GetMapping("edit-taikhoanTindung/{id}")
    public Optional<TaikhoanTindung> updateTaikhoanTindung(@PathVariable(value = "id", required = false) String id){
        return taikhoanTindungService.findById(id);
    }

    @DeleteMapping("delete-taikhoanTindung/{id}")
    public void deleteTaikhoanTindung(@PathVariable(value = "id",required = false) String id){
        taikhoanTindungService.deleteById(id);
    }

}


