package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion = new Validacion();
		
		validacion.validarMonto(100);
		validacion.validarMonto(1000);
		validacion.validarMonto(-100);

	}

}
