package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {

	private Validar() {}

	public static void aluno(Aluno aluno) {
		if(aluno == null) {
			throw new IllegalArgumentException("O Aluno está nulo");
		}
		
		if(aluno.NOME == null || aluno.NOME.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.NOTA < 0 || aluno.NOTA > 10) {
			throw new NumeroForaDoIntervaloException("nota");
		}
	}
}
