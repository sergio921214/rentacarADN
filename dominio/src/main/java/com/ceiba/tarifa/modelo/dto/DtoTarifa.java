package com.ceiba.tarifa.modelo.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;




@Getter
@AllArgsConstructor
public class DtoTarifa {
	private Long id;
	private String tipoCombustible;
	private Double tarifa;
	private BigDecimal precioFinSemana;
}