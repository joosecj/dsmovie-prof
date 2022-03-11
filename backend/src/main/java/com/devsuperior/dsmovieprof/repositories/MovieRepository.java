package com.devsuperior.dsmovieprof.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovieprof.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
}
