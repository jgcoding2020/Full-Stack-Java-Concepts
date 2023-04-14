package com.infotech.cogent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infotech.cogent.entity.User;
import com.infotech.cogent.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/users/{id}")
	public User readUser(@PathVariable("id") Long id) {
		Optional<User> u = userService.readUser(id);
		return u.get();
	}
	
	@GetMapping("/users")
	public List<User> readUsers(){
		List<User> users = userService.readUsers();
		System.out.println("Users read" + users.size());
		return users;
	}
}
