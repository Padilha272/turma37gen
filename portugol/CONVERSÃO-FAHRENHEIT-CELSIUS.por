programa
{	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real temp, valor
		cadeia nome
		escreva("Seu nome: ")
		leia(nome)
		escreva("digite sua temperatura: ")
		leia(temp)
		valor=(temp-32)/1.8
		valor= mat.arredondar(valor,2) 
		escreva ("\n Olá "+nome+", a temperatura no local onde você está é:"+  valor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 47; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */