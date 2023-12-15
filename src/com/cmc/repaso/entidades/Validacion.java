package com.cmc.repaso.entidades;

public class Validacion {
	public void validarMonto(double monto) {
		if (monto > 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
