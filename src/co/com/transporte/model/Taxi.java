/**
 * 
 */
package co.com.transporte.model;

import java.util.ArrayList;
import java.util.Date;

import co.com.transporte.impl.ITransporte;
import co.com.transporte.impl.Transporte;

/**
 * @author stick
 *
 */
public class Taxi extends Transporte implements ITransporte {

	private int id;
	private int travelTime;
	
	public Taxi(String marca, String placa, String origen, String destino, int numeroPasajeros, double precio) {
		super(marca, placa, origen, destino, numeroPasajeros, precio);
	}
	
	public Taxi() {}
	
	@Override
	public String toString() {
		return "\n :: TAXI ::" + "\n Marca: " + getMarca() + "\n Placa: " + getPlaca() + "\n Origen: " + getOrigen()
				+ "\n Destino: " + getDestino() + "\n N° de Pasajeros: " + getNumeroPasajeros() + "\n Precio: "
				+ getPrecio();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(int travelTime) {
		this.travelTime = travelTime;
	}
	@Override
	public Date iniciarViaje(Date dateoI) {
		// TODO Auto-generated method stub
		return dateoI;
	}
	@Override
	public void terminarViaje(Date dateI, Date dateF) {
		if (dateF.getTime() > dateI.getTime()) {
			setTravelTime((int) (dateF.getTime() - dateI.getTime()));
		} else {
			setTravelTime(0);
		}
		
	}
	@Override
	public void Used() {
		setUsed(true);
		Date dateI = iniciarViaje(new Date());

		for (int i = 0; i < 1000; i++) {
			System.out.println("....................");
		}

		/* Terminar viaje */
		terminarViaje(dateI, new Date());
		System.out.println();
		System.out.println("Termino el viaje en Taxi : " + toString());
		System.out.println("Por :" + getTravelTime() + " horas");
		
	}
	
	public static ArrayList<Taxi> hacerListaTaxis() {
		ArrayList<Taxi> taxis = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			taxis.add(new Taxi("Marca "+i, "Placa "+i, "Origen "+i, "Destino "+i, 10*1, 1000*i));
		}
		return taxis;
	}
}
