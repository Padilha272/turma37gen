programa
{
	
	funcao inicio()
	{
		cadeia produtos[3] = {"MOUSE","TCLADO","MONITOR"}
		cadeia codigo[3] = {"G6-0","G6-1","G6-2"}
		real valor[3] = {50.0,150.0,1500.0}
		inteiro estoque[3] = {10,10,10}
		inteiro carrinho[3]= {0,0,0}
		caracter op
		inteiro x= 0
		
		
		
		escreva(" _____________\n")
		escreva("| $   $                           $   $ |\n")
		escreva("|   $    SISTEMA DE VENDAS ONLINE   $   |\n")
		escreva("|           37GEN COMÉRCIOS LTDA        |\n")
		escreva("|$_$_________$_$|\n")
		escreva("\n  >>  TUDO QUE VOCÊ PRECISA AQUI  <<     \n")
		escreva("\n\n")
		escreva(" _______________________________________________\n")
		escreva("|                                              |\n")
		escreva("|       > > >   TABELA DE PRODUTOS    < < <    |\n")
		escreva("|________________|\n")
		escreva("|_PRODUTOS_             |_CÓD_|_       VALOR_UNT.|    ESTOQUE|\n")
		escreva("|"+produtos[0]  +" | "+codigo[0]+ " | "+  valor[0]  +"\n")
		escreva("|"+produtos[1]  +" | "+codigo[1]+ " | "+  valor[1]  +"\n")
		escreva("|"+produtos[2]  +" | "+codigo[2]+ " | "+  valor[2]  +"\n")  
		escreva("\n--------------------------------------------------------\n")

		escreva("Quer continuar ? s/n ")
		 leia(op)
		enquanto(op=='s' ou op=='S'){
		
		 escreva("Digite um código: (G6-x , onde x vai de 0 a 2 :")
		 leia(x)
		 escreva(produtos[x]+"\n")
		 escreva(valor[x]+"\n")
		 
		 escreva("Quer continuar ? s/n ")
		leia(op)
	}

		





		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1385; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */