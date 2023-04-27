package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
//		Function<Integer, String> toBinaryString = valor -> Integer.toBinaryString(valor);
		UnaryOperator<String> reverseString = valor -> new StringBuilder(valor).reverse().toString();
		Function<String, Integer> toIntegerAgainFunction = valor -> Integer.parseInt(new StringBuilder(valor).reverse().toString(), 2);
		
		Stream<Integer> numbersStream = numbers.stream();
		
		Stream<Integer> resultado = numbersStream.map(Integer::toBinaryString).map(reverseString).map(toIntegerAgainFunction);
		
		resultado.forEach(System.out::println);
	}
}
