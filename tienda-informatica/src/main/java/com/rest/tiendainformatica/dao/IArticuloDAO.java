package com.rest.tiendainformatica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.tiendainformatica.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Integer>{

}