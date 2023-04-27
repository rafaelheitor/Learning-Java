package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", 7.1);
		Aluno aluno2 = new Aluno("Dea", 6.1);
		Aluno aluno3 = new Aluno("Joana", 8.1);
		Aluno aluno4 = new Aluno("Maurício", 10);
		
		List<Aluno> listaDeAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
		
		Comparator<Aluno> melhorNota = (Aluno a1, Aluno a2) -> {
			if(a1.NOTA > a2.NOTA) return 1;
			if(a1.NOTA < a2.NOTA) return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (Aluno a1, Aluno a2) -> {
			if(a1.NOTA > a2.NOTA) return -1;
			if(a1.NOTA < a2.NOTA) return 1;
			return 0;
		};
		
		System.out.println(listaDeAlunos.stream().max(melhorNota).get());
		System.out.println(listaDeAlunos.stream().min(piorNota).get());
		
		System.out.println(listaDeAlunos.stream().max(piorNota).get());
		System.out.println(listaDeAlunos.stream().min(melhorNota).get());
		
	}
}
