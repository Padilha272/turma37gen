package entities;

	//Criando uma classe
public class Pessoa {
	
	//Atribui��es
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
	
	//Cria��o de m�todos
	
	public void voto(int idade) {
		if(idade >=18) {
			System.out.println("Voc� est� apto para votar");
		}
		else {
			System.out.println("Voc� ainda n�o tem idade para votar ");
		}
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
