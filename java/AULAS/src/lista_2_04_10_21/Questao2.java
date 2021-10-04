package lista_2_04_10_21;

import java.util.Scanner;

public class Questao2 {
	
public static void main(String[]args) {
		

		
		
		Scanner leia = new Scanner(System.in);
		int a,b,c;
		int d=0,e=0,f=0;
		
		System.out.println("Digite o primeiro");
		a = leia.nextInt();
		if (a>=d) {
			d=a;
		}
		e=d;
		if(a<=e) {
			e=a;
		}
		System.out.println("Digite o segundo");
		b = leia.nextInt();
		if (b>=d) {
			d=b;
		}if(b<=e) {
			e=b;
		}
		System.out.println("Digite o terceiro");
		c = leia.nextInt();
		if (c>=d) {
			d=c;
		}
		if(c<=e) {
			e=c;
		}
		if(a<d && a>e){
			f=a;
			
		}
		if(b<d && b>e){
			f=b;
			
		}
		if(c<d && c>e){
			f=c;
			
		}
		
			
		System.out.println("O maior número é "+d);
		System.out.println("O menor número é "+e);
		System.out.println("O do meio é:"+f);
		System.out.println(e+" "+f+" "+d);
	}
}
