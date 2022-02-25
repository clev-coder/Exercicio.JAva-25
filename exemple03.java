package br.com.generation;

import java.util.Scanner;

public class exemple03 {

	 public static void main(String[]args) {
		 
		 Scanner leia = new Scanner(System.in);
		 
		 
		 double galoes,litros;
		
		 System.out.println("Digite o valor dos galoes");
		 galoes =leia.nextDouble();
		 
		 litros = galoes *3.784;
		
		 System.out.println("Resultado sao  :"  + litros +"litros");
		 
		 leia.close();
		 }
}
