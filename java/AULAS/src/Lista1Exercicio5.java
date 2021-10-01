import java.util.Locale;
import java.util.Scanner;

public class Lista1Exercicio5 {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler  = new Scanner(System.in);
		double a=0.00,b=0.00,c=0.00;
		double media=0.00;
		System.out.println("Digite o primeiro número");
		a = ler.nextDouble() ;
		System.out.println("Digite o segundo número");
		b = ler.nextDouble() ;
		System.out.println("Digite o terceiro número");
		c = ler.nextDouble() ;
		media=((a*2)+(b*3)+(c*5))/(2+3+5);
		System.out.println("O valor da média pondera : "+media);
	}
}
