package com.example.movie.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class MovieDto {
	@Id
	@GeneratedValue
	private int movieId;
	private String movieName;
	private String posterUrl;
	private String movieMood;
	private String movieDescription;
	private String movieDialogue;
	public String getMovieDialogue() {
		return movieDialogue;
	}
	public void setMovieDialogue(String movieDialogue) {
		this.movieDialogue = movieDialogue;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getPosterUrl() {
		return posterUrl;
	}
	public void setPosterUrl(String posterUrl) {
		this.posterUrl = posterUrl;
	}
	public String getMovieMood() {
		return movieMood;
	}
	public void setMovieMood(String movieMood) {
		this.movieMood = movieMood;
	}
	public String getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}
	
   
}
