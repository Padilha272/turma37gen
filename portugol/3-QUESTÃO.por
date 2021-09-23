programa
{	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real A, B ,C,R,r,s,S , D
		escreva("Digite o valor de A: ")
		leia(A)
		escreva("Dige o valor de B: ")
		leia(B)
		escreva("Digite o valor de C: ")
		leia(C)
		r=(A+B)
		R=mat.potencia(r, 2)
		s=(B+C)	
		S=mat.potencia(s, 2)	
		D=(R+S)/2
		escreva("\n O valor de D= ",D)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */