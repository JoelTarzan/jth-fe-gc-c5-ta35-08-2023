package com.rest.empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.empleados.dto.Empleado;
import com.rest.empleados.service.EmpleadoServiceImpl;

@RestController
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;

	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados() {

		return empleadoServiceImpl.listarEmpleados();
	}

	@GetMapping("/empleados/{dni}")
	public Empleado buscarEmpleadoPorDni(@PathVariable(name = "dni") String dni) {

		return empleadoServiceImpl.buscarEmpleadoPorDni(dni);
	}

	@PostMapping("/empleados")
	public Empleado guardarEmpleado(@RequestBody Empleado empleado) {

		return empleadoServiceImpl.guardarEmpleado(empleado);
	}

	@PutMapping("/empleados/{dni}")
	public Empleado actualizarEmpleado(@PathVariable(name = "dni") String dni, @RequestBody Empleado empleado) {

		Empleado empleadoSeleccionado = new Empleado();
		Empleado empleadoActualizado = new Empleado();

		empleadoSeleccionado = empleadoServiceImpl.buscarEmpleadoPorDni(dni);

		empleadoSeleccionado.setNombre(empleado.getNombre());
		empleadoSeleccionado.setApellidos(empleado.getApellidos());
		empleadoSeleccionado.setDepartamento(empleado.getDepartamento());

		empleadoActualizado = empleadoServiceImpl.actualizarEmpleado(empleadoSeleccionado);

		return empleadoActualizado;
	}

	@DeleteMapping("/empleados/{dni}")
	public void eliminarEmpleado(@PathVariable(name = "dni") String dni) {

		empleadoServiceImpl.eliminarEmpleado(dni);
	}
}