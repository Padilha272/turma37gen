programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro nota=0 
		real x=1.00 , n=0.00, soma=0.00  
		real  media=0.00

		escreva("Nome do aluno:")
		leia(nome)
		escreva("Digite o número de notas:")
		leia(n)
		para( x=1.00; x<=n ; x++) {
		escreva("Digite a ",+x+"° nota:")
		leia(nota)
		soma = soma + nota	
		}
		media = (soma / n)
		escreva(" A sua média foi: "+media)
	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 80; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */