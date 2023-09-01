package com.rest.tiendainformatica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.tiendainformatica.dto.Fabricante;
import com.rest.tiendainformatica.service.FabricanteServiceImpl;

@RestController
public class FabricanteController {

	@Autowired
	FabricanteServiceImpl fabricanteServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricante> listarFabricantes() {
		
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	@GetMapping("/fabricantes/{codigo}")
	public Fabricante buscarFabricantePorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return fabricanteServiceImpl.buscarFabricantePorCodigo(codigo);
	}
	
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	@PutMapping("/fabricantes/{codigo}")
	public Fabricante actualizarFabricante(@PathVariable(name = "codigo") int codigo, @RequestBody Fabricante fabricante) {
		
		Fabricante fabricanteSeleccionado = new Fabricante();
		Fabricante fabricanteActualizado = new Fabricante();
		
		fabricanteSeleccionado = fabricanteServiceImpl.buscarFabricantePorCodigo(codigo);
		
		fabricanteSeleccionado.setNombre(fabricante.getNombre());
		
		fabricanteActualizado = fabricanteServiceImpl.actualizarFabricante(fabricanteSeleccionado);
		
		return fabricanteActualizado;
	}
	
	@DeleteMapping("/fabricantes/{codigo}")
	public void eliminarFabricante(@PathVariable(name = "codigo") int codigo) {
		
		fabricanteServiceImpl.eliminarFabricante(codigo);
	}
}