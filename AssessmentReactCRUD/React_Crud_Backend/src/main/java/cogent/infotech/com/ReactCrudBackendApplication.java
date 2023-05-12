package cogent.infotech.com;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cogent.infotech.com.entity.User;
import cogent.infotech.com.repository.UserRepository;

@SpringBootApplication
public class ReactCrudBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactCrudBackendApplication.class, args);
		
	}
}
