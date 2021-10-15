package entities;

public abstract class Conta {

	private int numero;
	private String cpf;
	private double saldo;
	private boolean ativo;
	public Conta(int numero, String cpf) {
		super();
		this.numero = numero;
		this.cpf = cpf;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSaldo() {
		return saldo;
	}
	/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	*/
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	//Metodos
	public void ativarConta() {
		this.ativo = true;
		
	}
	
	public void  credito(double valor) {
		if(valor <=0) {
			System.out.println("imposs�vel realizar");
		}
		else
		this.saldo = this.saldo + valor;
		
	}
	
	public void debito (double valor ) {
		if(valor<=0) {
			System.out.println("IMPOSS�VEL REALIZAR");
		}
		else if(valor>saldo) {
			System.out.println("SALDO INDISPON�VEL");
		}
	else if(saldo >= valor) {
		this.saldo = this.saldo - valor;
		System.out.println("OPERA��O REALIZADA COM SUCESSO");
		}
	}
	
}
