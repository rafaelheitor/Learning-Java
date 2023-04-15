package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		System.out.println("Bom");
		System.out.println("dia!");

		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);

		System.out.printf("Salário: %.1f%n", 1234.5678);

		Scanner in = new Scanner(System.in);

		System.out.println("Digite a sua idade: ");
		int age = in.nextInt();
		in.nextLine();
		System.out.println("Digite o seu nome: ");
		String name = in.nextLine();

		System.out.println(" Digite o seu sobrenome: ");
		String surname = in.nextLine();

		in.close();
		System.out.printf("%s %s is %d years old", name, surname, age);
	}
}
