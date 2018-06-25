package com.utn.vista;


import java.util.Scanner;

import com.utn.controlador.Corredor;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Corredor cor1 = new Corredor();
		System.out.println("por favor ingrese la cantidad de corredores: ");
		int cant = scanner.nextInt();
		cor1.cargoVector(cant);
		cor1.elMasRapido(cor1.nombre, cor1.tiempo);
	}

}
