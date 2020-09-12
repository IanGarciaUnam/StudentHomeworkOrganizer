package com.organizer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.LinkedList;
import java.util.Collections;
public class Organizer{

private LinkedList listaDeTareas = new LinkedList<Homework>();
	public static void main(String[] args){
		
		Homework h = new Homework("mi tarea", 10, 10, 2020);	
		Homework h2= new Homework("mi tarea 2", 10, 11, 2021);	
		lista.add(h);
		lista.add(h2);
		Collections.sort(lista);
		System.out.println(lista.toString());	
	}




}