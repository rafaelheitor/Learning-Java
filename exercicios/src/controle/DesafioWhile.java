package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double nota = 0;
		
		double total = 0;
		int quantidadeDeNotas = 0;
		
		
		while(nota != -1) {
			System.out.println("Por favor digite uma nota ou -1 para sair");
			nota = scanner.nextDouble();
			if (nota > 10 || nota <= -1) {
				System.out.println("Digite uma nota válida");
			} else {
				total += nota;
				quantidadeDeNotas++;
			}
			
		}
		
		double media = total / quantidadeDeNotas;
		System.out.printf("A média é: %.2f", media);
		
		scanner.close();
	}
}
