package com.nekadar.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.nekadar.app.entities.User;
import com.nekadar.app.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	@SuppressWarnings("deprecation")
	public Object getAllUser(int page) {
		return userRepository.findAll(new PageRequest(page, 10));
	}

	public void saveUser(User user) {
		userRepository.save(user);
	}

	public void deleteUser(User user) {
		userRepository.delete(user);
		
	}

	public Optional<User> findOneRecord(Long id) {
		return userRepository.findById(id);
		
	}

}
