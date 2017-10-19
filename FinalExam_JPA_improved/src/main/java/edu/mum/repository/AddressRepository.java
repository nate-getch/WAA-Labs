package edu.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.domain.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Integer> {
	public Address findOne(int empId);
}
