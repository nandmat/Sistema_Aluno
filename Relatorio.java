package br.stackx.sistema;

public class Relatorio {
	
	private Aluno alunos[] = new Aluno[3];
	
	private int posicao = 0;
	
	public void adicionarAluno(Aluno aluno) {
		
		this.alunos[posicao] = aluno;
		posicao++;
	}
	
	public void imprimirDados() {
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i]);
		}
		
	}
	
	public void imprimirSomatorioMedia() {
		
		double totalMedia = 0;
		
		for(int i = 0; i < alunos.length; i++) {
			totalMedia = totalMedia + alunos[i].obterMedia();
		}
		
		System.out.println(String.format("SOMATÓRIO DE MÉDIA : %.2f", totalMedia));
		
	}
	
	public void imprimirMediaGeral() {
		
		double totalMedia = 0;
		
		for(int i = 0; i < alunos.length; i++) {
			totalMedia = totalMedia + alunos[i].obterMedia();
		}
		
		double mediaGeral = totalMedia / alunos.length;
		
		System.out.println(String.format("Média Geral da turma: %.2f", mediaGeral));
	}

}
