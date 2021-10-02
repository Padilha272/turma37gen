import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		int r = 0, s = 0;
		double d = 0.00;

		System.out.println("Digite o primeiro valor: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro valor: ");
		c = leia.nextInt();
		r = (int) Math.pow((a + b), 2);
		s = (int) Math.pow((b + c), 2);

		d = (r + s) / 2;

		System.out.println("O valor de D é igual a: " + d);

	}

}