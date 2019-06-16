package com.techm.microservices.springbootmongodb.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techm.microservices.springbootmongodb.document.Users;
import com.techm.microservices.springbootmongodb.repository.UserRepository;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {
	
	private UserRepository userRepository;

	public UsersResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@GetMapping("/all")
	public List<Users> getAll() {
		return userRepository.findAll();
	}

}
