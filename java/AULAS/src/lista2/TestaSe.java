package lista2;

import java.util.Scanner;

public class TestaSe {
	
	
	public static void main (String[] args) {
	double p=0 , e=0 , m=0;
	
	Scanner leia = new Scanner(System.in);
	System.out.print("Por favor, digite o peso do tomate em quilogramas:");
	p = leia.nextDouble();
	if(p<=0){
		System.out.print("Digite voc� digitou um valor incorreto");
	}
	 else if  (p>50){
		e=p-50;
		m=(e*4.00);
		System.out.print("O peso do tomate supera 50 quilogramas, o peso excedente � de " + e + " quilogramas e o valor da multa � de " + m +"R$");
	}
	 else {
		e=0;
		m=0;
		System.out.print("O peso do tomate n�o supera 50 quilogramas, o peso excedente � de "+ e +" quilogramas e o valor da multa � de " +m+"R$");
	}
	
	
	}
	
	
}
