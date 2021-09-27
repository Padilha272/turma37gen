programa
{
	
	funcao inicio()
	{
		caracter c
		real N ,E,salario,excedente,salarioExtra
		escreva("Digite o seu código: ")
		leia(c)
		escreva("Digite o seu total de horas trabalhadas: ")
		leia(N)
		
		se(N<=50) {
			salario=N*10
			escreva("O valor do sálario é: ",salario," R$")
		}
		senao {
			salario=500.00
			E=(N-50)
			salarioExtra=salario+(E*20)
			escreva("O valor do salário é: ",salario," R$")
			escreva("\nO valor do salário extra é: ", salarioExtra," R$")
			
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 32; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */