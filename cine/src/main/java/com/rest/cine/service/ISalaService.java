package com.rest.cine.service;

import java.util.List;

import com.rest.cine.dto.Sala;

public interface ISalaService {

	public List<Sala> listarSalas();

	public Sala buscarSalaPorCodigo(int codigo);

	public Sala guardarSala(Sala sala);

	public Sala actualizarSala(Sala sala);

	public void eliminarSala(int codigo);
}