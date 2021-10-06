package aula_06_10_21;

import java.util.Scanner;

public class teste {
	
	public static void main(String[] args) {
	Scanner leia= new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	int numero= leia.nextInt();
	parImpar(numero);
	}
	
	
	
	
	
	public static void parImpar(int valor) {
		
		if(valor > 0 && valor%2==0) {
			System.out.println("par");
		}
		else if (valor >0 && valor%2!=0) {
			System.out.println("impar");
		}
		else {
			System.out.println("inválido");
		}
	}
	
}