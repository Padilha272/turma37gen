package app;

import java.util.Scanner;

import entities.Pessoa;

public class CadAmigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Instanciar
		Scanner leia = new Scanner(System.in);
		Pessoa cad1 = new Pessoa();
		//Pessoa p2= new Pessoa();
		//Pessoa p3 = new Pessoa();
		
		System.out.println("CADASTRO DE AMIGOS");
		
		System.out.println("Digite o nome do amigo");
		cad1.nome= leia.next();
		System.out.println("Digite o ano de nascimento");
		cad1.anoNascimento=leia.nextInt();
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
		
		
		System.out.println("nome: "+cad1.nome+" idade: "+cad1.calcularIdade(2021));
		System.out.println(cad1.toString());
		
		
		
		
		/*p2.nome="MARIA";
		p2.anoNascimento=1990;
		p3.nome="ED";
		p3.anoNascimento=1978;
		
		p1.nome = "EPAMINONDAS";
		p1.email= "epa@gmail.com";
		p1.pronome='o';
		p1.anoNascimento=1970;
		
		System.out.println(p1.nome);
		System.out.println(p1.nome+" sua idade é "+(2021-p1.anoNascimento));
		System.out.println(p2.nome+" sua idade é "+(2021-p2.anoNascimento));
		
		System.out.println(p1.nome+" sua idade é "+p1.calcularIdade());
		System.out.println(p1.nome+" sua idade é "+p1.calcularIdade(2030));
		System.out.println(p3.nome+"sua idade é "+p3.calcularIdade());
		*/
	}

}
