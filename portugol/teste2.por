programa
{
	
	funcao inicio()
	{
		cadeia produtos[3] = {"MOUSE","TCLADO","MONITOR"}
		cadeia codigo[3] = {"G6-0","G6-1","G6-2"}
		real valor[3] = {50.0,150.0,1500.0}
		inteiro estoque[3] = {10,20,30}
		inteiro carrinho[3]= {0,0,0}
		caracter op
		inteiro x = 0
		 escreva("Quer continuar ? s/n ")
		 leia(op)

		 se(op=='s' ou op=='S'){
		 escreva("Digite um código: (GX-x , onde x vai de 0 a 2 :")
		 leia(x)
		 escreva(produtos[x]+"\n")
		 escreva(valor[x])
		
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */