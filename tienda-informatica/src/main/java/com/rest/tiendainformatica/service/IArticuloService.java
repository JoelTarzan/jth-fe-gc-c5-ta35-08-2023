package com.rest.tiendainformatica.service;

import java.util.List;

import com.rest.tiendainformatica.dto.Articulo;

public interface IArticuloService {

	public List<Articulo> listarArticulos();

	public Articulo buscarArticuloPorCodigo(int codigo);

	public Articulo guardarArticulo(Articulo articulo);

	public Articulo actualizarArticulo(Articulo articulo);

	public void eliminarArticulo(int codigo);
}