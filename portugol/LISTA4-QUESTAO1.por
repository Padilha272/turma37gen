programa
{
	//1-Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma 
	//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. 
	real vetor[5]
	inteiro x=0 , cont=0
	real media =0.00 ,soma=0.0 , maior=0.00
	
	funcao inicio()
	{
		para(x=0 ; x<5 ;x++)
		{
			escreva("Digite um valor: ")
			leia(vetor[x])
			soma = soma + vetor[x]
			se(vetor[x]>maior){
				maior=vetor[x]
			}
		}
		para(x=0 ; x<5 ; x++){
			escreva("["+vetor[x]+"] ")
			se(vetor[x]==maior){
				cont++
			}
		}
		media=(soma/x)
          escreva("\nA média das notas é: "+media)
          escreva("\nA maior nota é: "+maior+" e se repetiu "+cont+" vezes")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 654; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */