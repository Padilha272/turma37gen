package entities;

	//Criando uma classe
public class Pessoa {
	
	//Atribui��es
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
	
	//Construtor + par�metros-Atribuir um par�metro para cada atributo
	public Pessoa (String primeiro,String meio, String ultimo) {
		
		primeiroNome = primeiro;
		ultimoNome = ultimo;
		nomesDoMeio = meio;
	}
	
	//Cria��o de m�todos
	public String getNomeCompleto() {
		
		String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
		return nomeCompleto;
	}
	*/
	
	
	
}
