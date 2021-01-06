package es.studium.tema4.ejercicio6;

import java.awt.*;

public class ejercicio6 extends Frame
{
	private static final long serialVersionUID = 1L;
	List lista = new List();
	
	public ejercicio6() {
		setLayout(new FlowLayout());
		setTitle("Lista");
		
		//Guardamos las provincias en un Array
		String[] equipos = {"Baloncesto Fuenlabrada","Baskonia", "Bilbao Basket","Real Madrid", "CAI Zaragoza", "Cajasol", "Unicaja", "UCAM Murcia", "Valencia Basket"};
		//Añadimos las provincias del array a la lista mediante un ForEach
		for (String equipo : equipos)
		{
			lista.add(equipo);
		}		
		add(lista);
		
		setSize(200,150);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new ejercicio6();
	}

}
