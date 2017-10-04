package mum.edu.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.domain.User;
import mum.edu.repository.UserRepository;
import mum.edu.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;
	
	public User authUser(User u) {
		return userRepository.getUser(u);
	}
}
