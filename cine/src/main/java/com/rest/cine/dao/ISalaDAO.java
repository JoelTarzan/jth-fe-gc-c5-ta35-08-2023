package com.rest.cine.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.cine.dto.Sala;

public interface ISalaDAO extends JpaRepository<Sala, Integer>{

}