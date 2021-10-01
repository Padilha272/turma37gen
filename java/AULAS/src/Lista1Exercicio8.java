import java.util.Scanner;

public class Lista1Exercicio8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double custo=0.00, total=0.00;
		
		System.out.println("Digite o custo de produção:");
		custo = leia.nextDouble();
		total = custo + (custo*0.28)+(custo*0.45);
		
		System.out.println("O valor que o comprador irá pagar é: "+total);
	}
	
	
}
