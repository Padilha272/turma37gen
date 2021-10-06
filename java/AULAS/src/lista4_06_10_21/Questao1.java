package lista4_06_10_21;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int vetor[]= {0,0,0,0,0};
		int numero=0;
		int maior=0;
		for(int x =0 ;x<5;x++) {
			System.out.println("Digite um número: ");
			vetor[x] = leia.nextInt();
			if(vetor[x]>maior) {
				maior=vetor[x];
			}
		}
		
		for(int x =0 ;x<5;x++) {
			System.out.print("["+vetor[x]+"]"+"\t");
		}
		
		System.out.println("\n\n"+maior);
		
	}
}
