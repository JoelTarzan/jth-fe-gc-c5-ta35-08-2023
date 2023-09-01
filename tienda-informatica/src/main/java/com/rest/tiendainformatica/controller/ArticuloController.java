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

import com.rest.tiendainformatica.dto.Articulo;
import com.rest.tiendainformatica.service.ArticuloServiceImpl;

@RestController
public class ArticuloController {

	@Autowired
	ArticuloServiceImpl articuloServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos() {
		
		return articuloServiceImpl.listarArticulos();
	}
	
	@GetMapping("/articulos/{codigo}")
	public Articulo buscarArticuloPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return articuloServiceImpl.buscarArticuloPorCodigo(codigo);
	}
	
	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		
		return articuloServiceImpl.guardarArticulo(articulo);
	}
	
	@PutMapping("/articulos/{codigo}")
	public Articulo actualizarArticulo(@PathVariable(name = "codigo") int codigo, @RequestBody Articulo articulo) {
		
		Articulo articuloSeleccionado = new Articulo();
		Articulo articuloActualizado = new Articulo();
		
		articuloSeleccionado = articuloServiceImpl.buscarArticuloPorCodigo(codigo);
		
		articuloSeleccionado.setNombre(articulo.getNombre());
		
		articuloActualizado = articuloServiceImpl.actualizarArticulo(articuloSeleccionado);
		
		return articuloActualizado;
	}
	
	@DeleteMapping("/articulos/{codigo}")
	public void eliminarArticulo(@PathVariable(name = "codigo") int codigo) {
		
		articuloServiceImpl.eliminarArticulo(codigo);
	}
}