package com.infotech.cogent.service;

import java.util.List;
import java.util.Optional;

import com.infotech.cogent.entity.Movie;

public interface MovieService {

	public Movie updateMovie(Movie movie);
	public Optional<Movie> readMovie(Long id);
	public List<Movie> readMovies();
	public void deleteMovie(Movie movie);
}
