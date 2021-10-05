package lista3_java;

import java.util.Scanner;

public class Questao2 {

	public static void main (String[]args) {
	Scanner leia = new Scanner(System.in);
	
	int num=0,par=0,impar=0;
	for(int i =0;i<=9;i++) {
		System.out.println("Digite um número");
		num = leia.nextInt();
		if(num%2==0 && num>0) {
			par++;
		}
		else if(num%2!=0 && num>0){
			impar++;
		}
		
	}
	System.out.println("Quantidade de números pares: "+par);
	System.out.println("quantidade de números ímpares: "+impar);
	
	
	}
	
}
