package com.packt.webstore.serviceImpl;

import java.util.List;

import javax.transaction.Transactional;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packt.webstore.domain.Address;
import com.packt.webstore.domain.Employee;
import com.packt.webstore.repository.AddressRepository;
import com.packt.webstore.service.AddressService;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {
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
	public Address findOne(Long id) {
		return addressRepository.findOne(id);
	}

}
