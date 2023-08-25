package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Dental;
import com.service.DentalServ;

@CrossOrigin(origins="http://localhost:4200")

@RestController
public class DentalController {
	
	@Autowired
	DentalServ dentalserv;
	
	@PostMapping("/wee")
	public Dental adddental(@RequestBody Dental dental) {
		// TODO Auto-generated method stub
		return dentalserv.adddental(dental);
	}
	
	@PostMapping("/addAll")
	public List<Dental> addAllDental1(@RequestBody List<Dental> dent) {
		
		return dentalserv.addAllDental(dent);
	}
	
	@GetMapping("/searchbyemail/{e}")
	public Dental getDentalByDemail(@PathVariable("e") String e) {
		return dentalserv.getDentalByDemail(e);
		
	}
	
	@GetMapping("/getbyname/{name}")
	public Dental getDentalByDname(@PathVariable("name") String name) {
		
		return dentalserv.getDentalByDname(name);
	}
	
//	@GetMapping("/getbyname1")
//	public ResponseEntity<String> handleRequest(@PathVariable("dname") String name) {
//		System.out.println(name);
//		return ResponseEntity.ok("you got the result");
//	}
	
	@GetMapping("getalldentals")
	public List<Dental> getAllByDental() {
		// TODO Auto-generated method stub
		return dentalserv.getAllByDental();
	}



}
