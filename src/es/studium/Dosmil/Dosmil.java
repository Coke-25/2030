package es.studium.Dosmil;

import java.util.Scanner;

public class Dosmil 
{

	public static void main(String[] args) 
	{
		String nombre;
		int fechanaci;
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dime tu nombre:");
		nombre = teclado.next();
		System.out.println("Dime el a�o en que naciste:");
		fechanaci = teclado.nextInt();
		teclado.close();
		System.out.println("�Hola! " + nombre + ", tu edad en 2030 ser� " + (2030-fechanaci) + " a�os.");
	}

}
