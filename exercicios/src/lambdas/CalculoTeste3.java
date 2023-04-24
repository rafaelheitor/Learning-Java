package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (a, b) -> { return a + b; };
		
		System.out.println(calculo.apply(2.0, 3.0));
		
		calculo = (a, b) -> a * b;
		System.out.println(calculo.apply(2.0, 3.0));
		
	}
}
