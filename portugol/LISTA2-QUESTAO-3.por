programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real valor1 , valor2, valor3,valor4
		escreva("Digite o valor de 1:")
		leia(valor1)
		escreva("Digite o valor de 2:")
		leia(valor2)
		escreva("Digite o valor de 3:")
		leia(valor3)
		escreva("Digite o valor de 4:")
		leia(valor4)

		valor1=mat.potencia(valor1,2.0)
		valor2=mat.potencia(valor2,2.0)
		valor3=mat.potencia(valor3,2.0)
		valor4=mat.potencia(valor4,2.0)
		se(valor3>=1000){
			escreva("\n  O terceiro valor é igual a: ",mat.potencia(valor3, 0.5),", e valor do seu quadrado é: ",valor3)
			
		}
		senao {
			escreva("\n  O primeiro valor é igual a: ",mat.potencia(valor1,0.5),", e valor do seu quadrado é: ",valor1)
			escreva("\n  O segundo valor é igual a: ",mat.potencia(valor2,0.5),", e valor do seu quadrado é: ",valor2)
			escreva("\n  O terceiro valor é igual a: ",mat.potencia(valor3, 0.5),", e valor do seu quadrado é: ",valor3)
			escreva("\n  O quarto valor é igual a: ",mat.potencia(valor4,0.5),", e valor do seu quadrado é: ",valor4)
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 941; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */