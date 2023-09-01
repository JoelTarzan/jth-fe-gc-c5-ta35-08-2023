package com.rest.empleados.service;

import java.util.List;

import com.rest.empleados.dto.Departamento;

public interface IDepartamentoService {
	
	public List<Departamento> listarDepartamentos();

	public Departamento buscarDepartamentoPorCodigo(int codigo);

	public Departamento guardarDepartamento(Departamento departamento);

	public Departamento actualizarDepartamento(Departamento departamento);

	public void eliminarDepartamento(int codigo);
}