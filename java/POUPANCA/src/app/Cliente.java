package app;

import java.util.Scanner;

import entities.Poupanca;

public class Cliente {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero;
		String cpf;
		int diaAniversarioConta;
		char op;
		double valor;
		int auxDia;
		System.out.println("Digite o número da conta: ");
		numero=leia.nextInt();
		System.out.println("Digite o CPF do cliente: ");
		cpf=leia.next();
		System.out.println("Digite o dia de aniversário da conta:");
		diaAniversarioConta=leia.nextInt();
		Poupanca cp1 = new Poupanca(numero,cpf,diaAniversarioConta);
		for(int x=1 ; x<=10;x++) {
			System.out.println("MOVIMENTO"+x);
			System.out.println("SALDO ATUAL CONTA R$ "+cp1.getSaldo());
			System.out.println("Digite o valor R$: ");
			valor=leia.nextDouble();
			System.out.println("Débito ou crédito ?");
			op = leia.next().toUpperCase().charAt(0);
			if(op == 'D') {
				cp1.debito(valor);
			}
			else if(op == 'C') {
				cp1.credito(valor);
			}
			else {
				System.out.println("OPÇÃO ESCOLHIDA INVÁLIDA");
			}
			System.out.println("Continua S/N");
			op = leia.next().toUpperCase().charAt(0);
			if (op=='N') {
				break;
			}
		}
		System.out.println("SALDO ATUAL R$ "+cp1.getSaldo());
		System.out.println("INFORME O DIA DE HOJE :");
		auxDia=leia.nextInt();
		cp1.correcao(auxDia);
		System.out.println("Saldo corrigido R$ "+cp1.getSaldo());
		
		System.out.println(cp1.getSaldo());
		cp1.credito(100.00);
		System.out.println(cp1.getSaldo());
		cp1.correcao(1);
		System.out.println(cp1.getSaldo());
		cp1.debito(100.06);
		System.out.println(cp1.getSaldo());
		cp1.debito(50.05);
		System.out.println(cp1.getSaldo());
	}
}
