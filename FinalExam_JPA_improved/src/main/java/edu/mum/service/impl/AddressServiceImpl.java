package edu.mum.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.domain.Address;
import edu.mum.domain.Employee;
import edu.mum.repository.AddressRepository;
import edu.mum.service.AddressService;

@Service
@Transactional
public class AddressServiceImpl implements AddressService{
	@Autowired
	AddressRepository addressRepository;

	@Override
	public void save(Address address) {
		addressRepository.save(address);
	}

	@Override
	public List<Address> findAll() {
		return (List<Address>) addressRepository.findAll();
	}

	@Override
	public Address findOne(int id) {
		// TODO Auto-generated method stub
		return addressRepository.findOne(id);
	}

}
