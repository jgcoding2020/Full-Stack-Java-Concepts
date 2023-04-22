package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Person;
import cogent.infotech.com.repository.PersonRepository;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;
	
	@PostMapping("/person/post")
	public Person addPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@GetMapping("/person/get")
	public List<Person> getPeople(){
		return this.personRepository.findAll();
	}
	
	@PutMapping("/person/put")
	public Person editPerson(@RequestBody Person person) {
		return personRepository.save(person);	
	}
	
	@DeleteMapping("/person/delete/{id}")
	public void deletePerson(@PathVariable("id") long personId) {
		personRepository.deleteById(personId);
	}
}
