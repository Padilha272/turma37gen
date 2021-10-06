package lista4_06_10_21;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] [] matriz = new int[3][3];
		int valor=0;	
		int soma=0;
		int total=0;
			for(int x=0;x<3;x++) {
				for(int y=0;y<3;y++){
					System.out.println("Digite um valor: ");
					matriz[x][y]=leia.nextInt();
					total=total+matriz[x][y];
					if(x==y) {
						soma=soma+matriz[x][y];
					}
				}
			}
			
			for(int x=0;x<3;x++) {
				System.out.println();
				for(int y=0;y<3;y++){
					System.out.print("["+matriz[x][y]+"]\t");
					
				}
			}
			System.out.println();
			System.out.println("Soma do total dos valores: "+total);
			System.out.println("Soma diagonal principal: "+soma);
			
	}
}
