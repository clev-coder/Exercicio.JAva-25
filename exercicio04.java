package br.com.generation;
import java.util.Scanner;

public class exercicio04 {
     
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double D,R,S;
		int a,b,c;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		
		R = (a+b)^2;
		S = (b+c)^2;
		D = (R+S)/2;
		
		System.out.println("O resultado do calculo �: " + D);
		
	
		leia.close();
	}

}

