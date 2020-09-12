package com.organizer;



public class Organizer{


	public static void main(String[] args){
		
		Homework h = new Homework("mi tarea", 10, 10, 2020);	
		Homework h2= new Homework("mi tarea 2", 10, 11, 2021);	
	
		System.out.println(h.compareTo(h2));	
	}




}