package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> listaNomes = Arrays.asList("Jon", "Selma", "Maria");
		
		System.out.println("Usando o forEach");
		for(String nome: listaNomes) {
			System.out.println(nome);
		}
		
		System.out.println();
		
		System.out.println("Usando o Iterator");
		Iterator<String> iterator = listaNomes.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		System.out.println("Usando o Stream");
		Stream<String> stream = listaNomes.stream();
		stream.forEach(System.out::println);
	}
}
