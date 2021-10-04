package lista_2_04_10_21;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n=0.00 ,valor=0.00;
		
		System.out.println("Digite um número");
		n = leia.nextInt();
		
		if(n==0 & n>0) {
			
			System.out.println("O número é zero, este valor é considerado neutro");
		}
		else if(n%2!=0 && n>0) {
			valor=Math.pow(n, 2);
			System.out.println("O número é impar, o seu quadrado é igual a: "+valor);
		}
		else if(n%2==0 && n>0) {
			valor=Math.sqrt(n);
			System.out.println("O número é par, a sua raiz quadrada é igual a: "+valor);
		}
		else if(n==0){
			
			System.out.println("o Número é neutro");
		}
		else if(n<0){
			System.out.println("O número é negativo");
		}
		
	}
	
	
	
	
}
