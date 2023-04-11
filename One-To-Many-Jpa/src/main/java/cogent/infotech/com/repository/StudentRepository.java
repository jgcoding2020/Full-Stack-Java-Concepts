package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.com.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
