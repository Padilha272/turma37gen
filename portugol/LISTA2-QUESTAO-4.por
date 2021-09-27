programa
{
	
	funcao inicio()
	{	
		inteiro N
		escreva("Digite um número: ")
		leia(N)

		se (N==0) {
			escreva("\nO número é neutro")
		
		}
		senao se ((N%2)==0 e N>0) {
			escreva("\nO número é par")
		 
			
		}
		senao se  ((N%2)!=0 e N > 0) {
			escreva("\nO númeoro é impar")
			
		}
		se (N>0) {
			escreva("\nO número é positivo")
		}
		senao se (N<0) {
			escreva("\nO número é negativo")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 412; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */