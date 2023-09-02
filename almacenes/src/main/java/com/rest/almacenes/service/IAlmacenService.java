package com.rest.almacenes.service;

import java.util.List;

import com.rest.almacenes.dto.Almacen;

public interface IAlmacenService {

	public List<Almacen> listarAlmacenes();
	
	public Almacen buscarAlmacenPorCodigo(int codigo);

	public Almacen guardarAlmacen(Almacen almacen);

	public Almacen actualizarAlmacen(Almacen almacen);

	public void eliminarAlmacen(int codigo);
}