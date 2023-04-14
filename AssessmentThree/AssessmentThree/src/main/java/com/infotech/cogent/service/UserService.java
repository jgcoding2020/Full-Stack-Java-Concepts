package com.infotech.cogent.service;

import java.util.List;
import java.util.Optional;

import com.infotech.cogent.entity.User;

public interface UserService {

	User updateUser(User user);
	Optional<User> readUser(Long id);
	List<User> readUsers();
}
