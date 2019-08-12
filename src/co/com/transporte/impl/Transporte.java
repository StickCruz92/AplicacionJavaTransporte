/**
 * 
 */
package co.com.transporte.impl;

/**
 * <h1>Transporte</h1>
 * Transporte es una clase padre abstracta
 * <P>
 * Esta clase esta un clase la clase base, como es abstractor
 * no puede crease instancia. Contiene un  metodo abstractor.
 * {@code used()} que es obligatorio implementarlo para todo aquel que pertenezca que heredan este clase padre Transporte.
 * 
 * @author stick
 * @version 1.1
 * @since 2019
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
	
	public Transporte(int numeroPasajeros, double precio) {
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
	
	/**
	 * {@code used()} es un metodo abstracto obligatorio y cualquier clase de herede Transporte es obligarrio implementar.
	 * */
	public abstract void Used();

}
