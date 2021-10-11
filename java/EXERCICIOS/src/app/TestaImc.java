package app;

import java.util.Scanner;

import entities.Imc;

public class TestaImc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		Imc pessoa = new Imc(null, 0, 0, 0, 0);
		String auxnome,auxidade;
		double auxaltura,auxpeso;
		int op;
		
		System.out.println("---------------");
		System.out.println("CÁLCULO DE IMC");
		
		
		do {
				System.out.println("Bom dia! qual o seu nome ?");
			auxnome=leia.next();
			pessoa.getNome();
			System.out.println("Qual a sua idade ?");
			auxidade=leia.next();
			pessoa.getIdade();
			
			System.out.println("Qual a sua altura? ");
			auxaltura=leia.nextDouble();
			pessoa.setAltura(auxaltura);
			
			System.out.println("Qual o seu peso ?");
			auxpeso=leia.nextDouble();
			pessoa.setPeso(auxpeso);
			
			pessoa.calculo(auxpeso,auxaltura );
			
			System.out.println("Gostaria de continuar ? (SIM-DIGITE 1 / NÃO-DIGITE 2");
			op = leia.nextInt();
		}while(op==1);
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
