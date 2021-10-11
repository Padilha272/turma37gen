package app;

import java.util.Scanner;


import entities.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Pessoa maria = new Pessoa("maria",333,18);
		
		
		System.out.println(maria.getMatricula());
		
		System.out.println(maria.getNome()+" digite a sua idade: ");
		int idade=leia.nextInt();
		
		maria.voto(idade);
	}

}
