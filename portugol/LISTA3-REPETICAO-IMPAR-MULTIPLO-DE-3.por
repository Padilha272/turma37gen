programa
{
	
	funcao inicio()
	{
		inteiro numero=0 , quantidade=0 ,x=0 ,soma=0, total=0

		escreva("Digite a quantidade de números que você gostaria de estudar(começando com o número 1): ")
		leia(quantidade)
		para (x=1;x <=quantidade;x++ ){

		se ((x%2!=0) e (x%3==0)){
			soma = soma + x  
				
		}
		}
		escreva("A soma é : " + soma)	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */