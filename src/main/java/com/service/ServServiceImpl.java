package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ServRepo;
import com.model.Serv;

@Service
public class ServServiceImpl implements ServService{
	
	@Autowired
	ServRepo servrepo;

	@Override
	public Serv saveOrder(Serv service) {
		
		return servrepo.save(service);
	}

	@Override
	public Serv getServByService(String service) {
		// TODO Auto-generated method stub
		return servrepo.findByService(service);
	}

	@Override
	public List<Serv> getAllByServ() {
		// TODO Auto-generated method stub
		return servrepo.findAll();
	}
	
	

}
