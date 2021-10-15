package entities;

public class Terceiro extends Funcionario{
	
	private double adicional;

	public Terceiro(String matricula, String nome, double adcional) {
		super(matricula, nome);
		this.adicional = adcional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	
	@Override
	public double calculo() {
		return (super.getHorasTrabalhas()*super.getValorHora())+this.adicional;
	}


	
	
}
