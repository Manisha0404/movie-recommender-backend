package com.example.movie.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.movie.dto.MovieDto;
import com.example.movie.repo.MovieRepo;
@Repository
public class MovieDao {
	@Autowired
	MovieRepo movieRepo;
	 public MovieDto saveMovie(MovieDto movie) {
		 return movieRepo.save(movie);
	 }
	 public MovieDto findMovieById(int id) {
		Optional<MovieDto> dbMovie=movieRepo.findById(id);
		if(dbMovie.isPresent()) {
			return dbMovie.get();
		}
		return null;
	 }
	 public List<MovieDto> fetchAllMovies() {
		 return movieRepo.findAll();
	 }
    public MovieDto updateMovie(MovieDto newMovie,int oldMovieId) {
    	newMovie.setMovieId(oldMovieId);
    	return movieRepo.save(newMovie);
    	
    }
    public MovieDto deleteMovieById(int id) {
    	MovieDto movie=findMovieById(id);
    	movieRepo.delete(movie);
    	return movie;
    }
}
