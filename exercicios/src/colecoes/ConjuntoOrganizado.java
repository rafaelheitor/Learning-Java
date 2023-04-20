package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoOrganizado {

	public static void main(String[] args) {
//		Set<String> listaAprovados = new HashSet<String>();
		SortedSet<String> listaAprovados = new TreeSet<>();

		listaAprovados.add("Ana");
		listaAprovados.add("João");
		listaAprovados.add("Felipe");
		listaAprovados.add("Maria");
		listaAprovados.add("Lucas");
		listaAprovados.add("Jaime");

		for (String nome : listaAprovados) {
			System.out.println(nome);
		}

		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		for(Integer num: nums) {
			System.out.println(num);
		}
	}
}
