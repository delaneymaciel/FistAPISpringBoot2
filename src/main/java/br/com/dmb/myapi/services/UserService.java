package br.com.dmb.myapi.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dmb.myapi.domain.User;
import br.com.dmb.myapi.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElse(null);
	}
}
