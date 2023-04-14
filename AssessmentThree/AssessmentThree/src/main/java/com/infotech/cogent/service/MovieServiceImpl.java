package com.infotech.cogent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.cogent.entity.Movie;
import com.infotech.cogent.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService{

	@Autowired
	MovieRepository movieRepository;
	
	@Override
	public Movie updateMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public Optional<Movie> readMovie(Long id) {
		return movieRepository.findById(id);
	}

	@Override
	public List<Movie> readMovies() {
		return (List<Movie>)movieRepository.findAll();
	}

	@Override
	public void deleteMovie(Movie movie) {
		movieRepository.delete(movie);	
	}

}
