package entities;

public class Produto {

	public String codigo;
	public String nome;
	public double valor;
	public int estoque;
	
	public void compra(int quant) {
		 estoque = estoque- quant;
	}
	public void  coloca(int quant) {
		 estoque = estoque+quant;
	}
	
}
