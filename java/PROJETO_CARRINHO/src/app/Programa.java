package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	
	public static void main (String [] args) {
		
		Scanner leia = new Scanner(System.in);
		List <Produto> lista = new ArrayList <>();
		List <Produto> carrinho=new ArrayList<>();
		
		lista.add(new Produto("MOUSE    ","G6-0",20.00,10));
		lista.add(new Produto("TECLADO","G6-1",150.00,10));
		lista.add(new Produto("MONITOR","G6-2",1500.00,10));
		double totalCarrinho=0.00;
		
		for(Produto p : lista) {
			
			System.out.println(p.toString());
		}
		char cont = 'S';
		do {
		
		
		System.out.println("Digite o código");
		String op = leia.next().toUpperCase();
		
		for (Produto ler : lista) {
			
			if(op.equals(ler.getCodigo())) {
				System.out.println(ler.toString());
			}	
	   }
		System.out.println("Digite a quantidade");
		int aux=leia.nextInt();
		
		for(Produto tirar : lista) {
			if(op.equals(tirar.getCodigo())) {
				tirar.comprar(aux);
				tirar.compra(aux, tirar.getValor(), tirar.getEstoque());
				totalCarrinho=totalCarrinho+tirar.getValor()*aux;
				carrinho.add(new Produto(tirar.getProduto(),tirar.getCodigo(),tirar.getValor(),tirar.getEstoqueCarrinho()));
			}
		}
		
	for(Produto p : lista) {
			
			System.out.println(p.toString());
		}
	
	System.out.println();
	
	for (Produto p : carrinho) {
		
		System.out.println(p.toString());
		
		
	}
		
	
		System.out.println();
	
		System.out.println("Total do carrinho: "+totalCarrinho);
		System.out.println("Quer continuar ?");
		cont=leia.next().toUpperCase().charAt(0);
	
	
	
		} while(cont=='S');
	
	
	
		
	}
	
	
	
}
