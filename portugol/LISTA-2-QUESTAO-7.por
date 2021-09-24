programa
{
	inclua biblioteca Matematica -->mat
	
	funcao inicio()
	{
		real base, altura , area
		escreva("Digite o valor da altura em metros ")
		leia(altura)
		escreva("Digite o valor da base em metros ")
		leia(base)

		se(altura >0 e base>0){

			area=mat.arredondar(((base*altura)/2),2)
			escreva("O valor da área é: ",area," metros quadrados")
		}
		senao{

			escreva("Verifique se você não digitou algum dado errado de área ou de altura")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 351; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */