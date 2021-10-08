package app;

import entities.Coordenador;
import entities.Funcionario;
import entities.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa jessica = new Pessoa("jessica",555);
		Funcionario pedro = new Funcionario("Pedro",222,"TI");
		Pessoa maria = new Funcionario("maria",333,"Desenvolvimento");
		Pessoa jose = new Coordenador("jose",444,"CC");
		System.out.println(jessica.getMatricula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getMatricula());
		System.out.println(jose.getMatricula());
	}

}
