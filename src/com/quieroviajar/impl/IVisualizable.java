package com.quieroviajar.impl;

import java.util.Date;

public interface IVisualizable {
	
	/**
	 * Este metodo capturar el tiempo exacto de inicio de visualización.
	 * 
	 * @param dateoI es un objecto {@code Date} con el tiempo de inicio exacto.
	 * @return Devuelve la fecha y hora capturada
	 * */
	Date iniciarViaje(Date dateoI);
	
	
	/**
	 * Este metodo captura el tiempo exacto de inicio y final de visualización
	 * @param dateI es un objecto {@code Date} con el tiempo de inicio exacto.
	 * @param dateF es un objecto {@code Date} con el tiempo de final exacto.
	 * */
	void terminarViaje(Date dateI, Date dateF);

}
