package br.com.generation;
import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		double custo,distrib,valorFinal;
		
		System.out.println("Digite o valor de custo do ve�culo");
		custo=leia.nextDouble();
		
		distrib=custo+(custo*0.28);
        valorFinal=distrib+(distrib*0.45);
        System.out.println("O valor de custo do ve�culo para o consumidor � de:R$" + valorFinal);
        
        
        
        leia.close();

	}
}