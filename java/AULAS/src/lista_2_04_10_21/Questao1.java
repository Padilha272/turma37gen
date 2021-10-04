package lista_2_04_10_21;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[]args) {
		
		
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		int d=0;
		
		System.out.println("Digite o primeiro");
		a = leia.nextInt();
		if (a>=d) {
			d=a;
		}
		System.out.println("Digite o segundo");
		b = leia.nextInt();
		if (b>=d) {
			d=b;
		}
		System.out.println("Digite o terceiro");
		c = leia.nextInt();
		if (c>=d) {
			d=c;
		}
		
		
		System.out.println("O maior número é "+d);
		
		
	}
	
}
