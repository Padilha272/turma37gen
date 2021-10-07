package app;

import java.util.Scanner;

import entities.Aviao;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Aviao aviao= new Aviao();
	
		System.out.println("Digite o modelo: ");
		aviao.modelo=leia.next();
		System.out.println("Digete o nome da companhia");
		aviao.companhia=leia.next();
		System.out.println("Digite o peso estimado do aviao");
		aviao.peso=leia.nextDouble();
		System.out.println("Digite o ano de fabricacao");
		aviao.fabricacao=leia.nextInt();
	
	    
	    
	   
	    		
	    System.out.println(aviao.toString());
	
	}
	
	
}
