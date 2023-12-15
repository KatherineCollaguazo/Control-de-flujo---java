package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto pro1 = new Producto("aceite", 0);
		Producto pro2 = new Producto("jarabe", 0);

		pro1.setPrecio(50);
		pro2.setPrecio(-45);

		System.out.println(pro1.getNombre() + " tiene un costo de: " + pro1.getPrecio()
				+ " pero con el 50% de descuento solo pagaría: " + pro1.calcularPrecioPromo(50));
		System.out.println(pro2.getNombre() + " tiene un costo de: " + pro2.getPrecio()
				+ " pero con el 25% de descuento solo pagaría: " + pro2.calcularPrecioPromo(25));
	}

}
