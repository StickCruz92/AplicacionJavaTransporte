/**
 * 
 */
package co.com.transporte;

import java.util.ArrayList;

import java.util.Date;

import co.com.transporte.model.Avion;
import co.com.transporte.model.Bus;
import co.com.transporte.model.Integrado;
import co.com.transporte.model.Metro;
import co.com.transporte.model.Taxi;
import co.com.transporte.util.GeneralUtil;
/**
 * 
 * <h1>AplicacionJavaTransporte</h1>
 * Es un programa que nos permite 
 * visualizar el catalogo de transportes disponibles en sistema.
 * 
 * @author stick.cruz
 * @version 1.1
 * @since 2019
 * 
 * */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();
	}
	
	public static void showMenu() {

		int exit = 0;
		do {

			System.out.println("Bienvenidos al sistema de transporte online");
			System.err.println("");
			System.out.println("Selecciona la opción en sistema que desea viajas");
			System.out.println("");
			System.out.println("1. Bus");
			System.out.println("2. Taxi");
			System.out.println("3. Avion");
			System.out.println("4. Transporte Metro");
			System.out.println("0. Salir");

			//Leer la respuesta del usuario
			int entrada = GeneralUtil.validateUserResponseMenu(0, 4);

			switch (entrada) {
			case 0:
				exit = 0;
				break;

			case 1:
				System.out.println("Vamos a ver los Buses");
				showBuses();
				break;

			case 2:
				System.out.println("Vamos a ver los Taxis");
				showTaxis();
				break;

			case 3:
				System.out.println("Vamos a ver los Aviones");
				showAviones();
				break;

			case 4:
				System.out.println("Vamos a avijar en transporte Metro");
				showTransporteMetro();
				break;
				
			default:
				System.out.println();
				System.out.println("....¡¡Selecciona una opción validad!!....");
				System.out.println();
				exit = 1;
				break;
			}

		} while (exit != 0);

	}
	
	static ArrayList<Bus> buses = Bus.hacerListaBuses();;
	public static void showBuses() {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: Buses ::");
			System.out.println();
			
			for (int i = 0; i < buses.size(); i++) {
				System.out.println(i+1 +". "+ buses.get(i).getMarca() +" "+  buses.get(i).getPlaca() + " Lo usaste: " + buses.get(i).isUsed());
			}
			
			System.out.println("0. Para Regresar al menu");
			System.out.println();
			
			/*Leer usuario respuesta*/
			int respuesta = GeneralUtil.validateUserResponseMenu(0, buses.size());

			
			if (respuesta == 0) {
				exit = 0;
				showMenu();
				break;
			}
			if (respuesta > 0)  {
			Bus busSeleccionado = buses.get(respuesta-1);
			busSeleccionado.Used();
			
			}
			
		} while (exit != 0);
	}

	
	static ArrayList<Taxi> taxis = Taxi.hacerListaTaxis();
	public static void showTaxis() {
		
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: Taxis ::");
			System.out.println();
			
			for (int i = 0; i < taxis.size(); i++) {
				System.out.println(i+1 +". "+ taxis.get(i).getMarca() +" "+  taxis.get(i).getPlaca() + " Lo usaste: " + taxis.get(i).isUsed());
			}
			
			System.out.println("0. Para Regresar al menu");
			System.out.println();
			
			/*Leer usuario respuesta*/
			int respuesta = GeneralUtil.validateUserResponseMenu(0, taxis.size());

			
			if (respuesta == 0) {
				exit = 0;
				showMenu();
				break;
			}
			if (respuesta > 0)  {
			Taxi busSeleccionado = taxis.get(respuesta-1);
			busSeleccionado.Used();
			
			}
			
		} while (exit != 0);
	}
	
	static ArrayList<Avion> aviones = Avion.hacerListaAviones();
	public static void showAviones() {
		
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: Aviones ::");
			System.out.println();
			
			for (int i = 0; i < taxis.size(); i++) {
				System.out.println(i+1 +". "+ aviones.get(i).getMarca() +" "+  aviones.get(i).getPlaca() + " Lo usaste: " + aviones.get(i).isUsed());
			}
			
			System.out.println("0. Para Regresar al menu");
			System.out.println();
			
			/*Leer usuario respuesta*/
			int respuesta = GeneralUtil.validateUserResponseMenu(0, aviones.size());

			
			if (respuesta == 0) {
				exit = 0;
				showMenu();
				break;
			}
			if (respuesta > 0)  {
			Avion busSeleccionado = aviones.get(respuesta-1);
			busSeleccionado.Used();
			
			}
			
		} while (exit != 0);
	}
	
	static ArrayList<Metro> metros = Metro.hacerListaTransporteMetro();
	public static void showTransporteMetro() {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: TRANSPORTES METRO ::");
			System.out.println();
			
			for (int i = 0; i < metros.size(); i++) {
				System.out.println(i+1 +". Tipo de transporte: "+ metros.get(i).getTipo() +" N° Pasajeros: "+  metros.get(i).getNumeroPasajeros() +" Precio: "+  metros.get(i).getPrecio());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			int response = GeneralUtil.validateUserResponseMenu(0, metros.size());
			
			if(response == 0) {
				exit = 0;
				showMenu();
			}
			
			if(response > 0) {
				showTransporteIntegrado(metros.get(response-1).getIntegrado());
			}
			
			
		}while(exit !=0);
	}
	
	public static void showTransporteIntegrado(ArrayList<Integrado> integradoOfMetroSelected) {
		int exit = 1;
		
		do {
			System.out.println();
			System.out.println(":: TRANSPORTE INTEGRADO "+ integradoOfMetroSelected.get(0).getMetro().getTipo().toUpperCase() +"::");
			System.out.println();
			
			for (int i = 0; i < integradoOfMetroSelected.size(); i++) {
				System.out.println(i+1 +". "+ integradoOfMetroSelected.get(i).getMarca() +" "+  integradoOfMetroSelected.get(i).getPlaca() + " Lo usaste: " + integradoOfMetroSelected.get(i).isUsed());
			}
			
			System.out.println("0. Regresar al Menu");
			System.out.println();
			
			//Leer Respuesta usuario
			int response = GeneralUtil.validateUserResponseMenu(0, integradoOfMetroSelected.size());
			
			if(response == 0) {
				exit = 0;
			}
			
			
			if(response > 0) {
				Integrado integradoSelected = integradoOfMetroSelected.get(response-1);
				integradoSelected.setUsed(true);
				Date dateI = integradoSelected.iniciarViaje(new Date());
				
				for (int i = 0; i < 1000; i++) {
					System.out.println("..........");
				}
				
				//Termina el viaje
				integradoSelected.terminarViaje(dateI, new Date());
				System.out.println();
				System.out.println("Viste: " + integradoSelected);
				System.out.println("Por: " + integradoSelected.getTravelTime() + " minutos");
			}
		} while(exit !=0);
	}
	
}
