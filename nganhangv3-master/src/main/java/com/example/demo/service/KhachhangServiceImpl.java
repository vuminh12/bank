package com.example.demo.service;

import com.example.demo.model.Khachhang;
import com.example.demo.repository.KhachHangRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.SQLQuery;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Service
public class KhachhangServiceImpl implements KhachhangService {
    @Autowired
    private KhachHangRepository khachHangRepository;


    @Override
    public Iterable<Khachhang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public Khachhang save(Khachhang khachhang) {

       return khachHangRepository.save(khachhang);
    }

    @Override
    public Optional<Khachhang> findById(String id) {
        return khachHangRepository.findById(id);
    }

    @Override
    public Khachhang updateById(Khachhang khachhang) {
        return save(khachhang);
    }

    @Override
    public void deleteById(String id) {
        khachHangRepository.deleteById(id);
    }

}
