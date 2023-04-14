package com.infotech.cogent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infotech.cogent.entity.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
