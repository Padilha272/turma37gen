package entities;

public class Bicicleta {

	public String modelo;
	public int velocidade=0;
	public int marcha=1;
	
	public void mudarMarcha(int novoValor) {
		marcha = novoValor;
		System.out.println("A nova marcha �:"+marcha);
	}
	
	public void aumentarVelocidade(int incremento) {
		velocidade = velocidade + incremento;
		System.out.println("A nova velocidade �: "+velocidade);
	}
	
	public void aplicarFreios(int decremento) {
		
		velocidade = velocidade- decremento;
		System.out.println("A nova velocidade �: "+velocidade);
	}
	
}
