package lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimirNomeProduto = produto -> System.out.println(produto.NOME);

		Produto produto1 = new Produto("Camisa", 19.99, 0.1);
		Produto produto2 = new Produto("Bermuda", 29.99, 0.1);
		Produto produto3 = new Produto("Sandália", 19.99, 0.1);

		System.out.println("Utilizando o método accept");
		imprimirNomeProduto.accept(produto1);

		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		listaDeProdutos.add(produto1);
		listaDeProdutos.add(produto2);
		listaDeProdutos.add(produto3);

		System.out.println("Utilizando o Consumer");
		listaDeProdutos.forEach(imprimirNomeProduto);

		System.out.println("Utilizando o Method Reference...");
		listaDeProdutos.forEach(System.out::println);
		

	}
}
