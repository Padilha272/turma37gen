package lista3_java;

import java.util.Scanner;

public class Questao6 {
	
	public static void main(String[]args) {
		int num =0,soma=0,cont=0;
		double media=0.0;
		Scanner leia = new Scanner(System.in);
		do {
		System.out.println("Digite um n�mero");
		num = leia.nextInt();
		
		if(num>0 && num%3==0) {
			
			soma = soma + num;
			cont++;
		}
			
		}while(num!=0);
		
		media = (soma/cont);
		System.out.println(" a m�dia dos n�meros divis�veis por 3 �:"+ media);
		
	}
	
	

}
