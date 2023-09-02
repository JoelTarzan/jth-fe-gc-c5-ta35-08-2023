package com.rest.cine.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "peliculas")
public class Pelicula {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "calificacion_edad", nullable = true)
	private Integer calificacionEdad;
	
	@OneToMany(mappedBy = "pelicula", fetch = FetchType.LAZY)
	private List<Sala> salas;
	
	// Constructores
	public Pelicula() {
		
	}

	public Pelicula(int codigo, String nombre, Integer calificacionEdad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.calificacionEdad = calificacionEdad;
	}

	// Métodos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCalificacionEdad() {
		return calificacionEdad;
	}

	public void setCalificacionEdad(Integer calificacionEdad) {
		this.calificacionEdad = calificacionEdad;
	}

	@JsonIgnore
	public List<Sala> getSalas() {
		return salas;
	}

	public void setSalas(List<Sala> salas) {
		this.salas = salas;
	}

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacionEdad=" + calificacionEdad + "]";
	}
}