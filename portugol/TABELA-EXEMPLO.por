programa
{
	
	funcao inicio()
	{
		cadeia time1="SPORT     "
		cadeia time2="SANTA CRUZ"
		cadeia time3="NÁUTICO   "
		
		caracter g='g', E='E', p='p' ,o='o' 
		inteiro x=0
		inteiro ponto1=0,ponto2=0,ponto3=0

		para (x=1; x <=3; x++) {

		escreva(time1+" g=ganhou , E=empatou , p =perdeu")
		leia(o)

		se (o==g){
			ponto1 +=3
		}
		senao se(o==E){
			ponto1 +=1
		}
		senao {
			ponto1 =ponto1+0
		}
			
		}
		escreva(time1+" -total de pontos: " +ponto1)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */