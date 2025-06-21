package com.example.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.dao.MovieDao;
import com.example.movie.dto.MovieDto;

@Service
public class MovieService {
  @Autowired
  MovieDao movieDao;
  public MovieDto saveMovie(MovieDto movie) {
	 return movieDao.saveMovie(movie);
  }
  public MovieDto deleteMovieById(int id) {
	  return movieDao.deleteMovieById(id);
	  
  }
  public MovieDto findMovieById(int id) {
	  return movieDao.findMovieById(id);
  }
  public List<MovieDto> fetchAllMovies(){
	  return movieDao.fetchAllMovies();
  }
  public MovieDto updateMovie(MovieDto movie,int oldId) {
	  return movieDao.updateMovie(movie, oldId);
  }
  
}
