package entities;

public class Funcionario {

	
	private String matricula;
	private String nome;
	private int horasTrabalhas;
	private double valorHora;
	
	
	public Funcionario(String matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}


	
	
	public String getMatricula() {
		return matricula;
	}




	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public int getHorasTrabalhas() {
		return horasTrabalhas;
	}




	public void setHorasTrabalhas(int horasTrabalhas) {
		this.horasTrabalhas = horasTrabalhas;
	}




	public double getValorHora() {
		return valorHora;
	}




	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}




	public double calculo() {
		return (this.valorHora*this.horasTrabalhas);
	}

	
}
