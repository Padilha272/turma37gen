package entities;

public class Eletronico {

	
		public String modelo;
		public double valor;
		public String marca;
		public int capacidade;
		
		
		
		public double total() {
			
			return valor+(0.2*valor);
		}
		
		public double imposto (){
			return valor*0.2;
			
		}

		@Override
		public String toString() {
			return "Eletronico [modelo=" + modelo + ", valor=" + valor + ", marca=" + marca + ", capacidade="
					+ capacidade + ", valortotal()=" + total() + ", imposto()=" + imposto() + "]";
		}



		
	
	
}
