package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cogent.infotech.com.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
