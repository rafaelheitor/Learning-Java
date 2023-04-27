package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Ana", 7.1);
		Aluno aluno2 = new Aluno("Dea", 6.1);
		Aluno aluno3 = new Aluno("Joana", 8.1);
		Aluno aluno4 = new Aluno("Maurício", 10);

		List<Aluno> listaDeAlunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);

		Predicate<Aluno> isAprovado = aluno -> aluno.NOTA >= 7;
		Function<Aluno, Double> apenasNotas = a -> a.NOTA;

		BiFunction<Media, Double, Media> calcMedia = (media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

		Media mediaSala = listaDeAlunos.stream().filter(isAprovado).map(apenasNotas).reduce(new Media(), calcMedia, combinarMedia);
	
		System.out.println("A média dos aprovados da sala é: " + mediaSala.getValor());
	}
}
