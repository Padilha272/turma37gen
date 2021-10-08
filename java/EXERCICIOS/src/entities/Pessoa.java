package entities;

	//Criando uma classe
public class Pessoa {
	
	//Atribuições
	private String nome;
	private int matricula;
	
	//Construtor
	public Pessoa (String nome,int matricula) {
		this.nome=nome;
		this.matricula=matricula;
		
	}
	
	//encapsulamento
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	
	
	
	
	
	
	//Atributos
	/*private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	
	//Construtor + parâmetros-Atribuir um parâmetro para cada atributo
	public Pessoa (String primeiro,String meio, String ultimo) {
		
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	//Criação de métodos
	public String getNomeCompleto() {
		
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
	*/
	
	
	
}
