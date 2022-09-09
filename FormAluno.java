package br.stackx.sistema;

import java.util.Scanner;

public class FormAluno {

	private Scanner in = new Scanner(System.in);
	
	public Aluno criar() {
		
		Aluno aluno = new Aluno();
		
		System.out.println("Nome do aluno: ");
		aluno.setNome(in.nextLine());
		
		System.out.println("Nota 1 do aluno: ");
		aluno.setNota1(in.nextDouble());
		
		System.out.println("Nota 2 do aluno: ");
		aluno.setNota2(in.nextDouble());
		
		in.nextLine(); // Captura o "ENTER" descartado do comando nextDouble anterior.
		
		return aluno;
		
	}
}
