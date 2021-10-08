package entities;

public class Carro {
	//Atributos
	private String placa;
	private String modelo;
	private boolean ligado;
	private int anoFabricacao;
	private String fabricante;
	private int marcha;
	private double velocidade;
	
	
	//Construtor
	public Carro(String placa, String modelo, String fabricante) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	//construtor vazio/padr�o [eu n�o gostei  ed/Laiane]
	public Carro () {
		
		
	}
	
	//Encapsulamento- Seguran�a de dados
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	public void ligarCarro() {
		this.ligado=true;
	}
	public void desligarCarro() {
		this.ligado=false;
	}
	
	public void subirMarcha() {
		
		if(this.ligado && marcha<=5) {
			marcha++;
		}
		
	}
	public void descerMarcha() {
		if(this.ligado && marcha >0) {
			this.marcha--;
		}
	}
	
	public void acelerar() {
		this.velocidade++;
		
	}
	
	public void reduzir() {
		
		this.velocidade--;
	}
	
	public void freio() {
		
		if(this.velocidade > 0) {
			
			
			for (int x =0;x<this.velocidade;x++) {
				this.velocidade--;
				System.out.println("Freiando.....");
			}
		}
	}
	
	public void andarCarro() {
		
		if(this.ligado && this.velocidade==0.00 && this.marcha==0)
		subirMarcha();
		acelerar();
		acelerar();
		acelerar();
		
	}
public void pararCarro() {
		
		if(this.ligado && this.velocidade==0.00 && this.marcha==0)
		descerMarcha();// reduzir a marcha at� 1 
		reduzir();
		reduzir();
		reduzir();
		desligarCarro();
		
	}
	
}
