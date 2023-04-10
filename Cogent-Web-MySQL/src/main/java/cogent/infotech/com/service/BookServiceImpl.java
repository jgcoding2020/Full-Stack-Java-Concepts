package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cogent.infotech.com.entity.Book;
import cogent.infotech.com.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public List<Book> readBooks() {
		return (List<Book>)bookRepository.findAll();
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBook(Book book) {
		bookRepository.delete(book);
	}

	@Override
	public Optional<Book> readBook(int id) {
		return bookRepository.findById(id);
	}

}
