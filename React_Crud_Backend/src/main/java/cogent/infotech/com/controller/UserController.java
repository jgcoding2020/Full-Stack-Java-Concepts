package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.UserRepository;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/getallusers")
	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		userRepository.deleteById(id);
	}
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User newUser = userRepository.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {
		user.setId(id);
		return userRepository.save(user);
	}
	
	//
//	@GetMapping("/{id}")
//	public User readbyId(@PathVariable int id) {
//		return userRepository.findById(id).get();
//	}
//
}
