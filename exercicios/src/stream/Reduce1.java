package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		BinaryOperator<Integer> soma = (acumulador, atual) -> acumulador + atual;
		
		Integer total = numbers.stream().reduce(soma).get();
		System.out.println(total);

		Integer total2 = numbers.stream().reduce(0, soma);
		System.out.println(total2);
		
		//Resultado foi um Optional<Integer>
		numbers.stream().filter(n -> n > 4).reduce(soma).ifPresent(System.out::println);
	}
}
