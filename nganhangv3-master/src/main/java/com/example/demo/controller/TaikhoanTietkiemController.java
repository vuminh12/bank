package com.example.demo.controller;

import com.example.demo.model.TaikhoanTietkiem;
import com.example.demo.service.TaikhoanTietkiemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/taikhoanTietkiem", produces = "application/json")
@CrossOrigin(origins = "*")
public class TaikhoanTietkiemController {
    @Autowired
    private TaikhoanTietkiemService taikhoanTietkiemService;

    @GetMapping
    public Iterable<TaikhoanTietkiem> getAllTaikhoanTietkiem() {
        return taikhoanTietkiemService.findAll();
    }

//    @GetMapping
//    public List<TaikhoanTietkiem> getFromAccount(@Param("mataikhoantietkiem") String mataikhoantietkiem
//            ,@Param("tenloaitaikhoan") String tenloaitaikhoan){
//        return taikhoanTietkiemService.GetFromAccount(mataikhoantietkiem,tenloaitaikhoan);
//    }


    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public TaikhoanTietkiem postTaikhoanTietkiem(@RequestBody TaikhoanTietkiem taikhoanTietkiem) {
        return taikhoanTietkiemService.save(taikhoanTietkiem);
    }

    @GetMapping("edit-taikhoanTietkiem/{id}")
    public Optional<TaikhoanTietkiem> updateTaikhoanTietkiem(@PathVariable(value = "id", required = false) String id){
        return taikhoanTietkiemService.findById(id);
    }

    @DeleteMapping("delete-taikhoanTietkiem/{id}")
    public void deleteTaikhoanTietkiem(@PathVariable(value = "id",required = false) String id){
        taikhoanTietkiemService.deleteById(id);
    }

}


