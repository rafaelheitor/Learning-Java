package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 > 5);
		System.out.println(3 >= 5);
		System.out.println(3 < 5);
		System.out.println(30 <= 5);

		double nota = 8.1;
		boolean bomComportamento = true;
		boolean passouNaMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouNaMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
