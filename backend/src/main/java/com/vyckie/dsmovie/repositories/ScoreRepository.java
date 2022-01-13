package com.vyckie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyckie.dsmovie.entities.Score;
import com.vyckie.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
