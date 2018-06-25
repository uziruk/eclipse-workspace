package com.utn.controlador;

import java.util.Scanner;

public class Corredor {//empieza clase
	
	
		public int size; //cantidad
		public String[] nombre; // nombres.. sseguro?
		public int[] tiempo; //velocidades en tiempo o tiempo en minmutos???
		
		
		//metodo que carga vectores
		public void cargoVector(int size) {
			Scanner scanner = new Scanner(System.in);
			
			
			//felixibilizar largo de los vectores
			this.nombre = new String[size];
			this.tiempo = new int[size];
			
			
			//for loop que carga
			for(int i=0;  i<nombre.length; i++) {
				System.out.println("Ingrese el nombre del corredor numero " + (i+1) + ": ");
				this.nombre[i] = scanner.nextLine();
				System.out.println("ingrese su tiempo en segundos: ");
				this.tiempo[i] = scanner.nextInt();
				scanner.nextLine();
			
			}//end loop
			
			
		}// end method
		
		
		
		//metodo que recorre los vectres y dice cual es el mas rapido
		public void elMasRapido(String[] nombre, int[] tiempo) {
			
			
			//declaracion e inicializacion de variables
			int tiempoMin = 1000;
			int posMasRap = 0;
			
			
			//for loop que recorre el vector
			for(int i=0; i<tiempo.length; i++){
				
				
				//condicional de la modificacion del menor tiempo
				if(tiempo[i]<tiempoMin) {
					
					tiempoMin = tiempo[i];
					posMasRap = i;
					
				}else {
			
					//mirar
				
				
				}//fin del if
			
			
			}//fin del for	
			
			
			//system out final	
			System.out.println("El corredor mas rapido es " + nombre[posMasRap] + " con un tiempo de: " + tiempo[posMasRap] + " segundos.");
			
		}//fin del metodo
			
	
		
}//end calss
