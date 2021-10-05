package alura;

import java.util.Locale;
import java.util.Scanner;

public class CodigoProduto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		String codigoProduto[] = {"X01","X02","X03"};
		String auxCodigo;
		String nomeProduto[] = {"CALÇA","CAMISA","SAIA"};
		double valores[] = {100.50, 50.75, 70.99};
		int estoque[] = {20,20,20};
		int carrinho[]= {0,0,0};
		
			System.out.println("LOJA TURMA 37");
			System.out.println();
			System.out.println("COD\tProduto\tValor\tEstoque");
		
		for(int i=0;i<3;i++) {
			
			System.out.printf("%s\t%s\t%.2f\t%d",codigoProduto[i],nomeProduto[i],valores[i],estoque[i]);
			System.out.println();
		}
		System.out.println();
		System.out.println("Digite o código que deseja comprar");
		auxCodigo = leia.next().toUpperCase();
		
		for(int i=0;i<3;i++) {
			
			System.out.printf("%s\t%s\t%.2f\t%d",codigoProduto[i],nomeProduto[i],valores[i],estoque[i]);
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
