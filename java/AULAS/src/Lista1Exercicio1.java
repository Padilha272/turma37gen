import java.util.Scanner;

public class Lista1Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 int a=0;
		 int b=0;
		 int c=0;
		 int anos,meses,dias;
		 
		System.out.println("Digite a quantidade de anos: ");
		a = leia.nextInt();
		System.out.println("Digite a quantidade de meses: ");
		b = leia.nextInt();
		System.out.println("Digite a quantidade de dias: ");
		c = leia.nextInt();
		
		dias = (a*365)+(b*30)+c;
		
		System.out.println("A quantidade de dias é igual a "+dias);
		
		
	}

}