package lista4_06_10_21;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		int[][] n1  = new int [4][6];
				int[][] n2 = new int [4][6];
				int[][] soma= new int [4][6];
				int[][] sub=new int[4][6];
				int x =0 , y=0;

				for (x=0;x<4;x++){
					for (y=0;y<6;y++){
						System.out.print("Digite um valor para a primeira matriz: ");
					 (n1[x][y])=leia.nextInt();
					}
				}
				System.out.print("\n");
				for(x=0;x<4;x++){
					for (y=0;y<6;y++){
						System.out.print(n1[x][y]+" ");
					}
					System.out.print("\n");
				}
				for(x=0;x<4;x++){
					for (y=0;y<6;y++){
						System.out.print("Digite um valor para a segunda matriz: ");
						(n2[x][y])=leia.nextInt();
					}
				}
				for(x=0;x<4;x++){
					for (y=0;y<6;y++){
						System.out.print(n2[x][y]+" ");
					}
					System.out.print("\n");
				}

				for (x=0;x<4;x++){
					for (y=0;y<6;y++){
						soma [x][y]=( n1[x][y] + n2[x][y] );
					}
				}


				for (x=0;x<4;x++){
					for (y=0;y<6;y++){
						sub [x][y]=( n1[x][y] - n2[x][y] );
					}
				}
				System.out.print("\n");
				System.out.print("\nMatriz soma: \n");
				for (x=0;x<4;x++){
					for (y=0;y<6;y++){
						
						System.out.print(soma[x][y]+" ");
					}
					
					System.out.print("\n");
				}
				System.out.print("\n-------------------");
				System.out.print("\nMatriz diferença: \n");
				
				for (x=0;x<4;x++){
					for (y=0;y<6;y++){
						
						System.out.print(sub[x][y]+" ");
					}
					System.out.print("\n");
				}
		
	}
	
	
	
}
