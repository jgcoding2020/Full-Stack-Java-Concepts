package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@PostMapping("/add/person")
	public Person addPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@GetMapping("/people")
	public List<Person> getPeople(){
		return this.personRepository.findAll();
	}
	
	@PutMapping("/edit/person")
	public Person editBook(@RequestBody Person person) {
		return personRepository.save(person);	
	}
	
	@DeleteMapping("/delete/person")
	public void deletePerson(Person person) {
		personRepository.delete(person);
	}
}
