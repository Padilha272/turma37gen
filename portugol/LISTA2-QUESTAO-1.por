programa
{
	
	funcao inicio()
	{
		real p , E , m

		escreva("Por favor, digite o peso do tomate em quilogramas:")
		leia(p)
		se(p<=0){
			escreva("Digite você digitou um valor incorreto")
		}
		senao se (p>50){
			E=p-50
			m=(E*4.00)
			escreva("O peso do tomate supera 50 quilogramas, o peso excedente é de " , E , " quilogramas e o valor da multa é de " , m ,"R$")
		}
		senao {
			E=0
			m=0
			escreva("O peso do tomate não supera 50 quilogramas, o peso excedente é de ", E," quilogramas e o valor da multa é de " ,m,"R$")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 194; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */