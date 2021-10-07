package entities;

public class Aviao {

	
		public String modelo;
		public double peso;
		public int fabricacao;
		public String companhia;
		
		
		public int fabricacao() {
				
		return 2021-fabricacao;
		
		}
		
		public void manutencao(int i) {
			
			if(i==1) {
				System.out.println("O avião está apto para voar");
			}
			else {
				System.out.println("O avião não está pronto para voar");
			}
		}

		@Override
		public String toString() {
			return "Aviao [modelo=" + modelo + ", peso=" + peso + ", fabricacao=" + fabricacao + ", companhia="
					+ companhia + ", este modelo foi fabricado a=" + fabricacao() + " anos";
		}

		
		
}
