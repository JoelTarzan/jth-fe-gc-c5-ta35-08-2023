package com.rest.cine.service;

import java.util.List;

import com.rest.cine.dto.Pelicula;

public interface IPeliculaService {

	public List<Pelicula> listarPeliculas();

	public Pelicula buscarPeliculaPorCodigo(int codigo);

	public Pelicula guardarPelicula(Pelicula pelicula);

	public Pelicula actualizarPelicula(Pelicula pelicula);

	public void eliminarPelicula(int codigo);
}