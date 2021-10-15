package entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaProduto {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Collection<String> produto = new ArrayList();
		
		produto.add("MOUSE");
		produto.add("TECLADO");
		produto.add("MONITOR");
		produto.add("CABO USB");
		produto.add("FONE DE OUVIDO");
		produto.add("CARREGADOR");
		produto.add("ADAPTADOR");
		produto.add("PELICULA");
		produto.add("CASE P/CELULAR");
		produto.add("CABO HDMI");
		
		System.out.println("Lista de produtos: "+produto);
		
		Collection<String> produto1 = new ArrayList();
		
		for(int x =0; x<4;x++) {
		System.out.println("Digite uma palavra");
		String aux=leia.next().toUpperCase();
		produto1.add(aux);
		}
		System.out.println(produto1);
		
		System.out.println("digite uma fruta ");
		String prod =leia.next().toUpperCase();
		
		if(produto1.contains(prod)) {
			System.out.println("Aqui tem "+prod);
		}else {
			System.out.println("Desculpe, não temos a fruta");
		}
		
		
		
		
		/*
		Set <Produto> conjunto = new HashSet<Produto>();
		Produto a = new Produto ("MOUSE ", "G6-0 ", 50.00 , 10);
		Produto b = new Produto ("TECLADO  ", "G6-1 ", 150.00 , 20);
		Produto c = new Produto ("MONITOR ", "G6-2 ", 1500.00 , 30);
		Produto d = new Produto ("CABO USB ", "G6-3 ", 20.00 , 40);
		Produto e = new Produto ("FONE DE OUVIDO ", "G6-4 ", 50.00 , 50);
		Produto f = new Produto ("CARREGADOR ", "G6-5 ", 30.00 , 60);
		Produto g= new Produto ("ADAPTADOR", "G6-6 ", 50.00 , 70);
		Produto h = new Produto ("PELICULA ", "G6-7 ", 20.00 , 80);
		Produto i = new Produto ("CASE P/CELULAR ", "G6-8 ", 40.00 , 90);
		Produto j = new Produto ("CABO HDMI ", "G6-9 ", 55.00 , 100);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		conjunto.add(e);
		conjunto.add(f);
		conjunto.add(g);
		conjunto.add(h);
		conjunto.add(i);
		conjunto.add(j);
		
		
		System.out.print("\n"+conjunto);
		*/
	}
}
