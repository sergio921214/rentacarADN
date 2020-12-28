package com.ceiba.tarifa.modelo.entidad;

import java.math.BigDecimal;


import lombok.Getter;

@Getter
public class Tarifa {

	private Long id;
	private String tipoCombustible;
	private Double tarifa;
	private BigDecimal precioFinSemana;
	
	public Tarifa(Long id, String tipoCombustible, Double tarifa, BigDecimal precioFinSemana) {
		super();
		this.id = id;
		this.tipoCombustible = tipoCombustible;
		this.tarifa = tarifa;
		this.precioFinSemana = precioFinSemana;
	}
	
	
}
