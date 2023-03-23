package com.ista.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@Document(collection = "Carta")
@Data
public class Carta {

	@Id
	private Long idCarta;
	private String nombre;
	private String categoria;
	private int cantidad;
	
	
	public Long getIdCarta() {
		return idCarta;
	}
	public void setIdCarta(Long idCarta) {
		this.idCarta = idCarta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
