package com.rest.tiendainformatica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.tiendainformatica.dao.IArticuloDAO;
import com.rest.tiendainformatica.dto.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService {

	@Autowired
	IArticuloDAO iArticuloDAO;

	@Override
	public List<Articulo> listarArticulos() {
		
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo buscarArticuloPorCodigo(int codigo) {
		
		return iArticuloDAO.findById(codigo).get();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(int codigo) {
		
		iArticuloDAO.deleteById(codigo);
	}
}