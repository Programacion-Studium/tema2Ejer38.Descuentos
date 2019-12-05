package es.Studium.Descuentos;

import java.util.Scanner;

public class Descuentos {

	public static void main(String[] args) 
	{
		int codArt, unidades;
		double precio;
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//Imprimimos por pantalla al cliente
		System.out.println("Codigo del articulo");
		//Pedimos por teclado codArt
		codArt = teclado.nextInt();
		//Imprimimos por pantalla al cliente
		System.out.println("Precio del articulo");
		//Pedimos por teclado el precio
		precio = teclado.nextDouble();
		//Imprimimos por pantalla al cliente
		System.out.println("Unidades del articulo");
		//Pedimos por teclado las unidades
		unidades = teclado.nextInt();
		teclado.close();
		if(unidades>100)
		{
			System.out.println("El subtotal a pagar es "+ (double)unidades*precio);
			System.out.println("El descuento es el 40% que son "+((double)unidades*precio)*0.4);
			System.out.println("El total es "+((double)unidades*precio)*0.6);
		}
		else if ((unidades>=25)&&(unidades<=100))
		{
			System.out.println("El subtotal a pagar es "+ (double)unidades*precio);
			System.out.println("El descuento es el 20% que son "+((double)unidades*precio)*0.2);
			System.out.println("El total es "+((double)unidades*precio)*0.8);
		}
		else if ((unidades>=10)&&(unidades<=24))
		{
			System.out.println("El subtotal a pagar es "+ (double)unidades*precio);
			System.out.println("El descuento es el 10% que son "+((double)unidades*precio)*0.1);
			System.out.println("El total es "+((double)unidades*precio)*0.9);
		}
		else if (unidades<10)
		{
			System.out.println("El subtotal a pagar es "+ (double)unidades*precio);
			System.out.println("El descuento es el o% que son "+((double)unidades*precio));
			System.out.println("El total es "+((double)unidades*precio));
		}
	}

}
