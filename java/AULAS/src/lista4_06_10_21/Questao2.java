package lista4_06_10_21;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int vetor[] = {0,0,0,0,0,0,0,0,0,0};
		int numero=0;
		double soma=0.0;
		int maior=0,cont=0;
		double media=0.00;
		int x=0;
		for( x=0 ; x<10;x++) {
			
			System.out.println("Digite um número de 1 a 6 : ");
			vetor[x]=leia.nextInt();
			soma = soma + vetor[x];
			if(vetor[x]>maior) {
				maior=vetor[x];
			}
			
		}
		
		
		for( x=0 ; x<10;x++) {
			
			System.out.print("\t"+vetor[x]);
			if(vetor[x]==maior) {
				cont++;
			}
		}
		System.out.println("\nA média dos valores é: "+(soma/10));
		System.out.println("O maior valor é: "+maior+ ", o valor apareceu: "+cont+" vezes");
		
	}
	
}
