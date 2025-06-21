package com.example.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.dto.MovieDto;
import com.example.movie.service.MovieService;
@CrossOrigin(origins = "*")
@RestController
public class MovieController {
	@Autowired()
	MovieService movieService;
	@PostMapping("/saveMovie")
	public MovieDto saveMovie(@RequestBody MovieDto movie) {
		 return movieService.saveMovie(movie);
	  }
	@DeleteMapping("/deleteMovie")
	  public MovieDto deleteMovieById(@RequestParam int id) {
		  return movieService.deleteMovieById(id);
		  
	  }
	 @GetMapping("/findMovieById")
	  public MovieDto findMovieById(@RequestParam int id) {
		  return movieService.findMovieById(id);
	  }
	 @GetMapping("/fetchAllMovies")
	  public List<MovieDto> fetchAllMovies(){
		  return movieService.fetchAllMovies();
	  }
	  @PutMapping("/updateMovie")
	  public MovieDto updateMovie(@RequestBody MovieDto movie,@RequestParam int oldId) {
		  return movieService.updateMovie(movie, oldId);
	  }
}
