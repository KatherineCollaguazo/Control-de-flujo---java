package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item1 = new Item();
		Item item2 = new Item();

		item1.setNombre("Arroz");
		item1.setProductosActuales(20);
		item2.setNombre("Cerveza");
		item2.setProductosActuales(100);

		System.out.println("------------Valores Iniciales 1-------------");
		item1.imprimir();

		System.out.println("------------VENDIDOS-------------");
		item1.vender(5);
		item1.imprimir();

		System.out.println("------------VENDIDOS-------------");
		item1.vender(8);
		item1.imprimir();

		System.out.println("------------DEVUELTOS-------------");
		item1.devolver(5);
		item1.imprimir();

		System.out.println("------------DEVUELTOS-------------");
		item1.devolver(3);
		item1.imprimir();

		System.out.println("------------Valores Iniciales 2-------------");
		item2.imprimir();

		System.out.println("------------VENDIDOS-------------");
		item2.vender(25);
		item2.imprimir();

		System.out.println("------------VENDIDOS-------------");
		item2.vender(15);
		item2.imprimir();

		System.out.println("------------DEVUELTOS-------------");
		item2.devolver(10);
		item2.imprimir();

		System.out.println("------------DEVUELTOS-------------");
		item2.devolver(3);
		item2.imprimir();

	}

}
