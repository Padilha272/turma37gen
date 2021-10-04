package lista_2_04_10_21;

import java.util.Scanner;

public class Questao2 {
	
public static void main(String[]args) {
		

		
		
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		int d;
		
		System.out.println("Digite o primeiro");
		a = leia.nextInt();
		System.out.println("Digite o segundo");
		b = leia.nextInt();
		
		System.out.println("Digite o terceiro");
		c = leia.nextInt();
		
		if(a>b) {
			d = a;
			a=b;
			b=d;
		}
		if(b>c) {
			d = b;
			b=c;
			c=d;
		}
		if(a>b) {
			d= a;
			a=b;
			b=d;
		}
		
			
		
		System.out.println(a+" "+b+" "+c);
	}
}
