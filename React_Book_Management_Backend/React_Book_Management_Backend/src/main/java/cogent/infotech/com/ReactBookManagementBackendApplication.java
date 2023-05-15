package cogent.infotech.com;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.BookRepository;

@SpringBootApplication
public class ReactBookManagementBackendApplication {

	@Autowired
	private BookRepository bookRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(ReactBookManagementBackendApplication.class, args);
	}

	@PostConstruct
	public void initBooks (){
		List<Book> initBooks = new ArrayList<>();
		initBooks.add(new Book("Intro to Programming in C", 119.99));
		initBooks.add(new Book("Intro to Programming in C++", 139.99));
		initBooks.add(new Book("Intro to Programming in Java", 149.99));
		initBooks.add(new Book("Intro to React JS", 199.99));
		initBooks.add(new Book("Intro to Angular CLI", 225.99));
		bookRepo.saveAll(initBooks);
	}
}
