package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultado = new Pares<>();
		
		resultado.adicionar(1, "Joana");
		resultado.adicionar(2, "Bia");
		resultado.adicionar(3, "Ana");
		resultado.adicionar(4, "José");
		resultado.adicionar(2, "Pedro");
		
		System.out.println(resultado.getValor(1));
		System.out.println(resultado.getValor(4));
		System.out.println(resultado.getValor(2));
	}
}
