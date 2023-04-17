package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Course;
import cogent.infotech.com.entity.Student;
import cogent.infotech.com.repository.StudentRepository;

@SpringBootApplication
public class OneToManyJpaApplication implements CommandLineRunner{

	@Autowired
	StudentRepository studentRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(OneToManyJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		Course c1 = new Course("Java programming","$1,200");
		Course c2 = new Course("Python programming","$1,200");
		Course c3 = new Course("C++ programming","$1,200");
		Student s1 = new Student("John");
		
		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		s1.getCourses().add(c3);
		System.out.println("Courses added");
		studentRepository.save(s1);
		System.out.println("Student and course information saved!!!");
	}
}
