package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Katherine");
		Estudiante estudiante2 = new Estudiante("Evelyn");

		estudiante1.calificar(7.99999999);
		estudiante2.calificar(8);

		System.out.println(estudiante1.getNombre() + " su nota es: " + estudiante1.getNota() + " y su calificacion es: "
				+ estudiante1.getResultado());
		System.out.println(estudiante2.getNombre() + " su nota es: " + estudiante2.getNota() + " y su calificacion es: "
				+ estudiante2.getResultado());

	}

}
