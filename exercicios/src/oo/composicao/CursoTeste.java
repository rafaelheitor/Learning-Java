package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Matheus");
		Aluno aluno3 = new Aluno("Veronica");
		Aluno aluno4 = new Aluno("Jaime");

		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Python");
		Curso curso3 = new Curso("React");
		Curso curso4 = new Curso("Angular");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno3);

		curso3.adicionarAluno(aluno1);
		curso3.adicionarAluno(aluno4);

		aluno1.adicionarCurso(curso4);
		aluno2.adicionarCurso(curso4);
		aluno3.adicionarCurso(curso4);
		aluno4.adicionarCurso(curso4);

		for (Aluno aluno : curso1.alunos) {
			System.out.printf("Curso %s aluno %s\n", curso1.nome, aluno.nome);
		}

		for (Aluno aluno : curso2.alunos) {
			System.out.printf("Curso %s aluno %s\n", curso2.nome, aluno.nome);
		}

		for (Aluno aluno : curso3.alunos) {
			System.out.printf("Curso %s aluno %s\n", curso3.nome, aluno.nome);
		}

		for (Aluno aluno : curso4.alunos) {
			System.out.printf("Curso %s aluno %s\n", curso4.nome, aluno.nome);
		}

		System.out.println(aluno1.cursos.get(0).alunos);
	}
}
