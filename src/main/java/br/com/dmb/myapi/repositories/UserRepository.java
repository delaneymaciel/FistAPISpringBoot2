package br.com.dmb.myapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dmb.myapi.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
