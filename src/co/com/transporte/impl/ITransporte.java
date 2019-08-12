package co.com.transporte.impl;

import java.util.Date;

/**
 * <h2>ITransporte</h2>
 * ITransporte es un interfaz.
 * 
 * @author stick
 * @version 1.1
 * @since 2019
 *
 */
public interface ITransporte {
	
	/**
	 * Este metodo capturar el tiempo exacto de inicio del viaje 
	 * 
	 * @param dateoI es un objecto {@code Date} con el tiempo de inicio exacto.
	 * @return Devuelve la fecha y hora capturada
	 * */
	Date iniciarViaje(Date dateoI);
	
	
	/**
	 * Este metodo captura el tiempo exacto de inicio y final del viaje
	 * @param dateI es un objecto {@code Date} con el tiempo de inicio exacto.
	 * @param dateF es un objecto {@code Date} con el tiempo de final exacto.
	 * */
	void terminarViaje(Date dateI, Date dateF);

}
