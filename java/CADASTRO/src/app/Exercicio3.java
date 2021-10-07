package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Eletronico;

public class Exercicio3 {
	
	
	public static void main(String[]args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Eletronico aparelho = new Eletronico();
		
		
		System.out.println("Digite o modelo do aparelho: ");
		aparelho.modelo=leia.next();
		System.out.println("Digite a marca do aparelho: ");
		aparelho.marca=leia.next();
		System.out.println("Digite a capacidade do aparelho: ");
		aparelho.capacidade=leia.nextInt();
		System.out.println("Digite o valor do aparelho: ");
		aparelho.valor=leia.nextDouble();
		
		System.out.println(aparelho.toString());
		
	}
	
	

}
