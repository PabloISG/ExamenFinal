package com.ista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@Document(collection = "Plato")
@Data
public class Plato {

	@Id
	private Long idPlato;
	private String nombrePlato;
	private String Descripcion;
	private double precio;
	
	
	public Long getIdPlato() {
		return idPlato;
	}
	public void setIdPlato(Long idPlato) {
		this.idPlato = idPlato;
	}
	public String getNombrePlato() {
		return nombrePlato;
	}
	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
