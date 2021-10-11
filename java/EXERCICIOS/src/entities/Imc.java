package entities;

public class Imc {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	private double valor;
	
	
	
	//Construtor
	public Imc(String nome, int idade, double altura, double peso, double valor) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.valor = valor;
	}
	
	
	
	//Encapsulamento



	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
	public void calculo(double peso,double altura) {
		
		if((peso <= 0) || (altura <=0) ) {
			
			System.out.println("Por favor, digite um valor válido");
		}
		
		else {
			
			valor = peso/(altura*altura);
			
			
			if(valor<18.5) {
				
				
				System.out.println("Você está diagnosticado com magreza");
				
			}
			
			else if(valor>=18.5 && valor<=24.9) {
				
				System.out.println("Seu IMC é igual a: "+valor);
				System.out.println("Você está com seu peso ideal!");
				
				
			}
			
			else if(valor>=25 && valor <=29) {
				
				System.out.println("Seu IMC é igual a: "+valor);
				System.out.println("Você está com sobrepeso");
				
			}
			
			else if(valor>=30 && valor<=39.9) {
				System.out.println("Seu IMC é igual a: "+valor);
				System.out.println("Você está diagnosticado com obesidade I");
			}
			
			else {
				System.out.println("Seu IMC é igual a: "+valor);
				System.out.println("Você está diagnosticado com obesidade II");
				
			}
		}
		
		
		
	}






	
	
	
	
	
	

	
	
}
