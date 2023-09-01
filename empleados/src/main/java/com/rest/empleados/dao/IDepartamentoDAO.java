package com.rest.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.empleados.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Integer> {

}