package com.infotech.cogent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infotech.cogent.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
