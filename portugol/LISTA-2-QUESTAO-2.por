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
		salario=N*10
		se (N>50){
			E=(N-50)
			salarioExtra=salario+(E*20)
			escreva("o seu salário é: ",salario," R$")
			escreva("o seu salário com o extra é: ",salarioExtra," R$")
		}
		senao{
			escreva("o seu salário é: ",salario," R$")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 50; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */