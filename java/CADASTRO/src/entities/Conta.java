package entities;

public class Conta {

		//Atributos
		private int numero;
		private double saldo;
		private String cpf;
		private boolean ativa;
		
		
		//construtor
		
		public Conta(int numero,String cpf) {
			this.numero = numero;
			this.cpf=cpf;
		}
		
		
		public Conta(int numero, double saldo, String cpf, boolean ativa) {
			super();
			this.numero = numero;
			this.saldo = saldo;
			this.cpf = cpf;
			this.ativa = ativa;
		}
		
		//encapsulamento source+generate getters and setters
		

		
		
		
		public int getNumero() {
			return numero;
		}


		public void setNumero(int numero) {
			this.numero = numero;
		}


		public double getSaldo() {
			return saldo;
		}


		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}


		public String getCpf() {
			return cpf;
		}


		public void setCpf(String cpf) {
			this.cpf = cpf;
		}


		public boolean isAtiva() {
			return ativa;
		}


		public void setAtiva(boolean ativa) {
			this.ativa = ativa;
		}

		//Métodos
		public void ativaConta() {
			ativa = true;
			System.out.println("Conta ativada!");
		}
		public void debito(double valor) {
			
			saldo=saldo-valor;
			
		}
		
		
		public void credito(double valor) {
			
			saldo=saldo+valor;
		}
		
		
		
		
		
		
		
		
}
