package br.com.dmb.myapi;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.dmb.myapi.domain.User;
import br.com.dmb.myapi.repositories.UserRepository;

@SpringBootApplication
public class MayapiApplication  implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MayapiApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "Teste1", "Teste.Login", "pass123");
		User user2 = new User(null, "Teste2", "Teste2.Login", "pass123");
		
		
		userRepository.saveAll(Arrays.asList(user1, user2));
		//System.out.println(user1.toString());
		//System.out.println(user2.toString());
	}

}