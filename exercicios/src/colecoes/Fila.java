package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//tanto add quando offer adicionando elementos na fila
		//a diferença é o comportamento quando a fila está cheia
		fila.add("Maria");
		fila.add("Jonata");
		fila.add("Guilherme");
		fila.offer("Laura");
		fila.offer("Beatriz");
		fila.offer("Ana");
		
		//peek e element retornam o próximo elemento da fila sem remover
		//a diferença é o comportamento quando a fila está vazia
		System.out.println(fila.peek()); // retorna null quando a fila está vazia
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança exceão NoShuchElement
		System.out.println(fila.element());
		
//		fila.size();
//		fila.clear();
//		fila.isEmpty();
//		fila.contains(fila);
		
		//pool e remove retornam o próximo elemento da fila e remove o elemento
		//a diferença é o comportamento quando a fila está vazia
		System.out.println(fila.poll());// retorna null
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // Lança exceão NoShuchElement
	}
}
