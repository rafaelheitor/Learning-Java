package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", 7.6);
		Aluno aluno2 = new Aluno("Bia", 7.1);
		Aluno aluno3 = new Aluno("Daniel", 9.1);
		Aluno aluno4 = new Aluno("João", 5.2);
		Aluno aluno5 = new Aluno("Maria", 8.1);
		Aluno aluno6 = new Aluno("Iris", 6.8);
		Aluno aluno7 = new Aluno("Pedro", 10);
		
		List<Aluno> listaAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7);
		
		Predicate<Aluno> isAprovado = aluno -> aluno.NOTA >= 7;
		Stream<Aluno> alunosAprovados = listaAlunos.stream().filter(isAprovado);
		Function<Aluno, String> saudarAprovados = aluno -> String.format("Parabéns %s! você foi aprovado(a)!", aluno.NOME);
		Stream<String> aprovados = alunosAprovados.map(saudarAprovados);
		
		aprovados.forEach(System.out::println);
		
		listaAlunos.stream().takeWhile(isAprovado).forEach(System.out::println);
	}
}
