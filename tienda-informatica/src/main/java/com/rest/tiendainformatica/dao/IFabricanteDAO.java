package com.rest.tiendainformatica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.tiendainformatica.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Integer>{

}