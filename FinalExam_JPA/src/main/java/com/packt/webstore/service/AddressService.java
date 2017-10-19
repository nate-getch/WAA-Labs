package com.packt.webstore.service;

import java.util.List;

import com.packt.webstore.domain.Address;
 
public interface AddressService {

	public void save(Address address); 		

	public List<Address> findAll();
 	public Address findOne(Long id);
	
}
