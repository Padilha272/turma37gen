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
		inteiro formaPagamento = 0
		real valorTotalCompra = 0.0
		real valorParcelado = 0.0
		real valorComImposto = 0.0
		real valorComDesconto = 0.0
		caracter respostaEtapaPagamento 
		caracter respostaParcelas 
		caracter proximoPasso
		caracter respostaIndecisa
		real valorComImpostoParcela =0.0
		
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
		
		se(opcao == 'S' ou opcao == 's'){
			limpa()
			escreva("\n $ $ $ VAMOS GASTAR? $ $ $\n")
			
			enquanto(opcao=='s' ou opcao=='S'){

			escreva(" ______________________________\n")
			escreva("|____>> ITENS DISPONÍVEIS <<___|\n")
			para(i=0;i<3;i++){
			escreva("\n"+codigo[i]+"\t"+produtos[i]+"\t"+valor[i]+"\t"+estoque[i])
				
			}
			escreva("\n\nDIGITE O ÚLTIMO NÚMERO DO CÓDIGO: ")
			leia(i)
			escreva(" _______________________________________________\n")
			escreva("|__COD.__|_PRODUTO__|__VALOR UNIT.__|__ESTOQUE__|\n")
			escreva("\n "+codigo[i]+"\t "+produtos[i]+"\t  R$"+valor[i]+ "\t " +estoque[i])
			escreva("\n\nDIGITE A QUANTIDADE QUE GOSTARIA COMPRAR: ")
			leia(quantidade)
		 	
		 	se(quantidade>=estoque[i]){
		 		escreva("VALOR INVÁLIDO, ESCOLHA OUTRO PRODUTO")		 		
		 	}senao {
		 		estoque[i]=estoque[i]-quantidade
		 		carrinho[i]=carrinho[i]+quantidade
		 		valorTotalCompra= valorTotalCompra+(quantidade*valor[i])
		 	}
		 	
			escreva("\nITEM ADCIONADO AO CARRINHO!")			 	
		 	escreva("\nQUER CONTINUAR COMPRANDO ? s/n ")
			leia(opcao)
			limpa()
			}
			
			
			escreva(" _____________________________________________\n")
			escreva("|______________CARRINHO DE COMPRAS____________|\n")
			
			para(i=0;i<3;i++){
				se(carrinho[i]!=0)
			escreva(" _____________________________________________\n")
			escreva("|__COD.__|_PRODUTO__|__VALOR UNIT.__|__QUANT__|\n")	
			escreva("\n "+codigo[i]+"\t"+produtos[i]+"\t\t"+valor[i]+"\t\t"+carrinho[i]+ "\n")
			}
			escreva("\n ______________________________________")
			escreva("\n|VALOR ACUMULADO NO CARRINHO:  RS "+valorTotalCompra+"|\n")
			escreva("\ncódigo " +     "produto "	 +   " valor "      +  " estoque\n ")
			para (i=0;i<3;i++){	
			escreva(" _______________________________________________\n")
			escreva("|___________PRODUTOS DISPONÍVEIS________________|\n")
			escreva("|__COD.__|_PRODUTO__|__VALOR UNIT.__|__ESTOQUE__|\n")
			escreva(codigo[i]+ "\t" +produtos[i]+ "\t"  +valor[i]+  "\t" +estoque[i]+  " \n")
			}




		valorComImposto = valorTotalCompra + (valorTotalCompra * 9)/100
		valorTotalCompra = valorComImposto
		
		escreva("\nDIGITE 1 PARA PAGAMANETO À VISTA")
		escreva("\nDIGITE 2 PARA PAGAMENTO EM CARTÃO")
		leia(formaPagamento)
		se(formaPagamento == 1){
			valorComDesconto = valorTotalCompra - (valorTotalCompra * 10)/100
			valorTotalCompra = valorComDesconto
			escreva("\nVALOR TOTAL DA SUA COMPRA: ", valorTotalCompra)
			escreva("\nDESEJA GERAR O BOLETO PARA O PAGAMENTO? ")
			leia(respostaEtapaPagamento)
			se(respostaEtapaPagamento != 's' ou respostaEtapaPagamento != 'S' ou respostaEtapaPagamento != 'n' ou respostaEtapaPagamento != 'N'){
					escreva("DESCULPE, OPÇÃO INVÁLIDA!")
			}senao se(respostaEtapaPagamento == 's' ou respostaEtapaPagamento == 'S'){
				escreva("NUMERO DO BOLETO: 365468456146846464")
				
			}senao se(respostaEtapaPagamento == 'n' ou respostaEtapaPagamento == 'N'){
				escreva("DESEJA VOLTAR AO MENU PRINCIPAL?")
				//condição
			}
		}		
		senao se(formaPagamento == 2){
			escreva("GOSTARIA DE PARCELAR?")
			leia(respostaParcelas)
			se(respostaParcelas == 's' ou respostaParcelas == 'S'){
				escreva("\nSUA COMPRA SERÁ PARCELADA EM 2X")
					valorComImpostoParcela = valorTotalCompra + (valorTotalCompra * 15)/100
					valorParcelado = valorComImpostoParcela / 2
					escreva("\nVALOR TOTAL DA SUA COMPRA: ", valorTotalCompra)
			}
			senao se(respostaParcelas != 's' ou respostaParcelas != 'S' ou respostaParcelas != 'n' ou respostaParcelas != 'N'){
					escreva("DESCULPE, OPÇÃO INVÁLIDA!")
					
			}senao se(respostaParcelas == 'n' ou respostaParcelas == 'N'){
				valorTotalCompra = valorTotalCompra + (valorTotalCompra * 10)/100
				escreva("\nVALOR TOTAL DA COMPRA: ", valorTotalCompra)
				escreva("PROSSEGUIR PARA CONLUSÃO DE PAGAMENTO E EMISSÃO DE NOTA FISCAL?")
				leia(proximoPasso)
				se(proximoPasso == 's' ou proximoPasso == 'S'){
					escreva("\nCOMPRA REALIZADA COM SUCESSO!	")
					escreva("NOTA FISCAL 2165451325156432")
				}
				senao se(proximoPasso != 's' ou proximoPasso != 'S' ou proximoPasso != 'n' ou proximoPasso != 'N'){
					escreva("\nDESCULPE, OPÇÃO INVÁLIDA!")
				}
				senao{
					escreva("\nDESEJA VOLTAR AO MENU DE COMPRAS? ")	
					leia(respostaIndecisa)
					se(respostaIndecisa == 's' ou respostaIndecisa == 's'){
						escreva("NÃO FAÇO IDEIA DO QUE FAZER AQUI!!")
					}
				}
			}
		}
	
	escreva("\nVALOR TOTAL DA COMPRA: ", valorTotalCompra)
	escreva("\nVALOR DA COMPRA COM IMPOSTO: ", valorComImposto)


			
		}
		
		senao {
			
          escreva("\n >>>  OBRIGADA PELA VISITA. VOLTE SEMPRE! <<< ")

		}

			
		}
		
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3931; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */