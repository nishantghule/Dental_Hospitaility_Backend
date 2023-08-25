package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DentalRepo;
import com.model.Dental;

@Service
public class DentalServImpl  implements DentalServ{
	
	@Autowired
	DentalRepo dentalrepo;

	@Override
	public Dental adddental(Dental dental) {
		
		return dentalrepo.save(dental);
	}

	@Override
	public Dental getDentalByDemail(String e) {
		// TODO Auto-generated method stub
		return dentalrepo.findByDemail(e);
	}

	@Override
	public Dental getDentalByDname(String name) {
		// TODO Auto-generated method stub
		return dentalrepo.findByDname(name);
	}

	@Override
	public List<Dental> getAllByDental() {
		// TODO Auto-generated method stub
		return dentalrepo.findAll();
	}



	@Override
	public List<Dental> addAllDental(List<Dental> dent) {
		// TODO Auto-generated method stub
		return dentalrepo.saveAll(dent);
	}


}
