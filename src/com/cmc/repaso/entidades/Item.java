package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("Producto: " + nombre + ", productos actuales: " + productosActuales
				+ ", productos devueltos: " + productosDevueltos + ", productos vendidos: " + productosVendidos);
	}

	public void vender(int productosVendidos) {
		int totalProductosActuales = this.productosActuales - productosVendidos;
		int totalProductosVendidos = this.productosVendidos + productosVendidos;
		this.productosActuales = totalProductosActuales;
		this.productosVendidos = totalProductosVendidos;
	}

	public void devolver(int productosVendidos) {
		int totalProductosActuales = this.productosActuales + productosVendidos;
		int totalProductosVendidos = this.productosVendidos - productosVendidos;
		int totalProductosDevueltos = this.productosDevueltos + productosVendidos;

		this.productosActuales = totalProductosActuales;
		this.productosVendidos = totalProductosVendidos;
		this.productosDevueltos = totalProductosDevueltos;
	}

}
