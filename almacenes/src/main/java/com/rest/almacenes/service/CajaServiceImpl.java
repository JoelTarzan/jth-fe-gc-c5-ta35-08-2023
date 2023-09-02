package com.rest.almacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.almacenes.dao.ICajaDAO;
import com.rest.almacenes.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService {

	@Autowired
	ICajaDAO iCajaDAO;

	@Override
	public List<Caja> listarCajas() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Caja buscarCajaPorNumReferencia(String numReferencia) {
		
		return iCajaDAO.findById(numReferencia).get();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String numReferencia) {
		
		iCajaDAO.deleteById(numReferencia);
	}
}