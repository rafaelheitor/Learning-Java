package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro = produto -> (produto.PRECO * (1 - produto.DESCONTO)) >= 750;

		Produto produto1 = new Produto("Celular", 2000, 0.9);

		System.out.println(isCaro.test(produto1));
	}
}
