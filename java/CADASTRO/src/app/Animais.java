package app;

import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class Animais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		  String aux1,aux2,aux3;
     Preguica preguica = new Preguica("Agenor ",4);	
    Cachorro cachorro = new Cachorro("Coragem ",2);
      Cavalo cavalo = new Cavalo("Spirit",3);
      
      System.out.println(cachorro.getNome());
      cachorro.emitirSom();
      System.out.println();
      cachorro.correr();
      System.out.println();
      
      
      System.out.println(cavalo.getNome());
      cavalo.emitirSom();
      System.out.println();
      cavalo.correr();
      System.out.println();
      
      System.out.println(preguica.getNome());
      preguica.emitirSom();
      System.out.println();
      preguica.correr();
      System.out.println();
      
      
    
	}

}
