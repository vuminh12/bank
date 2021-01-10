package com.example.demo.controller;

import com.example.demo.model.Nhanvien;
import com.example.demo.service.NhanvienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/nhanvien" , produces = "application/json")
@CrossOrigin(origins = "*")
public class NhanvienController {
    @Autowired
    private NhanvienService nhanvienService;

    @GetMapping
    public Iterable<Nhanvien> getAllNhanvien() {
        return nhanvienService.findAll();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public Nhanvien postNhanvien(@RequestBody Nhanvien nhanvien) {
        return nhanvienService.save(nhanvien);
    }

    @GetMapping("edit-nhanvien/{id}")
    public Optional<Nhanvien> updateNhanvien(@PathVariable(value = "id", required = false) String id){
         return nhanvienService.findById(id);
    }

    @DeleteMapping("delete-nhanvien/{id}")
    public void deleteNhanVien(@PathVariable(value = "id",required = false) String id){
         nhanvienService.deleteById(id);
    }
    @GetMapping("/search-nhanvien/{q}")
    public List<Nhanvien> showSearchResult(@PathVariable String q){
        List<Nhanvien> nhanviens = nhanvienService.findByNameOrId(q);
        return nhanviens;
    }

}


