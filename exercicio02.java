package br.com.generation;
import java.util.Scanner;

public class exercicio02 {

	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int anos, mes, di, D;
		anos = 365;
		mes = 30;

	  	System.out.println("Escreva sua idade (somente em dias) ");
	  	di = leia.nextInt();

		anos = di / anos;
	  	System.out.println("\nSua idade em anos �: " + anos);
	  	  	
		mes = di / mes;
	  	System.out.println("\nSua idade em meses �: " + mes);

	  	D = di;
	 	System.out.println("\nSua idade em dias �: " + D );
	 	
	 	leia.close();
	}

}

