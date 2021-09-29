programa
{
	
	funcao inicio()
	{
		inteiro vetor[10]
		inteiro x=0 , soma=0 , maior=0 ,contador=0,total=0
		real media=0.00
		para (x=0;x<10;x++){
			escreva("Digite um valor de 1-6: ")
			leia(vetor[x])
			total=total+vetor[x]
			soma=soma+vetor[x]
			se(vetor[x] > maior){
			maior=vetor[x]	
			
			}
			
			
		}
		para(x=0;x<10;x++){
				se(vetor[x]==maior){
				contador++
				}
			}
		media=(soma/x)
		escreva("\nA média dos valores foi: "+media)
		escreva("\nA a quantidade de lançamentos foi: "+total)
		escreva("\nO maior valor foi: "+maior+" e se repetiu "+contador+" vezes")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */