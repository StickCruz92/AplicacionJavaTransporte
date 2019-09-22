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
 * Hereda de {@link Transporte}
 * @see Transporte
 * 
 */
public class Metro extends Transporte implements ITransporte{
	
	private int id;
	private ArrayList<Integrado> integrado;
	private int travelTime;
	private String tipo;
	
	
	public Metro(String marca, String placa, String origen, String destino, int numeroPasajeros, double precio) {
		super(marca, placa, origen, destino, numeroPasajeros, precio);
	}

	public Metro(String tipo, int numeroPasajeros, double precio) {
		super(numeroPasajeros, precio);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(int travelTime) {
		this.travelTime = travelTime;
	}

	public Metro() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Metro(int id, ArrayList<Integrado> integrado) {
		super();
		this.id = id;
		this.integrado = integrado;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<Integrado> getIntegrado() {
		return integrado;
	}

	public void setIntegrado(ArrayList<Integrado> integrado) {
		this.integrado = integrado;
	}

	
	public static ArrayList<Metro> hacerListaTransporteMetro() {
		ArrayList<Metro> transporteMetros = new ArrayList<Metro>();
		
			Metro metro = new Metro("TREN", 400, 2300);
			metro.setIntegrado(Integrado.hacerListaIntegrados(metro));
			transporteMetros.add(metro);
			
			Metro metroPlus = new Metro("METROPLUS", 2000, 40);	
			metroPlus.setIntegrado(Integrado.hacerListaIntegrados(metroPlus));
			transporteMetros.add(metroPlus);
	 
			Metro tranvia = new Metro("TRANVIA", 1500, 50);
			tranvia.setIntegrado(Integrado.hacerListaIntegrados(tranvia));
			transporteMetros.add(tranvia);

			Metro metroCable = new Metro("METRO CABLE ", 1800, 8);
			metroCable.setIntegrado(Integrado.hacerListaIntegrados(metroCable));
			transporteMetros.add(metroCable);
			
			return transporteMetros;
		
	}

	@Override
	public void Used() {
		setUsed(true);
		Date dateI = iniciarViaje(new Date());

		for (int i = 0; i < 100; i++) {
			System.out.println("....................");
		}

		/* Terminar viaje */
		terminarViaje(dateI, new Date());
		System.out.println();
		System.out.println("Termino el viaje en  : " + toString());
		System.out.println("Por :" + getTravelTime() + " horas");
		
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
	
}
