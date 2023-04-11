package cogent.infotech.com;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.Employee;
import cogent.infotech.com.entity.Passport;
import cogent.infotech.com.repository.EmployeeRepository;

@SpringBootApplication
public class OneToOneJpaApplication implements CommandLineRunner{

	@Autowired
	EmployeeRepository empRepo;
	public static void main(String[] args){
		SpringApplication.run(OneToOneJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setName("Josh");
		employee.setEmail("super@gmail.com");
		
		Passport passport = new Passport();
		passport.setExpiry("01/2030");
		passport.setAddress("FL");
		
		employee.setPassport(passport);
		
		empRepo.save(employee);
		System.out.println("Information saved!!!!");
	}
}
