package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook", 8145.90, 0.13);

		Function<Produto, Double> produtoComDesconto = produto -> produto.PRECO * (1 - produto.DESCONTO);

		UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * 1.085 : valor;

		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;

		UnaryOperator<Double> valorArredondado = valor -> Double.parseDouble(String.format("%.2f", valor).replace(",", "."));

		Function<Double, String> apresentarValor = valor -> String.format("O valor final do produto é: R$%.2f", valor).replace(".", ",");

		String precoFinalProduto = produtoComDesconto.andThen(impostoMunicipal).andThen(frete).andThen(valorArredondado)
				.andThen(apresentarValor).apply(produto1);

		System.out.println(precoFinalProduto);
	}
}
