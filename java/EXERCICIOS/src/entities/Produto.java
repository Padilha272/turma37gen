package entities;

public class Produto {
	private String produto;
	private String codigo;
	double valor;
	double estoque;
	
	//Construtor
		public Produto(String produto, String codigo, double valor, double estoque) {
		super();
		this.produto = produto;
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
	}
	
	
	public String toString() {
		
		return this.produto + this.codigo + this.valor+"  " + this.estoque;
	}


	public String getProduto() {
		return produto;
	}


	public void setProduto(String produto) {
		this.produto = produto;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public double getEstoque() {
		return estoque;
	}


	public void setEstoque(double estoque) {
		this.estoque = estoque;
	}
	
	
	
	
	
}
