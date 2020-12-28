package com.ceiba.rentarauto.modelo.entidad;
import lombok.Getter;
import static com.ceiba.dominio.ValidadorArgumento.validarDomingo;



import java.time.LocalDate;




@Getter
public class RentarAuto {
	
    private static final String NO_SE_PUEDE_RENTAR_AUTO_UN_DOMINGO = "No se puede rentar auto un domingo";

    
    private Long id;
    private String placa;
    private LocalDate fechaRenta;
    private LocalDate fechaEntrega;
    private Double precio;
    
	public RentarAuto(Long id, String placa, LocalDate fechaRenta, LocalDate fechaEntrega, Double precio) {
		
		validarDomingo(fechaRenta, NO_SE_PUEDE_RENTAR_AUTO_UN_DOMINGO);
		
		this.id = id;
		this.placa = placa;
		this.fechaRenta = fechaRenta;
		this.fechaEntrega = fechaEntrega;
		this.precio = precio;
	}


}