package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.BookRepository;

@SpringBootApplication
public class SpringBootTestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestApplication.class, args);
	}

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		this.bookRepository.save(new Book("Introduction to Angular", 105.00));
		this.bookRepository.save(new Book("Introduction to Spring Boot", 85.00));
		this.bookRepository.save(new Book("Introduction to Typescript", 95.00));
		this.bookRepository.save(new Book("Introduction to Eclipse IDE", 75.00));
		this.bookRepository.save(new Book("Introduction to Angular", 105.00));
		this.bookRepository.save(new Book("Introduction to Spring Boot", 85.00));
		this.bookRepository.save(new Book("Introduction to Typescript", 95.00));
		this.bookRepository.save(new Book("Introduction to Eclipse IDE", 75.00));
		this.bookRepository.save(new Book("Introduction to Angular", 105.00));
		this.bookRepository.save(new Book("Introduction to Spring Boot", 85.00));
		this.bookRepository.save(new Book("Introduction to Typescript", 95.00));
		this.bookRepository.save(new Book("Introduction to Eclipse IDE", 75.00));
		this.bookRepository.save(new Book("Introduction to Angular", 105.00));
		this.bookRepository.save(new Book("Introduction to Spring Boot", 85.00));
		this.bookRepository.save(new Book("Introduction to Typescript", 95.00));
		this.bookRepository.save(new Book("Introduction to Eclipse IDE", 75.00));
		this.bookRepository.save(new Book("Introduction to Angular", 105.00));
		this.bookRepository.save(new Book("Introduction to Spring Boot", 85.00));
		this.bookRepository.save(new Book("Introduction to Typescript", 95.00));
		this.bookRepository.save(new Book("Introduction to Eclipse IDE", 75.00));
		this.bookRepository.save(new Book("Introduction to Angular", 105.00));
		this.bookRepository.save(new Book("Introduction to Spring Boot", 85.00));
		this.bookRepository.save(new Book("Introduction to Typescript", 95.00));
		this.bookRepository.save(new Book("Introduction to Eclipse IDE", 75.00));
		this.bookRepository.save(new Book("Introduction to Angular", 105.00));
		this.bookRepository.save(new Book("Introduction to Spring Boot", 85.00));
		this.bookRepository.save(new Book("Introduction to Typescript", 95.00));
		this.bookRepository.save(new Book("Introduction to Eclipse IDE", 75.00));
		this.bookRepository.save(new Book("Introduction to Angular", 105.00));
		this.bookRepository.save(new Book("Introduction to Spring Boot", 85.00));
		this.bookRepository.save(new Book("Introduction to Typescript", 95.00));
		this.bookRepository.save(new Book("Introduction to Eclipse IDE", 75.00));
	}
}
