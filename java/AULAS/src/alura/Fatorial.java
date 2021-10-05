package alura;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i=0;
		int n=1,b=0;
		System.out.println("Digite um valor");
		b = leia.nextInt();
		for( i=1;i<=b;i++) {
			n=n*i;
		System.out.println(n);
		}
		
	}
}
