package cogent.infotech.com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
