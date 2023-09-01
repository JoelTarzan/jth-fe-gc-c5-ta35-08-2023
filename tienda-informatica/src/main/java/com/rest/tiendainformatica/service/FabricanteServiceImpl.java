package com.rest.tiendainformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.tiendainformatica.dao.IFabricanteDAO;
import com.rest.tiendainformatica.dto.Fabricante;

@Service
public class FabricanteServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;

	@Override
	public List<Fabricante> listarFabricantes() {
		
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante buscarFabricantePorCodigo(int codigo) {
		
		return iFabricanteDAO.findById(codigo).get();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(int codigo) {
		
		iFabricanteDAO.deleteById(codigo);
	}
}