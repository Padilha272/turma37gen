package lista_2_04_10_21;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual a sua idade? ");
		idade = leia.nextInt();
		if(idade<10) {
			System.out.println("Desculpe, voc� n�o se enquadra em nenhuma categoria");
		}
		else if(idade >=10 && idade <=14){
			System.out.println("A sua categoria � infatil");
		}
		else if(idade >=15 && idade <=17){
			System.out.println("A sua categoria � juvenil");
		}
		else if(idade >=18 && idade <=25){
			System.out.println("A sua categoria � adulto");
		}
		else {
			System.out.println("Desculpe, s� trabalhamos com pessoas at� 25 anos");
		}
		
	}
}
