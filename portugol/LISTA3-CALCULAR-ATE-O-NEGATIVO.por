programa
{
	//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
	//apresente no final o total do somatório, a média e o total de valores lidos.
	//O programa deve fazer as leituras dos valores enquanto o usuário estiver 
	//fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário 
	//fornecer um valor negativo.
	
	funcao inicio()
	{
		inteiro total=0,valor=0
		real media =0.00 ,x =0.00

	
		enquanto (valor>=0) {
		escreva("Digite um valor: ")
		leia(valor)
			
			se(valor>=0) {
				total += valor	
				x++	
			}
			
		}
		media=(total/x)
		escreva("\nTotal de valores lidos: "+x)
		escreva("\nSoma dos valores lidos: "+total)
		escreva("\nA média dos valores é igual a: "+media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 436; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */