package com.service;

import java.util.List;

import com.model.Dental;

public interface DentalServ  {
	
	Dental adddental(Dental dental);
	
	List<Dental> addAllDental(List<Dental> dent);
	
	Dental getDentalByDemail(String e);
	
	Dental getDentalByDname(String name);
	
	List<Dental> getAllByDental();


}
