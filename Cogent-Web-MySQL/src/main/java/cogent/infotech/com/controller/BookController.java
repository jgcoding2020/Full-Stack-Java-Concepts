package cogent.infotech.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	BookService bookService;
	
	@GetMapping("/book")
	public List<Book> readBooks(){
		List<Book> books = bookService.readBooks();
		System.out.println("Books read" + books.size());
		return books;
	}
	
	@GetMapping("/book/{id}")
	public Book readBook(@PathVariable("id") Integer id) {
		Optional<Book> b = bookService.readBook(id);
		return b.get();
	}
	
	@PostMapping("/book")
	public Book addBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
	@PutMapping("/book")
	public Book editBook(@RequestBody Book book) {
		return bookService.updateBook(book);	
	}
	
	@DeleteMapping("/book")
	public String deleteBook(@RequestParam(value="bookId")Integer id) {
		Optional<Book> b = bookService.readBook(id);
		bookService.deleteBook(b.get());
		return "Book Id " + id + "was deleted";
	}
}
