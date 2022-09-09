package br.stackx.sistema;

public class Aluno {
	
	private String nome;
	
	private double nota1;
	
	private double nota2;
	
	public Aluno() {}
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public double getNota1() {
		return nota1;
		}
	
	public double getNota2() {
		return nota2;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota1(double nota1) {
		if (nota1 >= 0.0 && nota1 <= 10.0) {
		this.nota1 = nota1;
		}
	}

	public void setNota2(double nota2) {
		if (nota2 >= 0.0 && nota2 <= 10.0) {
		this.nota2 = nota2;
		}
	}
	
	public double obterMedia() {
		double res = (getNota1() + getNota2()) / 2;
		
		return res;
		
	}
	
	public String toString() {
		
		String info = String.format("ALUNO: %s - NOTA 1: %.2f - NOTA 2: %.2f - MÉDIA: %.2f", getNome().toUpperCase(), getNota1(), getNota2(), obterMedia());
		
		return info;
	}
	
}
