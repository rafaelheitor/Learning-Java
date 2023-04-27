package stream;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", 7.1);
		Aluno aluno2 = new Aluno("Ana", 7.1);
		Aluno aluno3 = new Aluno("Dea", 7.1);
		Aluno aluno4 = new Aluno("Pedro", 7.1);
		Aluno aluno5 = new Aluno("Joana", 9.1);
		Aluno aluno6 = new Aluno("Maria", 6.1);
		Aluno aluno7 = new Aluno("Maurício", 10);
		Aluno aluno8 = new Aluno("Maurício", 10);

		List<Aluno> listaDeAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8);

		System.out.println("distinct...");
		listaDeAlunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/limit");
		listaDeAlunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);

		System.out.println("\ntakeWhile");
		listaDeAlunos.stream().distinct().skip(3).takeWhile(a -> a.NOTA >= 7.0).forEach(System.out::println);

		
	}
}
