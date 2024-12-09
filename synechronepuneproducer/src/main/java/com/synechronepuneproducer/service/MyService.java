package com.synechronepuneproducer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechronepuneproducer.dao.MyDAOInterface;
import com.synechronepuneproducer.entity.Employee;

@Service
public class MyService implements MyServiceInterface {
	
	@Autowired
	private MyDAOInterface mDao;

	@Override
	public List<Employee> getAllService() {
		// TODO Auto-generated method stub
		return mDao.findAll();
	}

}
