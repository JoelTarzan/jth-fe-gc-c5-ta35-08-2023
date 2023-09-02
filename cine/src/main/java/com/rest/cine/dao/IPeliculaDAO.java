package com.rest.cine.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.cine.dto.Pelicula;

public interface IPeliculaDAO extends JpaRepository<Pelicula, Integer>{

}