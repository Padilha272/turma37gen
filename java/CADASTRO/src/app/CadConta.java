package app;

import java.util.Scanner;

import entities.Conta;

public class CadConta {

	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		Conta cc1 = new Conta(1,"111.111.111-11");//pedreiro		
		Conta cc2 = new Conta(2,100.00,"222.222.222-22",true);
		Conta cc3 = new Conta(3,"333.333.333-1");
		
		
		cc1.setAtiva(true);
		cc1.setCpf("111.222.333-XX");
		System.out.println("cpf docc1 apos o set "+cc1.getCpf());
		System.out.println("Ativa a conta sim ou não ?");
		char op = leia.next().toUpperCase().charAt(0);
		if (op=='S') {
			cc1.ativaConta();
		}
		
		
		System.out.println("Saldo"+cc1.getSaldo());
		System.out.println("Registrando");
		for (int x=1 ; x<=5 ; x++) {
			System.out.println("Lancamento "+x);
			System.out.println("Digite o valor R$ ");
			double auxValor = leia.nextDouble();
			System.out.println("D-débito ou C-credito :");
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
