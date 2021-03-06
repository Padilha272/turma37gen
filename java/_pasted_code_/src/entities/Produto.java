package entities;

	public class Produto {
	
	private String produto;
	private String codigo;
	private double valor;
	private int estoque;
	
	
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



	public void setProduto(String produto) {
		this.produto = produto;
	}



	public void comprar(int quantidade) {
		if(quantidade<=estoque && quantidade>0 && estoque>=0) {
			estoque=estoque - quantidade;
			System.out.println("Compra realizada com sucesso!");
			
			
			
			
		} else if(quantidade>estoque || quantidade <0){
			System.out.println("Desculpe, imposs?vel realizar a opera??o");
		}
		
	}



	@Override
	public String toString() {
		return "Produto [produto=" + produto + ", codigo=" + codigo + ", valor=" + valor + ", estoque=" + estoque + "]";
	}



	public Integer getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	


}