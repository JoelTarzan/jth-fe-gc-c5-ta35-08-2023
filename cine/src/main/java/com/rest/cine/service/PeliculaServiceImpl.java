package com.rest.cine.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.cine.dao.IPeliculaDAO;
import com.rest.cine.dto.Pelicula;

@Service
public class PeliculaServiceImpl implements IPeliculaService {

	@Autowired
	IPeliculaDAO iPeliculaDAO;

	@Override
	public List<Pelicula> listarPeliculas() {
		
		return iPeliculaDAO.findAll();
	}

	@Override
	public Pelicula buscarPeliculaPorCodigo(int codigo) {
		
		return iPeliculaDAO.findById(codigo).get();
	}

	@Override
	public Pelicula guardarPelicula(Pelicula pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public Pelicula actualizarPelicula(Pelicula pelicula) {
		
		return iPeliculaDAO.save(pelicula);
	}

	@Override
	public void eliminarPelicula(int codigo) {
		
		iPeliculaDAO.deleteById(codigo);
	}
}