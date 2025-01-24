package com.generation;

import java.util.Scanner; //Se importó el Scanner
//El programa nos permite recrear el juego de piedras, papel o tijera
public class Codigo4 {
public static void main(String[] args) { // Se creó el método main
	

    Scanner s = new Scanner(System.in); //Se agregó el System.in en el parámetro
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
    
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //Scanner s2 = new Scanner(System.in); //No es necesario tener 2 Scanner
    String j2 = s.nextLine();
    
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 .equals("tijeras")) {//se cambió el == por equals
            g = 1;
          }
          break; //Se agregó el break para salir del switch
        case "papel":
          if (j2 .equals("piedra")) { //se cambió el == por equals
            g = 1;
          }// Se pusó la llave que cierra el if
          break; //Se agregó el break para salir del switch
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
          
        default:
        	g=2; // si ninguno de los casos se cumple gana 2
      }
      System.out.println("Gana el jugador " + g);
    }
    s.close(); // Se cerró el Scanner
	
}
  
}