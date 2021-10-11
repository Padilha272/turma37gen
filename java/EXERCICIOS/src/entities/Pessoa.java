package entities;

	//Criando uma classe
public class Pessoa {
	
	//Atribuições
	private String nome;
	private int matricula;
	private int idade;
	
	
	
	//Construtor
	public Pessoa(String nome, int matricula, int string) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = string;
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



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//Criação de métodos
	
	public void voto(int idade) {
		if(idade >=18) {
			System.out.println("Você está apto para votar");
		}
		else {
			System.out.println("Você ainda não tem idade para votar ");
		}
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
