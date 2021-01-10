package com.example.demo.repository;

import com.example.demo.model.TaikhoanTietkiem;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TaikhoanTietkiemRepository extends CrudRepository<TaikhoanTietkiem, String> {
//    @Query (value = "select t from taikhoantietkiem  t" +
//            "where (:laisuathangthang is null) and (:sodutoithieu is null)")
//
//    <List>TaikhoanTietkiem GetFromAccount(@Param("matenloaitaikhoan") String matenloaitaikhoan
//            ,@Param("tenloaitaikhoan") String tenloaitaikhoan);
}
