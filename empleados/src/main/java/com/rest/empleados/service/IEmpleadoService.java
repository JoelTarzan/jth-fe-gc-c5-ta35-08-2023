package com.rest.empleados.service;

import java.util.List;

import com.rest.empleados.dto.Empleado;

public interface IEmpleadoService {

	public List<Empleado> listarEmpleados();

	public Empleado buscarEmpleadoPorDni(String dni);

	public Empleado guardarEmpleado(Empleado empleado);

	public Empleado actualizarEmpleado(Empleado empleado);

	public void eliminarEmpleado(String dni);
}