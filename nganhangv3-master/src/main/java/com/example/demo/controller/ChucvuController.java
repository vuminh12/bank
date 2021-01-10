package com.example.demo.controller;

import com.example.demo.model.Chucvu;
import com.example.demo.service.ChucvuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/chucvu", produces = "application/json")
public class ChucvuController {
    @Autowired
    private ChucvuService chucvuService;

    @GetMapping
    public Iterable<Chucvu> GetAllChucvu(){
        return chucvuService.findAll();
    }
    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Chucvu postChucVu(@RequestBody Chucvu chucvu) {
        return chucvuService.save(chucvu);
    }

    @GetMapping("edit-chucvu/{id}")
    public Optional<Chucvu> updateChucVu(@PathVariable(value = "id", required = false) String id){
        return chucvuService.findById(id);
    }

    @DeleteMapping("delete-chucvu/{id}")
    public void deleteChucVu(@PathVariable(value = "id",required = false) String id){
        chucvuService.deleteById(id);
    }
}
