package mum.edu.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mum.edu.domain.User;
import mum.edu.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	private List<User> users;

	public UserRepositoryImpl() {
		users = new ArrayList<User>();
		User u1 = new User("nat", "123");
		User u2 = new User("bek", "123");
		User u3 = new User("abe", "123");
		users.add(u1);
		users.add(u2);
		users.add(u3);
	}

	@Override
	public User getUser(User newUser) {

		for (User u : users) {
			//System.out.println(u.getName() +  " === " + newUser.getName() );
			//System.out.println(u.getPassword() +  " === " + newUser.getPassword() );
			if (newUser.getName().equals(u.getName()) && newUser.getPassword().equals(u.getPassword())) {
				return u;
			}
		}
		return null;

	}
}
