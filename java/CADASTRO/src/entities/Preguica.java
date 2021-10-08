package entities;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade);
		// TODO Auto-generated constructor stub
	}

	
	
	public void subir() {
		
		System.out.println("Subiu, e dormiu.");
	}
	
	@Override
	public void correr() {
		
		System.out.println("Correndo(Bem devagar)");
		
	}
	
	@Override
	public void emitirSom() {
		 System.out.print("zzzzzzzzz"); 
	}
	
	
}
