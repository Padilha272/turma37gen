package exercicios;

import java.util.Scanner;

public class soma {

	public static void main (String[] args) {
		
		int a =0;
		int b=0;
		int c=0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		a = leia.nextInt();
		System.out.println("Digite o produto");
		b=leia.nextInt();
		
		c = a*b;
		
		System.out.println("O produto de "+a+ " e "+b+" � igual a : "+c);
		
	}
}
