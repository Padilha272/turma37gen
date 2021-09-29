programa
{
	//4-Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
	//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal,
	//ou seja, diagonal principal.

	
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro i=0 , j=0
		inteiro soma=0 , somadiagonal=0
		para(i=0;i<3;i++){

			para(j=0; j<3;j++) {
				escreva("Digite o valor: ")
				leia(matriz[i][j])
				
			}
			
		}
		escreva("\n")
		para(i=0;i<3;i++){

			para(j=0; j<3;j++) {
				escreva(matriz[i][j]+" ")
				soma=soma+matriz[i][j]
				se (i==j){
					somadiagonal=somadiagonal+matriz[i][j]
				}
			}
			escreva("\n")
			
		}
		escreva("\n"+soma)
		escreva("\n"+somadiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 456; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */