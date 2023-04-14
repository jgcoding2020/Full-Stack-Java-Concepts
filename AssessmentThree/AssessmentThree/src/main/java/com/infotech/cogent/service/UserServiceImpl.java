package com.infotech.cogent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.cogent.entity.User;
import com.infotech.cogent.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<User> readUser(Long id) {
		return userRepository.findById(id);
	}
	
	@Override
	public List<User> readUsers() {
		return (List<User>)userRepository.findAll();
	}
}
