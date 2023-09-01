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

import com.rest.empleados.dto.Departamento;
import com.rest.empleados.service.DepartamentoServiceImpl;

@RestController
public class DepartamentoController {

	@Autowired
	DepartamentoServiceImpl departamentoServiceImpl;
	
	@GetMapping("/departamentos")
	public List<Departamento> listarDepartamentos() {
		
		return departamentoServiceImpl.listarDepartamentos();
	}
	
	@GetMapping("/departamentos/{codigo}")
	public Departamento buscarDepartamentoPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return departamentoServiceImpl.buscarDepartamentoPorCodigo(codigo);
	}
	
	@PostMapping("/departamentos")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		
		return departamentoServiceImpl.guardarDepartamento(departamento);
	}
	
	@PutMapping("/departamentos/{codigo}")
	public Departamento actualizarDepartamento(@PathVariable(name = "codigo") int codigo, @RequestBody Departamento departamento) {
		
		Departamento departamentoSeleccionado = new Departamento();
		Departamento departamentoActualizado = new Departamento();
		
		departamentoSeleccionado = departamentoServiceImpl.buscarDepartamentoPorCodigo(codigo);
		
		departamentoSeleccionado.setNombre(departamento.getNombre());
		departamentoSeleccionado.setPresupuesto(departamento.getPresupuesto());
		
		departamentoActualizado = departamentoServiceImpl.actualizarDepartamento(departamentoSeleccionado);
		
		return departamentoActualizado;
	}
	
	@DeleteMapping("/departamentos/{codigo}")
	public void eliminarDepartamento(@PathVariable(name = "codigo") int codigo) {
		
		departamentoServiceImpl.eliminarDepartamento(codigo);
	}
}