package com.devsuperior.dsmovieprof.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovieprof.entities.Score;
import com.devsuperior.dsmovieprof.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
