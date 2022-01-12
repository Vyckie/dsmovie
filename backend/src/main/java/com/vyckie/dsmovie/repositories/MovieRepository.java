package com.vyckie.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vyckie.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
