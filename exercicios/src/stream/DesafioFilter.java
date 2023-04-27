package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DesafioFilter {

	public static void main(String[] args) {
		Produto notebook = new Produto("Samsung Book", 3500.00, "Eletrônicos", "Samsung");
		Produto galaxy = new Produto("Galaxy S21", 5000.00, "Eletrônicos", "Samsung");
		Produto iphone = new Produto("Iphone", 3500.00, "Eletrônicos", "Apple");
		Produto ipad = new Produto("Apple Ipad", 3500.00, "Eletrônicos", "Apple");
		Produto macbook = new Produto("Macbook Pro", 10000.00, "Eletrônicos", "Apple");
		Produto geladeira = new Produto("Brastemp Frost free", 2000.00, "Eletro", "Apple");
		Produto roupa = new Produto("Conjunto kimetsu no yaiba", 100.00, "Moda", "C&A");
		
		List<Produto> listaDeProdutos = Arrays.asList(notebook, galaxy, iphone, ipad, macbook, geladeira, roupa);
		Predicate<Produto> isEletronico = produto -> produto.categoria.equals("Eletrônicos");
		Predicate<Produto> isSamsung = produto -> produto.fabricante.equals("Samsung");
		
		Stream<Produto> eletronicos = listaDeProdutos.stream().filter(isEletronico);
		Stream<Produto> aparelhosSamsung = listaDeProdutos.stream().filter(isEletronico).filter(isSamsung);
		Function<Produto, String> mapProdutos = produto -> String.format("%s %.2f %s %s ", produto.nome, produto.preco, produto.fabricante, produto.categoria);
		
		System.out.println("Primeiro filter utilizando apenas o Predicate isEletronico\n");
		eletronicos.map(mapProdutos).forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Segundo filter encadeando o Predicate isEletronico com o Predicate isSamsung\n");
		aparelhosSamsung.map(mapProdutos).forEach(System.out::println);
		
	}
}
