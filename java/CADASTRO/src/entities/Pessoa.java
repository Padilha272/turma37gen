package entities;

public class Pessoa {

	// atributos // o que �, tem, ou estar
	public String nome;
	public int anoNascimento;
	public boolean viva;
	public String email;
	public char pronome;
	
	//metodo
	
	public int calcularIdade() {
		return 2021- anoNascimento;
	}
	
	public int calcularIdade(int ano) {
		return ano- anoNascimento;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", anoNascimento=" + anoNascimento + ", viva=" + viva + ", email=" + email
				+ ", pronome=" + pronome + ", calcularIdade()=" + calcularIdade() + "]";
	}
	
	
}
