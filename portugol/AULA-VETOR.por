programa
{
	real vetor[5]
	inteiro x=0
	real media =0.00 ,soma=0.0
	
	funcao inicio()
	{
		para(x=0 ; x<4 ;x++)
		{
			escreva("Digite um valor: ")
			leia(vetor[x])
			soma = soma + vetor[x]
			
		}
		para(x=0 ; x<4 ; x++){
			escreva("["+vetor[x]+"] ")
		}
		media=(soma/x)
          escreva("\nA média das notas é: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 86; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */