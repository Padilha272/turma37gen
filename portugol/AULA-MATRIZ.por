programa
{
	
	funcao inicio()
	{	
		caracter op
		cadeia agenda [24][31]
		inteiro auxDia=0, auxHora=0

		faca {
		escreva("Digite o dia do evento: ")
		leia(auxDia)
		auxDia--
		escreva("Digite a hora do evento: ")
		leia(auxHora)
		escreva("Evento: ")
		leia(agenda[auxDia][auxHora])
		escreva("Deseja continuar ? (S/N)")
		leia(op)
		}enquanto(op=='S')
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 328; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {agenda, 7, 9, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */