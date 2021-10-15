package entities;

public class Carrinho extends Produto {

	
	
	private int estoqueCarrinho;
	private double valorCarrinho;
	
	

	
	public Carrinho(String produto, String codigo, double valor, int estoque, int estoqueCarrinho,
			double valorCarrinho) {
		super(produto, codigo, valor, estoque);
		this.estoqueCarrinho = estoqueCarrinho;
		this.valorCarrinho = valorCarrinho;
	}

	public int getEstoqueCarrinho() {
		return estoqueCarrinho;
	}

	public void setEstoqueCarrinho(int estoqueCarrinho) {
		this.estoqueCarrinho = estoqueCarrinho;
	}

	public double getValorCarrinho() {
		return valorCarrinho;
	}

	public void setValorCarrinho(double valorCarrinho) {
		this.valorCarrinho = valorCarrinho;
	}
	
	
	public void compra(int quantidade) {
		
			this.estoqueCarrinho = quantidade;
			this.valorCarrinho = quantidade*super.valor;
			
     System.out.println("Carrinho: "+super.getProduto()+super.getCodigo()+super.getValor()+quantidade);
			
		} 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	