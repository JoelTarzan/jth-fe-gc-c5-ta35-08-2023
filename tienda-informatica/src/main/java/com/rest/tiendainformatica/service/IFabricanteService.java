package com.rest.tiendainformatica.service;

import java.util.List;

import com.rest.tiendainformatica.dto.Fabricante;

public interface IFabricanteService {

	public List<Fabricante> listarFabricantes();
	
	public Fabricante buscarFabricantePorCodigo(int codigo);
	
	public Fabricante guardarFabricante(Fabricante fabricante);
	
	public Fabricante actualizarFabricante(Fabricante fabricante);
	
	public void eliminarFabricante(int codigo);
}