package com.service;

import java.util.List;

import com.model.Serv;

public interface ServService {
	
	Serv saveOrder(Serv service);
	
	Serv getServByService(String service);
	
	List<Serv> getAllByServ();

}
