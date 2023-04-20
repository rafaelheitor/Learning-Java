package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("A sociedade do anel");
		livros.push("Harry Potter");
		livros.push("A guerra dos tronos");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
//		System.out.println(livros.pop());
//		System.out.println(livros.remove());
		
//		livros.size();
//		livros.clear();
//		livros.contains();
	}
}
