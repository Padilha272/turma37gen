programa
{
	
	funcao inicio()
	{
		inteiro n1[4][6]
		inteiro n2[4][6]
		inteiro soma[4][6]
		inteiro sub [4][6]
		inteiro x =0 , y=0

		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				escreva("Digite um valor para a primeira matriz: ")
				leia (n1[x][y])
			}
		}
		escreva("\n")
		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				escreva(n1[x][y]+" ")
			}
			escreva("\n")
		}
		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				escreva("Digite um valor para a segunda matriz: ")
				leia (n2[x][y])
			}
		}
		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				escreva(n2[x][y]+" ")
			}
			escreva("\n")
		}

		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				soma [x][y]=( n1[x][y] + n2[x][y] )
			}
		}


		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				sub [x][y]=( n1[x][y] - n2[x][y] )
			}
		}
		escreva("\n")
		escreva("\nMatriz soma: \n")
		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				
				escreva(soma[x][y]+" ")
			}
			
			escreva("\n")
		}
		escreva("\n-------------------")
		escreva("\nMatriz diferença: \n")
		
		para (x=0;x<4;x++){
			para (y=0;y<6;y++){
				
				escreva(sub[x][y]+" ")
			}
			escreva("\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 838; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */