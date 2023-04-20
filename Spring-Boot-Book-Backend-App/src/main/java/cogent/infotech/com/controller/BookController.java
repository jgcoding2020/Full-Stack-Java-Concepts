package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.BookRepository;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api")
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		return this.bookRepository.findAll();
	}
}
