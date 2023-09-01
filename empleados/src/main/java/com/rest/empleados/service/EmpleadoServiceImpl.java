package com.rest.empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.empleados.dao.IEmpleadoDAO;
import com.rest.empleados.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService {

	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	@Override
	public List<Empleado> listarEmpleados() {
		
		return iEmpleadoDAO.findAll();
	}

	@Override
	public Empleado buscarEmpleadoPorDni(String dni) {
		
		return iEmpleadoDAO.findById(dni).get();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}

	@Override
	public void eliminarEmpleado(String dni) {
		
		iEmpleadoDAO.deleteById(dni);
	}
}