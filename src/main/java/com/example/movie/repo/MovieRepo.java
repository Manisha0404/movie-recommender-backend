package com.example.movie.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.movie.dto.MovieDto;


public interface MovieRepo extends JpaRepository< MovieDto , Integer> {

	
}
