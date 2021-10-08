package app;

import entities.Bicicleta;

public class ObjetoBicicleta {
	
	public static void main(String[]args) {
		
		Bicicleta bicicleta1= new Bicicleta();
		
		bicicleta1.mudarMarcha(2);
		System.out.println(bicicleta1.toString());
		
	}

}
