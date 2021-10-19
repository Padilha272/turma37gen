package entities;

	public class Produto {
	
	private String produto;
	private String codigo;
	private double valor;
	private int estoque;
	private int estoqueCarrinho;
	private double valorCarrinho;
	
	
	//Construtor
	
	

	
	
	//Encapsulamento
	public String getProduto() {
		return produto;
	}



	public Produto(String produto, String codigo, double valor, int estoque) {
		super();
		this.produto = produto;
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
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



	public int getEstoque() {
		return estoque;
	}



	public void setEstoque(int estoque) {
		this.estoque = estoque;
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



	public void setProduto(String produto) {
		this.produto = produto;
	}



	public void comprar(int quantidade) {
		if(quantidade<=estoque && quantidade>0 && estoque>=0) {
			estoque=estoque - quantidade;
			System.out.println("Compra realizada com sucesso!");
			
			
			
			
		} else if(quantidade>estoque || quantidade <0){
			System.out.println("Desculpe, imposs�vel realizar a opera��o");
		}
		
	}


public void compra(int quantidade,double valor,int estoque) {
		
		//if(quantidade<= estoque && quantidade>0 && estoque>=0)  {
			System.out.println("OPERA��O REALIZADA COM SUCESSO");
			estoqueCarrinho = estoqueCarrinho+quantidade;
			valorCarrinho = valorCarrinho+(quantidade*valor);
			
			System.out.println(" Carrinho: " + estoqueCarrinho + "PRODUTOS " + "VALOR TOTAL DO CARRINHO " + valorCarrinho);
		//}
	
}
	
	
	
	

	@Override
	public String toString() {
		 return codigo+"\t"+produto+" \t    "+valor+"  \t      \t"+estoque;
	}



	public Integer getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	


}