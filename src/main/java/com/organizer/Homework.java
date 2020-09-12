package com.organizer;

import java.util.Calendar;
import java.util.Date;


public class Homework  implements Comparable<Homework>{
	/**Descripción de la tarea**/
	private String descripcion;
	/**Date de la entrega**/
	private Date fechaEntrega;
	/**Date del día actual**/



	/**
	*COnstructor de Homework @warnings El construcctor de fecha esta depreciado
	*pero no encontré uno más sencillo para modelar mi fecha
	*@param descripcion Descripción de la tarea
 	*@param diaEntrega Dia de entrega
 	*@param mesEntrega Mes de entrega
	*@param anioEntrega año de entrega
	*/
	public Homework(String descripcion, int diaEntrega, int mesEntrega, int anioEntrega){
		fechaEntrega = new Date(anioEntrega-1900,mesEntrega-1,diaEntrega); 
		/* Date empieza a leer a partir de 1900, @warning depreciated
		ergo, solo obtenemos la diferencia entre los años  es decir para representar 2020
		1900 +x = 2020
		x= 2020-1900
		
		*/
		this.descripcion=descripcion;	
	}
	/**
	*Devuelve la fecha 
	*@return Date
	*/
	public Date getFecha(){
		return this.fechaEntrega;
	}


	public int compareTo(Homework h){
		return this.getFecha().compareTo(h.getFecha());
	}

	@Override
	public String toString(){
		return "Descripción:\n"+this.descripcion+"\n" + "Fecha de Entrega:\n" +fechaEntrega.toString();
	}


}