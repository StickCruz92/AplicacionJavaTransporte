package co.com.transporte.util;

import java.util.Scanner;

public class GeneralUtil {

	private static Scanner sc;

	public static int validateUserResponseMenu(int min, int max) {
		sc = new Scanner(System.in);
		
		//Validar respuesta int
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("No ingresaste una opci�n v�lida");
			System.out.println("Intenta otra vez");
		}
		
		int response = sc.nextInt();
		
		//Validar rango de respuesta
		while(response < min || response > max) {
			//Solicitar de nuevo la respuesta
			System.out.println("No ingresaste una opci�n v�lida");
			System.out.println("Intenta otra vez");
			
			while(!sc.hasNextInt()) {
				sc.next();
				System.out.println("No ingresaste una opci�n v�lida");
				System.out.println("Intenta otra vez");
			}
			response = sc.nextInt();
		}
		System.out.println("Tu Respuesta fue: " + response + "\n");
		return response;
	}
	
}
