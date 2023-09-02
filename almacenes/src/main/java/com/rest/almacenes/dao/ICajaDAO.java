package com.rest.almacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.almacenes.dto.Caja;

public interface ICajaDAO extends JpaRepository<Caja, String> {

}