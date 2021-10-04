package lista2;

import java.util.Scanner;
//AUXILIO EMERGENCIAL = 600
//CHEFAS DE FAMILIA = DOBRO
//POR FILHO GANHA +50
//RECEBE OUTRO AUXILIO NÃO PODE RECEBER EMERGENCIAL
//NOME DA PESSOA
//SE ELA É CHEFA DE FAMILIA
//A QTDE DE FILHOS
//E SE PEGOU OUTRO AUXILIO
//MOSTRA O AUXILIO FINAL QUE A MESMA VAI RECEBER OU NÃO
//USAR O TRATAMENTO CONFORME A PESSOA SE DEFINE /O/A/E


public class Auxilo {
	
	public static void main (String[]args) {
		
		Scanner leia = new Scanner(System.in);
		String  auxilio;
		String nome;
		char pronome,c;
		int quantidadeFilho=0;
		double aux=0,total=0;
		
		
		System.out.println("Qual o seu nome? ");
		nome = leia.next();
		System.out.println("Qual o seu pronome de tratamento? ");
		pronome = leia.next().charAt(0);
		System.out.println("Quantidade de filhos?");
		quantidadeFilho= leia.nextInt();
		System.out.println("Já recebe outro auxílio ?");
		auxilio= leia.next();
		System.out.println("Você é chefe ou chefa de família?");
		c = leia.next().charAt(0);
		
		if (auxilio=="sim"){
			
			System.out.println("Me desculpe, você já recebe um auxílio");		
		}
		
		else {
			if (c == 'n'){
			total=600+quantidadeFilho*50;
			
			
			}
			
			else if(c=='s') {
			total=1200+quantidadeFilho*50;
				
				
			}
			
			
				
			}
			
			System.out.println(total);
			
			
		}
		
				
	}
	
	
	

