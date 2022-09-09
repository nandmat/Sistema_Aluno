package br.stackx.sistema;

public class Principal {

	public static void main(String[] args) {
		
		FormAluno formulario = new FormAluno();
		Relatorio relatorio = new Relatorio();
		
		Aluno aluno1 = formulario.criar();
		Aluno aluno2 = formulario.criar();
		Aluno aluno3 = formulario.criar();
		
		relatorio.adicionarAluno(aluno1);
		relatorio.adicionarAluno(aluno2);
		relatorio.adicionarAluno(aluno3);
		
		relatorio.imprimirDados();
		relatorio.imprimirSomatorioMedia();
		relatorio.imprimirMediaGeral();
	}

}
