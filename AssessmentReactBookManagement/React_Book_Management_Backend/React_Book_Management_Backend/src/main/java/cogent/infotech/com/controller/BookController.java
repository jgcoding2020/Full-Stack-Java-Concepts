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

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.BookRepository;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/api/book")
public class BookController {

	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping("/all")
	public List<Book> getBooks(){
		return this.bookRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		bookRepo.deleteById(id);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Book> addBook(@RequestBody Book book) {
		Book newBook = bookRepo.save(book);
		return ResponseEntity.status(HttpStatus.CREATED).body(newBook);
	}

	@PutMapping("/{id}")
	public Book updateBook(@PathVariable int id, @RequestBody Book book) {
		book.setId(id);
		return bookRepo.save(book);
	}
}
