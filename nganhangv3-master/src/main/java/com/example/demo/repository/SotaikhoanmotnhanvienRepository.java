package com.example.demo.repository;

import com.example.demo.model.Sotaikhoanmotnhanvien;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Repository
public interface SotaikhoanmotnhanvienRepository  extends CrudRepository<Sotaikhoanmotnhanvien,String> {
//    @Query("select manhanvientaotaikhoan, tenloaitaikhoan,count(tenloaitaikhoan,manhanvientaotaikhoan) as soluong" +
//            "from taikhoan" +
//            "group by tenloaitaikhoan, manhanvientaotaikhoan ")
//    @Query(name = "select manhanvientaotaikhoan,tenloaitaikhoan, count(*) as soluong from taikhoan group by (tenloaitaikhoan, manhanvientaotaikhoan)",nativeQuery = true)
//    List<Sotaikhoanmotnhanvien> getAllAccount();
}
