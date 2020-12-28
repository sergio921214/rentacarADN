package com.ceiba.auto.modelo.entidad;
import lombok.Getter;
import static com.ceiba.dominio.ValidadorArgumento.validarLongitudIgual;
import static com.ceiba.dominio.ValidadorArgumento.validarObligatorio;
import static com.ceiba.dominio.ValidadorArgumento.validarCantidadDigitosCadena;


@Getter
public class Auto {
	
    private static final String SE_DEBE_INGRESAR_LA_PLACA = "Se debe ingresar la placa del Auto";
    private static final String SE_DEBE_INGRESAR_EL_TIPO_COMBUSTIBLE = "Se debe ingresar el tipo de combustible";
    private static final String LA_PLACA_DEBE_TENER_UNA_LONGITUD_IGUAL_A = "La placa debe tener una longitud igual a %s";
    private static final String LA_PLACA_DEBE_TENER_TRES_DIGITOS = "La placa debe tener tres digitos";
    
    private static final int LONGITUD_PLACA = 6;
    private static final int CANTIDAD_DIGITOS_PLACA = 3;
    
    private Long id;
    private String placa;
    private String tipoCombustible;
    private Boolean rentado;

	public Auto(Long id, String placa, String tipoCombustible, Boolean rentado) {
		
		validarObligatorio(placa, SE_DEBE_INGRESAR_LA_PLACA);
		validarObligatorio(tipoCombustible, SE_DEBE_INGRESAR_EL_TIPO_COMBUSTIBLE);
		validarLongitudIgual(placa, LONGITUD_PLACA, LA_PLACA_DEBE_TENER_UNA_LONGITUD_IGUAL_A);
		validarCantidadDigitosCadena(placa, CANTIDAD_DIGITOS_PLACA, LA_PLACA_DEBE_TENER_TRES_DIGITOS);
		
		this.id = id;
		this.placa = placa;
		this.tipoCombustible = tipoCombustible;
		this.rentado = rentado;
	}

}









