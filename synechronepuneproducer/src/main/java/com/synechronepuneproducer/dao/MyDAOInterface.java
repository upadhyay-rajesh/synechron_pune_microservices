package com.synechronepuneproducer.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechronepuneproducer.entity.Employee;

@Repository
public interface MyDAOInterface extends JpaRepository<Employee, String>{

}
