package com.rest.empleados.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.empleados.dto.Empleado;

public interface IEmpleadoDAO extends JpaRepository<Empleado, String> {

}