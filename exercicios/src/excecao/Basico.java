package excecao;

import stream.Aluno;

public class Basico {

	public static void main(String[] args) {

		Aluno aluno1 = null;

		try {
			ImprimirNomeDoAluno(aluno1);
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("Fim");
	}

	public static void ImprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.NOME);
	}
}
