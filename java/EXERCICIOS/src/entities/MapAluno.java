package entities;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class MapAluno {
	 
	public static void main(String[] args) {
		
		
		Map<String,Aluno> mapa = new TreeMap<String,Aluno>();
		
		
		Aluno a = new Aluno("João da Silva "," JAVA ",6.8);
		Aluno b = new Aluno("Maria souza "," LINUX ",7.8);
		Aluno c = new Aluno("Renata Almeida "," SO ",8.8);
		Aluno d = new Aluno("José Nascimento "," Internet ",5.5);
		
		mapa.put("João da Silva ", a);
		mapa.put("Maria souza ", b);
		mapa.put("Renata Almeida ", c);
		mapa.put("José Nascimento ", d);
		
		System.out.println(mapa);
		System.out.println(mapa.get("Renata Almeida "));
		
		Collection<Aluno> alunos = mapa.values();
		for(Aluno e: alunos) {
			System.out.println(e);
		}
		
	}
}
