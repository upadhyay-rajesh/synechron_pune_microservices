package com.synechronepuneconsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.synechronepuneconsumer.dto.Employee;

@RestController
public class MyConsumerController {
	
	@Autowired
	private DiscoveryClient dc;
	
	@Autowired
	private LoadBalancerClient lClient;
	
	//@Autowired
  //  private RestTemplate restTemplate;
	
	
	
	@GetMapping("allconsumer")
	
	public List<Employee> getAllEmp(){
		
		//List<ServiceInstance> sList= dc.getInstances("SYNECHRONEPUNEPRODUCER");
		
		ServiceInstance myproducerInstance=lClient.choose("SYNECHRONEPUNEPRODUCER");
		
		//System.out.println(sList.size());
		
		//ServiceInstance myproducerInstance=sList.get(0);
		 String uri= myproducerInstance.getUri().toString();
		
		 System.out.println(uri);
		
		RestTemplate rd=new RestTemplate();
		
		List<Employee> ll=  rd.getForObject(uri+"/displayall", List.class);
		System.out.println(ll);
		return ll;
		
	}
}









