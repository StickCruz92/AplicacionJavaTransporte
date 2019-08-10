/**
 * 
 */
package com.quieroviajar;

import java.util.ArrayList;

import com.quieroviajar.model.Avion;
import com.quieroviajar.model.Bus;
import com.quieroviajar.model.Taxi;
import com.quieroviajar.util.QuieroViajarUtil;
/**
 * @author stick
 *
 */
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
			/*System.out.println("4. Noticias");
			System.out.println("5. Reporte");
			System.out.println("6. Reporte del día");*/
			System.out.println("0. Salir");

			//Leer la respuesta del usuario
			int entrada = QuieroViajarUtil.validateUserResponseMenu(0, 6);

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
/*
			case 4:
				System.out.println("Vamos a ver Noticias");
				showNoticias();
				break;
				
			case 5:
				System.out.println("Vamos a ver Reporte");
				showHacerReporte();
				exit = 1;
				break;
				
			case 6:
				System.out.println("Vamos a ver Reporte del dia");
				showHacerReporte(new Date());
				exit = 1;
				break;
             */
			default:
				System.out.println();
				System.out.println("....¡¡Selecciona una opción!!....");
				System.out.println();
				exit = 1;
				break;
			}

		} while (exit != 0);

	}
	
	static ArrayList<Bus> buses = null;
	public static void showBuses() {
		buses = Bus.hacerListaBuses();
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
			int respuesta = QuieroViajarUtil.validateUserResponseMenu(0, buses.size());

			
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

	
	static ArrayList<Taxi> taxis = null;
	public static void showTaxis() {
		taxis = Taxi.hacerListaTaxis();
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
			int respuesta = QuieroViajarUtil.validateUserResponseMenu(0, taxis.size());

			
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
	
	static ArrayList<Avion> aviones = null;
	public static void showAviones() {
		aviones = Avion.hacerListaAviones();
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
			int respuesta = QuieroViajarUtil.validateUserResponseMenu(0, aviones.size());

			
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
	
}
