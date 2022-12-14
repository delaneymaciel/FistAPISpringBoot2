package br.com.dmb.myapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.dmb.myapi.domain.User;
import br.com.dmb.myapi.repositories.UserRepository;
import br.com.dmb.myapi.services.exceptions.ObjectNotFoundException;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public User findById(Integer id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado. Id: " + id + ", Tipo: " + User.class.getName()));
	}

	public List<User> findAll() {
		return repository.findAll();
	}

	public User update(Integer id, User obj) {
		User newObj = findById(id);
		newObj.setName(obj.getName());
		newObj.setLogin(obj.getLogin());
		newObj.setPassword(obj.getPassword());
		return repository.save(newObj);
	}

	public void delete(Integer id) {
		findById(id);
		repository.deleteById(id);
	}
}
