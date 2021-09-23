programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{	
		real x1, x2 ,y1, y2 , d 
		
		escreva("Digite os valores das cordenadas para o ponto P1: ")
		escreva("\nDigite o valor de x1: ")
		leia(x1)
		escreva("Digite o valor de x2: ") 
		leia(x2)
		escreva("Digite os valores das cordenadas para o ponto P2: ")
		escreva("\nDigite o valor de y1: ")
		leia(y1)
		escreva("Digite o valor de y2: ")
		leia(y2)

		d= mat.potencia((mat.potencia((x2-x1),2) + mat.potencia((y2-y1), 2)),0.5)
		escreva("O Valor de d é igual a: " + d)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */