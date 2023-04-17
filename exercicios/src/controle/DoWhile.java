package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String texto = "";
		do {
			System.out.println("Diga algo");
			System.out.println("Quer sair?");
			texto = scanner.nextLine();
		} while(!texto.equalsIgnoreCase("sim"));

		scanner.close();
	}
}
