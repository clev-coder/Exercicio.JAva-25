package br.com.generation;
import java.util.Scanner;

import java.util.Scanner;

public class exemple04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma;
		
		System.out.println("Digite o valor de a :");
		a = leia.nextInt();
		System.out.println("Digite o valor de b :");
		b = leia.nextInt();
		
		soma = a + b;
		
		System.out.println("Resultado :"+ soma);
		
		leia.close();
		
	}

}