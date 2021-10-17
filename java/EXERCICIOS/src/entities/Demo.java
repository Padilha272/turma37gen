package entities;

import java.util.Date;

public class Demo{
    private int key;
    private String nome;
    private String codigo;
    private double valor;
    private int estoque;

    public Demo(String nome, String codigo, double valor, int estoque,int key){
        this.key=key;
        this.nome = nome;
        this.codigo = codigo;
        this.valor= valor;
        this.estoque = estoque;
    }
    public String getnome() {
        return nome;
    }
    public String getcodigo() {
        return codigo;
    }
    public double getvalor() {
        return valor;
    }
    public int getestoque() {
        return estoque;
    }
    public int getKey() {
        return key;
    }
	@Override
	public String toString() {
		return "Demo [produto=" + nome + ", codigo=" + codigo + ", valor=" + valor + ", estoque=" + estoque + "]";
	}
    
    

}