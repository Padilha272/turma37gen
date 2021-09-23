programa
{	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{	


		real a,b,c,m
		escreva("Digite o valor da primeira nota: ")
		leia(a)
		
		escreva("Digite o valor da segunda nota: ")
		leia(b)
		
		escreva("Digite o valor da terceira nota: ")
		leia(c)
		
		m=((a*2)+(b*3)+(c*5))/(2+3+5)
		
		m= mat.arredondar(m, 2)
		
		escreva("Digite o valor da média é igual a: " + m )
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 391; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */