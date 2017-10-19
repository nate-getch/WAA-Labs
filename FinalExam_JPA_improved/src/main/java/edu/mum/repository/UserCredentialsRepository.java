package edu.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.domain.UserCredentials;

@Repository
public interface UserCredentialsRepository extends CrudRepository<UserCredentials,String> {
  
	public UserCredentials findByUsername(String username);
}
