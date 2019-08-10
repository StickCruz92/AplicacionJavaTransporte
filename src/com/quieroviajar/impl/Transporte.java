/**
 * 
 */
package com.quieroviajar.impl;

/**
 * @author stick
 *
 */
public abstract class Transporte {

	private String marca;
	private String placa;
	private String origen;
	private String destino;
	private int numeroPasajeros;
	private double precio;
	private boolean used;

	public Transporte() {
	}

	public Transporte(String marca, String placa, String origen, String destino, int numeroPasajeros, double precio) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.origen = origen;
		this.destino = destino;
		this.numeroPasajeros = numeroPasajeros;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String isUsed() {
		String transporteUsado = "";
		if (used == true) {
			transporteUsado = "Sí";
		} else {
			transporteUsado = "No";
		}
		return transporteUsado;
	}

	public void setUsed(boolean used) {
		this.used = used;
	}

	public boolean getIsUsed() {
		return used;
	}
	
	public abstract void Used();

}
