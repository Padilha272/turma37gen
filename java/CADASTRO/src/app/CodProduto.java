package app;

import java.util.Scanner;

import entities.Pessoa;
import entities.Produto;

public class CodProduto {

	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Produto prod = new Produto();
		Produto prod2 = new Produto();
		Pessoa p1 = new Pessoa();
		
		prod.codigo = "X01";
		prod.estoque= 10;
		prod.nome = "Celular";
		prod.valor=2500.00;
		
		prod2.codigo = "X02";
		prod2.estoque = 10;
		prod2.nome = "Capinha";
		prod2.valor= 50.00;


		System.out.println("Digite o seu nome: ");
		p1.nome=leia.next();
		System.out.println("1-masculino, 2-feminina, 3-neutro: ");
		char op =leia.next().charAt(0);
		
		if(op==1) {
			
			op='o';
		}
		
		else if(op==2){
			
			op='a';
		}
		
		else if(op==3) {
			
			op='e';
		}
		
		//System.out.println("Nome do produto");
		//prod.nome=leia.next();
		//System.out.println("Código");
		System.out.println(prod.codigo+"\t"+prod.nome+"\t"+prod.valor+"\t"+prod.estoque);
		
		System.out.println("Quer adcionar ou comprar ? (1-comprar/2-adcioanar");
		int opcao=leia.nextInt();
		System.out.println("digite a quantidade: ");
		int quant=leia.nextInt();
		if(opcao==1) {
			prod.compra(quant);
			System.out.println("estoque: "+prod.estoque);
		}
		if(opcao==2) {
			
			prod.coloca(quant);
			System.out.println("estoque: "+prod.estoque);
		}
				
		
	}
	
	
}
