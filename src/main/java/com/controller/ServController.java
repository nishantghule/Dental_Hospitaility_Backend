package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Serv;
import com.service.ServService;

@CrossOrigin(origins="http://localhost:4200")

@RestController
public class ServController {
	
	@Autowired
	ServService servservice;
	
	@PostMapping("/getby")
	public Serv saveOrder(@RequestBody Serv service) {
		
		return servservice.saveOrder(service);
	}
	
	@GetMapping("/getbyservice/{service}")
	public Serv getServByService(@PathVariable("service") String service) {
		
		return servservice.getServByService(service);
	}
	
	@GetMapping("/getallserv")
	public List<Serv> getAllByServ() {
		
		return servservice.getAllByServ();
	}


}
