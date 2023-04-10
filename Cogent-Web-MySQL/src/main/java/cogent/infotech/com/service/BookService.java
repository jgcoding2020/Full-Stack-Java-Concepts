package cogent.infotech.com.service;

import java.util.List;
import java.util.Optional;

import cogent.infotech.com.entity.Book;

public interface BookService {

	public Book updateBook(Book book);
	public Optional<Book> readBook(int id);
	public List<Book> readBooks();
	public void deleteBook(Book book);
}
