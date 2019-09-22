/**
 * 
 */
package co.com.transporte.model;

import java.util.ArrayList;

/**
 * @author stick
 *
 */
public class Integrado extends Metro {

	private int id;
	private Metro metro;

	public Integrado(String marca, String placa, String origen, String destino, int numeroPasajeros, double precio, Metro metro) {
		super(marca, placa, origen, destino, numeroPasajeros, precio);
        this.setMetro(metro);
	}

	public Integrado() {}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public Metro getMetro() {
		return metro;
	}

	public void setMetro(Metro metro) {
		this.metro = metro;
	}

	@Override
	public String toString() {
		return "\n ::TRANSPORTE METRO "+ getMetro().getTipo().toUpperCase() +"::" +
				"\n Precio: "+ getMetro().getPrecio() + 
				"\n Número de Pasajero: "+ getMetro().getNumeroPasajeros() + 
	            "\n :: INTEGRADO ::" + 
	            "\n Origen: "+ getOrigen() + 
	            "\n Destino: " + getDestino() + 
	            "\n Marca: " + getMarca() + 
	            "\n Placa: " + getPlaca();
	}

	public static ArrayList<Integrado> hacerListaIntegrados(Metro transporteMetro) {
		ArrayList<Integrado> integrados = new ArrayList<Integrado>();
		for (int i = 1; i <= 5; i++) {
			integrados.add(new Integrado("Marca "+i, "Placa "+i, "origen "+i, "destino"+i, 10*i, 100*i, transporteMetro));
		}
		return integrados;
	}

}
