programa
{
	
	funcao inicio()
	{
		cadeia produtos[3] = {"MOUSE","TECLADO","MONITOR"}
		cadeia codigo[3] = {"G6-0","G6-1","G6-2"}
		real valor[3] = {50.0,150.0,1500.0}
		inteiro estoque[3] = {10,10,10}
		inteiro carrinho[3] = {0,0,0}
		caracter opcao
		inteiro i=0,quantidade=0
		inteiro valorTotalCompra=0
		
		
		escreva(" ______________________________________________\n")
		escreva("| $   $                                  $   $ |\n")
		escreva("|   $        SISTEMA DE VENDAS ONLINE      $   |\n")
		escreva("|               37GEN COMÉRCIOS LTDA           |\n")
		escreva("|_$___$__________________________________$___$_|\n")
		escreva("\n  >>  TUDO QUE VOCÊ PRECISA AQUI  <<     \n")
		escreva("\n\n")
		escreva(" ______________________________________________\n")
		escreva("|                                              |\n")
		escreva("|       > > >   TABELA DE PRODUTOS    < < <    |\n")
		escreva("|______________________________________________|\n")
		escreva("|__PRODUTOS_____|___CÓD___|__VALOR_UNT.|ESTOQUE|\n")
		escreva("|MONITOR        |    1    |    R$ 50,00|  10   |\n")
		escreva("|TECLADO        |    2    |   R$ 150,00|  20   |\n")
		escreva("|MOUSE          |    3    |  R$ 1500,00|  30   |\n")
		escreva("|CABO USB       |    4    |    R$ 20,00|  40   |\n")
		escreva("|CARREGADOR     |    5    |    R$ 30,00|  50   |\n")
		escreva("|MOUSE PAD      |    6    |    R$ 25,00|  60   |\n")
		escreva("|FONE DE OUVIDO |    7    |    R$ 75,00|  70   |\n")
		escreva("|CASE P/NOTB    |    8    |    R$ 50,00|  80   |\n")
		escreva("|SUPORTE P/NOTB |    9    |    R$ 50,00|  90   |\n")
		escreva("|FONE DE OUVIDO |    10   |    R$ 50,00|  100  |\n")
		escreva("|_______________|_________|____________|_______|\n")
		escreva("\n\nDESEJA CONTINUAR COMPRANDO? DIGITE S OU N:")
		leia(opcao)
		
		se(opcao == 'N' ou opcao == 'n'){
			escreva("\n >>>  OBRIGADA PELA VISITA. VOLTE SEMPRE! <<< ")
			
		}
		
		senao se (opcao =='S' ou opcao == 's'){
			limpa()
			escreva("\n $ $ $ VAMOS GASTAR? $ $ $")
			
			enquanto(opcao=='s' ou opcao=='S'){
			escreva("\n\nDIGITE O ÚLTIMO NÚMERO DO CÓDIGO: ")
			leia(i)
			escreva( codigo[i]+" |"+produtos[i]+" |R$"+valor[i])
			escreva("\nDIGITE A QUANTIDADE: ")
			leia(quantidade)
		 	
		 	se(quantidade>estoque[i]){
		 		escreva("VALOR INVÁLIDO, ESCOLHA OUTRO PRODUTO")		 		
		 	}senao {
		 		estoque[i]=estoque[i]-quantidade
		 		valorTotalCompra= valorTotalCompra+(quantidade*valor[i])
		 	}
		 	
						 	
		 	escreva("\nQUER CONTINUAR COMPRANDO ? s/n ")
			leia(opcao)
			limpa()
			}
			
			}
			escreva("\n -------------------  \n")
			escreva("\n CARRINHO DE COMPRAS  \n")
			escreva("\n -------------------   \n")
			escreva("\nVALOR ACUMULADO NO CARRINHO:  RS "+valorTotalCompra+"\n")
			escreva("\ncódigo " +     "produto "	 +   " valor "      +  " estoque\n ")
			para (i=0;i<3;i++){	
			
			escreva(codigo[i]+ "  - " +produtos[i]+ " - "  +valor[i]+  " -  " +estoque[i]+  " \n")
			}
		}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */