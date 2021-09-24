programa
{
	
	funcao inicio()
	{	
		inteiro idade
		escreva("Digite o valor da sua idade: ")
		leia(idade)
		
		se (idade>=5 e idade <= 7) {

				escreva("A sua categoria é infatil A!")			
		}
		senao se(idade >=8 e idade <= 11){

				escreva("A sua categoria é infantil B!")
		}
		senao se (idade >=12 e idade <=13){

				escreva("A sua categoria é juvenil A!")
			
		}
		senao se (idade >=14 e idade <= 17){

				escreva("A sua categoria é juvenil B!")
		}
		senao se (idade >18){

				escreva("A sua categoria é adulto!")
		}
		senao {
				escreva("Você não está apto para se matricular")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 597; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */