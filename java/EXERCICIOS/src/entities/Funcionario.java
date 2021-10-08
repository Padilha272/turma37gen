package entities;

public class Funcionario extends Pessoa {
	//Atributos
	private String departamento;
	
	//Construtor
	public Funcionario(String nome, int matricula, String departamento) {
		super(nome, matricula);
		this.departamento = departamento;
	}
	
	//Encapsulamento
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	

}
