package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;
		System.out.println(media.apply(9.1, 7.9));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) /2 ) >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado.apply(9.7, 8.1));
		
		Function<Double, String> resultado2 = resultadoMedia -> resultadoMedia >= 7 ? "Aprovado" : "Reprovado";
		System.out.println(media.andThen(resultado2).apply(7.1, 6.2));
	}
}
