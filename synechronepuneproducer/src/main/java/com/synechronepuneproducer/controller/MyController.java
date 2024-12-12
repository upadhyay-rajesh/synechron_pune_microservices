package com.synechronepuneproducer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.synechronepuneproducer.entity.Employee;
import com.synechronepuneproducer.service.MyServiceInterface;

@RestController
@RequestMapping("/api")
public class MyController {
	
	@Autowired
	private MyServiceInterface mService;
	
	
	@GetMapping("/displayall")
	public List<Employee> getAll(){
		return mService.getAllService();
	}
}
