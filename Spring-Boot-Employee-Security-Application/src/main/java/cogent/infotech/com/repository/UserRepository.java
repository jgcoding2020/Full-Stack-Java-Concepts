package cogent.infotech.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cogent.infotech.com.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	User findByUserName(String username);

}
