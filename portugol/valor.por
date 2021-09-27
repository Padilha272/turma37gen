programa
{

	
	funcao inicio()
	{
		inteiro total=0,valor=0
		real media =0.00 ,x =0.00

		escreva("Digite um valor: ")
		leia(valor)
	
		
		enquanto (valor>0) {
		escreva("Digite um valor: ")
		leia(valor)
			x++
			total= total + valor		
			
		}
		media=(total/x)
		escreva("\nTotal de valores lidos: "+x)
		escreva("\nSoma dos valores lidos: "+total)
		escreva("\nA média dos valores é igual a: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 135; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */