package app;


import java.util.Collection;
import java.util.Scanner;

import entities.Carrinho;
import entities.Produto;

public class SistemaDeVendas {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("LOJA");
		Produto p1 = new Produto("Mouse", "G0-1", 20, 10);
		Produto p2 = new Produto("TECLADO  ", "G6-1 ", 150.00 , 20);
		Produto p3 = new Produto("MONITOR ", "G6-2 ", 1500.00 , 30);
		Carrinho c1 = new Carrinho(null, null, 0, 0, 0, 0);
		int auxCompra;
		
		
		System.out.println(p1.getProduto()+" "+p1.getCodigo()+" "+p1.getValor()+" "+p1.getEstoque());
		System.out.println("Digite a quantidade: ");
		auxCompra=leia.nextInt();
		
		p1.adcionar(auxCompra);
		System.out.println(p1.getProduto()+" "+p1.getCodigo()+" "+p1.getValor()+" "+p1.getEstoque());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
