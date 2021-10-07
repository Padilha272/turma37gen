package app;

import java.util.Scanner;

import entities.Cliente;

public class Exercicio1 {

	public static void main(String[]args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente individuo = new Cliente();
		
		System.out.println("CADASTRO DO CLIENTE");
		System.out.println("Digite o seu nome: ");
		individuo.nome=leia.next().toUpperCase();
		System.out.println("Digite o seu CPF: ");
		individuo.cpf=leia.next();
		System.out.println("Digite a sua nacionalidade: ");
		individuo.nacionalidade=leia.next().toUpperCase();
		System.out.println("Digite seu ano de nascimento: ");
		individuo.nascimento=leia.nextInt();
		System.out.println("Estado Civil");
		individuo.estadoCivil=leia.next().toUpperCase();
		
		
		System.out.println(individuo.toString());
		
	}
}
