package com.rest.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.almacenes.dto.Almacen;

public interface IAlmacenDAO extends JpaRepository<Almacen, Integer> {

}